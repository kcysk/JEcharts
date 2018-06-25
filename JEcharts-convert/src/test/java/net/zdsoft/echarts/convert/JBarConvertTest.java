/**
 * FileName: JBarConvertTest.java
 * Author:   shenke
 * Date:     2018/6/21 下午10:56
 * Descriptor:
 */
package net.zdsoft.echarts.convert;

import net.zdsoft.echarts.BaseTest;
import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvert;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.convert.api.JDataConvertChainImpl;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.LeftEx;
import net.zdsoft.echarts.enu.RightEx;
import net.zdsoft.echarts.enu.SeriesEnum;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ServiceLoader;

/**
 * @author shenke
 * @since 2018/6/21 下午10:56
 */
public class JBarConvertTest extends BaseTest {

    private Random random = new Random();

    private List<JDataConvert> converts = new ArrayList<>();

    @Before
    public void createChain() {
        ServiceLoader.load(JDataConvert.class).forEach(converts::add);
    }

    protected JDataConvertChain create() {
        JDataConvertChain chain =  new JDataConvertChainImpl();
        ((JDataConvertChainImpl) chain).setConverts(converts.toArray(new JDataConvert[0]));
        return chain;
    }

    @Test
    public void _JFunnel_test() throws CloneNotSupportedException {
        JData data = new JData();
        JData line = new JData();


        List<JData.Entry> entryList = new ArrayList<>(7);
        List<JData.Entry> entryListLine = new ArrayList<>(7);
        for (int i=1; i< 5; i++) {
            JData.Entry entry = new JData.Entry();
            entry.setName("柱状图");
            entry.setX("第" + (i+1) + "天");
            entry.setY(i * 10);
            entry.setStack("total");
            entryList.add(entry);
            JData.Entry entry1 = (JData.Entry) entry.clone();
            entry1.setName("line");
            entry1.setY(random.nextInt(50));
            entryListLine.add(entry1);
        }
        data.setType(SeriesEnum.funnel);
        data.setSelfCoordSys(true);
        data.setEntryList(entryList);
        JData.JCoordSysPosition coordSysPosition = new JData.JCoordSysPosition();
        coordSysPosition.setRight(RightEx.create("55%"));
        data.setCoordSysPosition(coordSysPosition);


        line.setType(SeriesEnum.line);
        line.setSelfCoordSys(true);
        line.setSelfXAxis(true);
        line.setSelfYAxis(true);
        line.setEntryList(entryListLine);
        line.setCoordSys(CoordinateSystem.cartesian2d);
        JData.JCoordSysPosition coordSysPositionLine = new JData.JCoordSysPosition();
        coordSysPositionLine.setLeft(LeftEx.create("55%"));
        line.setCoordSysPosition(coordSysPositionLine);


        Option option = new Option();
        create().next(data, option);
        create().next(line, option);
        write2Html(StringUtils.toJSONString(option), "JFunnel");
    }

    @Test
    public void _test() throws CloneNotSupportedException {
        JData line = new JData();
        JData data = new JData();
        data.setCoordSys(CoordinateSystem.cartesian2d);
        line.setCoordSys(CoordinateSystem.cartesian2d);
        data.setType(SeriesEnum.bar);
        line.setType(SeriesEnum.line);
        data.setSelfCoordSys(false);
        List<JData.Entry> entryList = new ArrayList<>(7);
        List<JData.Entry> entryList2 = new ArrayList<>(7);
        List<JData.Entry> entryListLine = new ArrayList<>(7);
        for (int i=0; i< 7; i++) {
            JData.Entry entry = new JData.Entry();
            entry.setName("柱状图");
            entry.setX("第" + (i+1) + "天");
            entry.setY(random.nextInt(200));
            entry.setStack("total");
            entryList.add(entry);

            JData.Entry entry1 = (JData.Entry) entry.clone();
            entry1.setY(random.nextInt(200));
            entryListLine.add(entry1);

            JData.Entry entry2 = (JData.Entry) entry.clone();
            entry2.setY(random.nextInt(200));
            entry2.setName("柱转图2");
            entry2.setStack("total");
            entryList.add(entry2);

            JData.Entry entry3 = (JData.Entry) entry.clone();
            entry3.setName("在柱坐标系的折线");
            entry3.setY(random.nextInt(200));
            entryList2.add(entry3);
        }
        data.setEntryList(entryList);
        JData.JCoordSysPosition coordSysPosition = new JData.JCoordSysPosition();
        coordSysPosition.setLeft(LeftEx.create("55%"));
        data.setCoordSysPosition(coordSysPosition);
        line.setEntryList(entryListLine);
        line.setSelfXAxis(true);
        line.setSelfYAxis(true);
        JData.JCoordSysPosition coordSysPositionLine = new JData.JCoordSysPosition();
        coordSysPositionLine.setRight(RightEx.create("55%"));
        line.setCoordSysPosition(coordSysPositionLine);
        data.setSelfCoordSys(true);
        data.setSelfYAxis(true);
        data.setSelfXAxis(true);
        line.setSelfCoordSys(true);
        Option option = new Option();
        create().next(data, option);
        create().next(line, option);

        JData line2 = new JData();
        line2.setType(SeriesEnum.line);
        line2.setCoordSys(CoordinateSystem.cartesian2d);
        line2.setCoordSysIndex(0);
        line2.setSelfCoordSys(false);
        line2.setEntryList(entryList2);
        create().next(line2, option);
        //JData.JCoordSysPosition line3

        //option.grid().get(0).left(LeftEx.create("55%"));
        //option.grid().get(1).right(RightEx.create("55%")).option().legend().show(true);
        write2Html(StringUtils.toJSONString(option), "JBarConvert");
    }
}
