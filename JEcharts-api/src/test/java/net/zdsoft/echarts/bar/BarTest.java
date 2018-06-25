/**
 * FileName: BarTest.java
 * Author:   shenke
 * Date:     2018/6/14 下午4:30
 * Descriptor:
 */
package net.zdsoft.echarts.bar;

import net.zdsoft.echarts.BaseTest;
import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.coords.cartesian2d.Cartesian2dAxis;
import net.zdsoft.echarts.coords.data.AxisData;
import net.zdsoft.echarts.coords.enu.AxisType;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Bar;
import net.zdsoft.echarts.series.data.BarData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author shenke
 * @since 2018/6/14 下午4:30
 */
public class BarTest extends BaseTest {

    @Test
    public void _bar() {
        Random random = new Random(10);
        Option option = new Option();

        Cartesian2dAxis xAxis = new Cartesian2dAxis();
        List<AxisData> dataList = new ArrayList<>();
        List<BarData> barDatas = new ArrayList<>();
        for (int i=1 ;i<6; i++) {
            AxisData data = new AxisData();
            data.value("第" + i + "天");
            dataList.add(data);
            barDatas.add(new BarData().value(random.nextInt(500)));
        }
        xAxis.option(option).type(AxisType.category)
                .data(dataList.toArray(new AxisData[0]))
                .axisTick().alignWidthLabel(true);
        option.setXAxis(Collections.singletonList(xAxis));
        option.setYAxis(Collections.singletonList(new Cartesian2dAxis().type(AxisType.value)));
        option.setSeries(Collections.singletonList(new Bar().type(SeriesEnum.bar).data(barDatas.toArray(new BarData[0]))));

        String op = StringUtils.toJSONString(option);
        write2Html(op, "bar");

    }
}
