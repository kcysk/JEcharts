/**
 * FileName: JScatterTest.java
 * Author:   shenke
 * Date:     2018/6/22 下午3:22
 * Descriptor:
 */
package net.zdsoft.echarts.convert;

import net.zdsoft.echarts.BaseTest;
import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.SeriesEnum;
import org.junit.Test;

/**
 * @author shenke
 * @since 2018/6/22 下午3:22
 */
public class JScatterTest extends BaseTest {

    @Test
    public void _single() {
        JData data1 = new JData();
        data1.setType(SeriesEnum.scatter);
        data1.setCoordSys(CoordinateSystem.cartesian2d);
        data1.setSelfCoordSys(true);
        data1.setEntryList(createEntryList(5, "系列1"));
        JData.JCoordSysPosition coordSysPosition1 = new JData.JCoordSysPosition();
        //coordSysPosition1.setCenter(new Object[]{"50%", "50%"});
        //data1.setCoordSysPosition(coordSysPosition1);

        Option option = new Option();
        create().next(data1, option);
        write2Html(StringUtils.toJSONString(option), "singleScatter");
    }
}
