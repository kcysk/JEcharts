/**
 * FileName: JBarConvert.java
 * Author:   shenke
 * Date:     2018/6/21 上午11:51
 * Descriptor:
 */
package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.common.Utils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.coords.Axis;
import net.zdsoft.echarts.coords.data.AxisData;
import net.zdsoft.echarts.coords.enu.AxisType;
import net.zdsoft.echarts.element.inner.LegendData;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Bar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shenke
 * @since 2018/6/21 上午11:51
 */
public class JBarConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.bar.equals(data.getType())) {
            chain.next(data, option);
            return;
        }
        Map<String, Bar> bars = new HashMap<>();
        Axis xAxis = createCoordinateSystemAxis(data.getCoordSys(), false);
        for (JData.Entry entry : data.getEntryList()) {
            xAxis.data(new AxisData<Axis>().parent(xAxis).value(entry.getX())).type(AxisType.category);

            Bar bar = bars.computeIfAbsent(entry.getName(), name -> new Bar().option(option).name(name));
            int xIndex = 0;
            for (Object o : xAxis.getData()) {
                if (StringUtils.equals(((AxisData)o).getValue(), entry.getX())) {
                    break;
                }
                xIndex ++;
            }
            bar.data(bar.create().name(entry.getX()).value(Utils.asArray(xIndex, entry.getY())).parent(bar)).stack(entry.getStack());
            option.legend().data(new LegendData().name(entry.getName()));
            //x轴或者角度轴
        }
        //通常情况下y轴或者极坐标系的径向轴不用设置
        Axis yAxis = createCoordinateSystemAxis(data.getCoordSys(), true);
        yAxis.type(AxisType.value).option(option);

        List<Bar> barList = bars.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        Integer coordSysIndex = createCoordinateSystem(option, data, xAxis, yAxis);
        if (CoordinateSystem.cartesian2d.equals(data.getCoordSys())) {
            if (coordSysIndex != null) {
                barList.forEach(bar -> bar.xAxisIndex(coordSysIndex).yAxisIndex(coordSysIndex));
            }
        } else {
            barList.forEach(bar -> bar.coordinateSystem(CoordinateSystem.polar));
        }
        option.series().addAll(barList);
    }

}
