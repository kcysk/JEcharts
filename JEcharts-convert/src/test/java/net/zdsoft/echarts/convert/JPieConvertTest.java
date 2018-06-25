/**
 * FileName: JPieConvertTest.java
 * Author:   shenke
 * Date:     2018/6/22 下午12:55
 * Descriptor:
 */
package net.zdsoft.echarts.convert;

import net.zdsoft.echarts.BaseTest;
import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.LeftEx;
import net.zdsoft.echarts.enu.SeriesEnum;
import org.junit.Test;

/**
 * @author shenke
 * @since 2018/6/22 下午12:55
 */
public class JPieConvertTest extends BaseTest {

    @Test
    public void _single() {
        JData data1 = new JData();
        data1.setType(SeriesEnum.pie);
        data1.setSelfCoordSys(true);
        data1.setEntryList(createEntryList(5, "系列1"));
        JData.JCoordSysPosition coordSysPosition1 = new JData.JCoordSysPosition();
        coordSysPosition1.setCenter(new Object[]{"50%", "50%"});
        data1.setCoordSysPosition(coordSysPosition1);

        Option option = new Option();
        create().next(data1, option);
        write2Html(StringUtils.toJSONString(option), "singlePie");
    }

    @Test
    public void _multi() {
        JData data1 = new JData();
        data1.setType(SeriesEnum.pie);
        data1.setSelfCoordSys(true);
        data1.setEntryList(createEntryList(1, "系列1"));
        JData.JCoordSysPosition coordSysPosition1 = new JData.JCoordSysPosition();
        coordSysPosition1.setCenter(new Object[]{"25%", "50%"});
        coordSysPosition1.setRadius(new Object[]{"50%", "75%"});
        data1.setCoordSysPosition(coordSysPosition1);

        JData data2 = new JData();
        data2.setType(SeriesEnum.pie);
        data2.setSelfCoordSys(true);
        data2.setEntryList(createEntryList(1, "系列2"));
        JData.JCoordSysPosition coordSysPosition2 = new JData.JCoordSysPosition();
        coordSysPosition2.setCenter(new Object[]{"70%", "50%"});
        coordSysPosition2.setRadius(new Object[]{"50%", "75%"});
        data2.setCoordSysPosition(coordSysPosition2);

        Option option = new Option();
        create().next(data1, option);
        create().next(data2, option);
        write2Html(StringUtils.toJSONString(option), "multiPie");
    }

    @Test
    public void _pie_line() {
        JData data1 = new JData();
        data1.setType(SeriesEnum.pie);
        data1.setSelfCoordSys(true);
        data1.setEntryList(createEntryList(1, "系列1"));
        JData.JCoordSysPosition coordSysPosition1 = new JData.JCoordSysPosition();
        coordSysPosition1.setCenter(new Object[]{"25%", "50%"});
        coordSysPosition1.setRadius(new Object[]{"50%", "75%"});
        data1.setCoordSysPosition(coordSysPosition1);

        JData data2 = new JData();
        data2.setType(SeriesEnum.line);
        data2.setSelfCoordSys(true);
        data2.setCoordSys(CoordinateSystem.cartesian2d);
        data2.setEntryList(createEntryList(5, "系列2"));
        JData.JCoordSysPosition coordSysPosition2 = new JData.JCoordSysPosition();
        coordSysPosition2.setLeft(LeftEx.create("55%"));
        data2.setCoordSysPosition(coordSysPosition2);

        Option option = new Option();
        create().next(data1, option);
        create().next(data2, option);
        write2Html(StringUtils.toJSONString(option), "pieLine");
    }

    @Test
    public void _pie_bar() {
        JData data1 = new JData();
        data1.setType(SeriesEnum.pie);
        data1.setSelfCoordSys(true);
        data1.setEntryList(createEntryList(1, "系列1"));
        JData.JCoordSysPosition coordSysPosition1 = new JData.JCoordSysPosition();
        coordSysPosition1.setCenter(new Object[]{"25%", "50%"});
        coordSysPosition1.setRadius(new Object[]{"50%", "75%"});
        data1.setCoordSysPosition(coordSysPosition1);

        JData data2 = new JData();
        data2.setType(SeriesEnum.bar);
        data2.setSelfCoordSys(true);
        data2.setCoordSys(CoordinateSystem.cartesian2d);
        data2.setEntryList(createEntryList(5, "系列2"));
        JData.JCoordSysPosition coordSysPosition2 = new JData.JCoordSysPosition();
        coordSysPosition2.setLeft(LeftEx.create("55%"));
        data2.setCoordSysPosition(coordSysPosition2);

        Option option = new Option();
        create().next(data1, option);
        create().next(data2, option);
        write2Html(StringUtils.toJSONString(option), "pieBar");
    }
}
