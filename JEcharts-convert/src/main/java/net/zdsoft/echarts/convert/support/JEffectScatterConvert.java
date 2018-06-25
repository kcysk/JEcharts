/**
 * FileName: JEffectScatterConvert.java
 * Author:   shenke
 * Date:     2018/6/22 下午3:34
 * Descriptor:
 */
package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.Utils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.coords.Axis;
import net.zdsoft.echarts.coords.data.AxisData;
import net.zdsoft.echarts.coords.enu.AxisType;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.EffectScatter;
import net.zdsoft.echarts.series.data.EffectScatterData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shenke
 * @since 2018/6/22 下午3:34
 */
public class JEffectScatterConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.effectScatter.equals(data.getType())) {
            chain.next(data, option);
            return;
        }

        Map<String, EffectScatter> effectScatters = new HashMap<>();
        Axis xAxis = createCoordinateSystemAxis(data.getCoordSys(), false);
        if (xAxis != null) {
            xAxis.type(data.getXAxisType());
        }

        for (JData.Entry entry : data.getEntryList()) {
            EffectScatter effectScatter = effectScatters.computeIfAbsent(entry.getName(),
                    name-> new EffectScatter().name(name).option(option));
            EffectScatterData effectScatterData = new EffectScatterData().parent(effectScatter);
            effectScatter.data(effectScatterData);
            if (CoordinateSystem.geo.equals(data.getCoordSys())) {
                effectScatterData.name(entry.getX())
                        .value(Utils.concat(getGeoCoordByEntryX(entry.getX()), entry.getY()));
            }
            else {
                if (AxisType.value.equals(data.getXAxisType())) {
                    effectScatterData.name(entry.getX()).value(Utils.asArray(entry.getX(), entry.getY()));
                } else {
                    effectScatterData.name(entry.getX()).value(entry.getY());
                    if (xAxis != null) {
                        xAxis.data(new AxisData<Axis>().parent(xAxis).value(entry.getX()));
                    }
                }
            }
        }

        Axis yAxis = createCoordinateSystemAxis(data.getCoordSys(), true);
        if (yAxis != null) {
            yAxis.type(AxisType.value);
        }

        Integer coordSysIndex = createCoordinateSystem(option, data, xAxis, yAxis);

        List<EffectScatter> scatterList = effectScatters.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        if (CoordinateSystem.cartesian2d.equals(data.getCoordSys())) {
            scatterList.forEach(effectScatter -> effectScatter.coordinateSystem(data.getCoordSys())
                    .xAxisIndex(coordSysIndex).yAxisIndex(coordSysIndex));
        } else if (CoordinateSystem.geo.equals(data.getCoordSys())) {
            scatterList.forEach(effectScatter -> effectScatter.coordinateSystem(data.getCoordSys()).geoIndex(coordSysIndex));
        } else if (CoordinateSystem.polar.equals(data.getCoordSys())) {
            scatterList.forEach(effectScatter -> effectScatter.coordinateSystem(data.getCoordSys()).polarIndex(coordSysIndex));
        }
        option.series().addAll(scatterList);
    }
}
