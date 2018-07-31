/**
 * FileName: JLineConvert.java
 * Author:   shenke
 * Date:     2018/6/21 下午2:09
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
import net.zdsoft.echarts.series.Line;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shenke
 * @since 2018/6/21 下午2:09
 */
public class JLineConvert extends JDataConvertRoot {


    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.line.equals(data.getType())) {
            chain.next(data, option);
            return ;
        }

        Map<String, Line> lines = new HashMap<>();
        Axis xAxis = createCoordinateSystemAxis(data.getCoordSys(), false);
        for (JData.Entry entry : data.getEntryList()) {
            xAxis.data(new AxisData<Axis>().parent(xAxis).value(entry.getX())).type(AxisType.category);
            Line line = lines.computeIfAbsent(entry.getName(), name -> new Line().option(option).name(name));
            int xIndex = 0;
            for (Object o : xAxis.getData()) {
                if (StringUtils.equals(((AxisData)o).getValue(), entry.getX())) {
                    break;
                }
                xIndex ++;
            }
            line.data(line.create().name(entry.getX()).value(Utils.asArray(xIndex, entry.getY())).parent(line)).stack(entry.getStack());
            option.legend().data(new LegendData().name(entry.getName()));
            //x轴或者角度轴
        }
        //通常情况下y轴或者极坐标系的径向轴不用设置
        Axis yAxis = createCoordinateSystemAxis(data.getCoordSys(), true);
        yAxis.type(AxisType.value).option(option);

        List<Line> lineList = lines.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        Integer coordSysIndex = createCoordinateSystem(option, data, xAxis, yAxis);
        if (CoordinateSystem.cartesian2d.equals(data.getCoordSys())) {
            if (coordSysIndex != null)
                lineList.forEach(bar -> bar.xAxisIndex(coordSysIndex).yAxisIndex(coordSysIndex));
        } else {
            lineList.forEach(bar -> bar.coordinateSystem(CoordinateSystem.polar));
        }
        option.series().addAll(lineList);
    }
}
