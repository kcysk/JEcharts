/**
 * FileName: JCity.java
 * Author:   shenke
 * Date:     2018/6/22 下午6:28
 * Descriptor:
 */
package net.zdsoft.echarts;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * @author shenke
 * @since 2018/6/22 下午6:28
 */
public class JCity {

    @Test
    public void _city() throws IOException {
        InputStream cityJsonStream = this.getClass().getResourceAsStream("/geoJson/china_city.json");
        JSONReader reader = new JSONReader(new InputStreamReader(cityJsonStream));
        JSONObject cityJson = reader.readObject(JSONObject.class);
        JSONObject city = new JSONObject();
        for (Map.Entry<String, Object> entry : cityJson.entrySet()) {
            for (Map.Entry<String, Object> pEntry : ((JSONObject) entry.getValue()).entrySet()) {
                //cityBuilder.append(entry.)
                city.put(pEntry.getKey(), pEntry.getValue());
            }
        }
        //Files.readAllLines(Path.)
        FileUtils.writeStringToFile(new File("/Users/shenke/city.json"), city.toJSONString());
    }
}
