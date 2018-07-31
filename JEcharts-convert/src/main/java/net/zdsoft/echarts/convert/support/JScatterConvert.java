/**
 * FileName: JScatterConvert.java
 * Author:   shenke
 * Date:     2018/6/21 下午2:27
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
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Scatter;
import net.zdsoft.echarts.series.data.ScatterData;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shenke
 * @since 2018/6/21 下午2:27
 */
public class JScatterConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.scatter.equals(data.getType())) {
            chain.next(data, option);
            return ;
        }

        Map<String, Scatter> scatters = new LinkedHashMap<>();
        Axis xAxis = createCoordinateSystemAxis(data.getCoordSys(), false);
        if (xAxis != null) {
            xAxis.type(data.getXAxisType());
        }
        for (JData.Entry entry : data.getEntryList()) {
            Scatter scatter = scatters.computeIfAbsent(entry.getName(), name -> new Scatter().name(name).option(option));
            ScatterData scatterData = new ScatterData().parent(scatter);
            scatter.data(scatterData);
            if (CoordinateSystem.geo.equals(data.getCoordSys())) {
                scatterData.name(entry.getX())
                        .value(Utils.concat(getGeoCoordByEntryX(entry.getX()), entry.getY()));
            } else {
                if (AxisType.value.equals(data.getXAxisType())) {
                    scatter.data(scatterData.name(entry.getX()).value(Utils.asArray(entry.getX(), entry.getY())));

                } else {
                    if (xAxis != null) {
                        xAxis.data(new AxisData<Axis>().parent(xAxis).value(entry.getX()));
                    }
                    int xIndex = 0;
                    for (Object o : xAxis.getData()) {
                        if (StringUtils.equals(((AxisData)o).getValue(), entry.getX())) {
                            break;
                        }
                        xIndex ++;
                    }
                    scatter.data(scatterData.name(entry.getX()).value(Utils.asArray(xIndex,entry.getY())));
                }
            }
        }
        Axis yAxis = createCoordinateSystemAxis(data.getCoordSys(), true);
        if (yAxis != null) {
            yAxis.type(AxisType.value);
        }

        List<Scatter> scatterList = scatters.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        Integer coordSysIndex = createCoordinateSystem(option, data, xAxis, yAxis);
        if (CoordinateSystem.cartesian2d.equals(data.getCoordSys())) {
            scatterList.forEach(scatter -> scatter.xAxisIndex(coordSysIndex)
                    .yAxisIndex(coordSysIndex).coordinateSystem(CoordinateSystem.cartesian2d));
        }
        else if(CoordinateSystem.geo.equals(data.getCoordSys())) {
            scatterList.forEach(scatter -> scatter.coordinateSystem(CoordinateSystem.geo).geoIndex(coordSysIndex));
        }
        else if(CoordinateSystem.polar.equals(data.getCoordSys())) {
            scatterList.forEach(scatter -> scatter.coordinateSystem(CoordinateSystem.polar).polarIndex(coordSysIndex));
        }
        option.series().addAll(scatterList);
    }
}
