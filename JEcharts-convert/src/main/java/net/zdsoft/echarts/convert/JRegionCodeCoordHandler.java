package net.zdsoft.echarts.convert;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import net.zdsoft.echarts.convert.api.GeoCoordHandler;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;

/**
 * @author shenke
 * @since 2018/7/30 下午6:19
 */
public class JRegionCodeCoordHandler implements GeoCoordHandler {

    private JSONArray cityJson;
    private Boolean init = Boolean.FALSE;
    private final Object lock = new Object();

    private void init() {
        synchronized(this.lock) {
            if (this.cityJson == null) {
                InputStream cityJsonStream = this.getClass().getResourceAsStream("/area.json");
                JSONReader reader = new JSONReader(new InputStreamReader(cityJsonStream));
                this.cityJson = (JSONArray)reader.readObject(JSONArray.class);
                this.init = true;
            }

        }
    }

    @Override
    public Object[] doGeoCoords(String entryX) {
        if (!this.init) {
            this.init();
        }

        Optional optional = this.cityJson.parallelStream().filter((o) -> {
            return ((JSONObject)o).get("name").equals(entryX) || ((JSONObject)o).get("code").equals(entryX);
        }).findFirst();
        if (optional.isPresent()) {
            JSONObject val = (JSONObject)optional.get();
            return new Object[]{val.get("longitude"), val.get("latitude")};
        } else {
            return null;
        }
    }
}
