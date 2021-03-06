/**
 * FileName: JEffectSatterConvertTest.java
 * Author:   shenke
 * Date:     2018/6/22 下午5:41
 * Descriptor:
 */
package net.zdsoft.echarts.convert;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import net.zdsoft.echarts.BaseTest;
import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.SeriesEnum;
import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author shenke
 * @since 2018/6/22 下午5:41
 */
public class JEffectSatterConvertTest extends BaseTest {

    @Test
    public void _test_map() {
        JData data = new JData();
        data.setMapType("四川");
        data.setCoordSys(CoordinateSystem.geo);
        data.setEntryList(createEntryList("四川"));
        data.setSelfCoordSys(true);
        data.setType(SeriesEnum.scatter);

        Option option = new Option();
        create().next(data, option);
        option.backgroundColor("#404a59");
        write2Html(StringUtils.toJSONString(option), "effectScatter");
    }

    private List<JData.Entry> createEntryList(String provinceName) {
        InputStream cityJsonStream = this.getClass().getResourceAsStream("/geoJson/china_city.json");
        JSONReader reader = new JSONReader(new InputStreamReader(cityJsonStream));
        JSONObject cityJson = reader.readObject(JSONObject.class);

        JSONObject p = cityJson.getJSONObject(provinceName);

        Random random = new Random();
        List<JData.Entry> entryList = new ArrayList<>();
        JData.Entry entry1 = new JData.Entry();
        entry1.setName("effectScatter");
        entry1.setX("成都");
        entry1.setY(random.nextInt(200));
        entryList.add(entry1);
        return entryList;
    }
}
