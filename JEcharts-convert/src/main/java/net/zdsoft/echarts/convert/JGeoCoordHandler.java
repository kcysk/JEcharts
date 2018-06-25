/**
 * FileName: JGeoCoordHandler.java
 * Author:   shenke
 * Date:     2018/6/22 下午4:46
 * Descriptor:
 */
package net.zdsoft.echarts.convert;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import net.zdsoft.echarts.common.Utils;
import net.zdsoft.echarts.convert.api.GeoCoordHandler;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author shenke
 * @since 2018/6/22 下午4:46
 */
public class JGeoCoordHandler implements GeoCoordHandler {

    private JSONObject cityJson ;
    private Boolean init = false;
    private final Object lock = new Object();

    private void init() {
        synchronized (lock) {
            if (cityJson == null) {
                InputStream cityJsonStream = this.getClass().getResourceAsStream("/city.json");
                JSONReader reader = new JSONReader(new InputStreamReader(cityJsonStream));
                cityJson = reader.readObject(JSONObject.class);
                init = true;
            }
        }

    }

    @Override
    public Object[] doGeoCoords(String entryX) {
        if (!init) {
            init();
        }

        JSONObject city = cityJson.getJSONObject(entryX);
        if (city != null) {
            if (city.containsKey("x")) {
                return Utils.asArray(city.get("x"), city.get("y"));
            }
        }
        return new Object[0];
    }

}
