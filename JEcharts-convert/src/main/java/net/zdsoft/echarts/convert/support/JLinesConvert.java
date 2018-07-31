/**
 * FileName: JLinesConvert.java
 * Author:   shenke
 * Date:     2018/6/22 下午3:33
 * Descriptor:
 */
package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.Utils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.element.inner.LegendData;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Lines;
import net.zdsoft.echarts.series.data.LinesData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shenke
 * @since 2018/6/22 下午3:33
 */
public class JLinesConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.lines.equals(data.getType())) {
            chain.next(data, option);
            return;
        }

        Map<String, Lines> linesMap = new HashMap<>();
        for (JData.Entry entry : data.getEntryList()) {
            Lines lines = linesMap.computeIfAbsent(entry.getName(), name -> new Lines().name(name).option(option));
            LinesData linesData = lines.create();
            lines.data(linesData);
            linesData.value(entry.getY());
            if (CoordinateSystem.geo.equals(data.getCoordSys())) {
                linesData.coords(Utils.asArray(getGeoCoordByEntryX(entry.getX()), getGeoCoordByEntryX(entry.getToX())));
                lines.coordinateSystem(CoordinateSystem.geo);
            }
            else if (CoordinateSystem.cartesian2d.equals(data.getCoordSys())) {
                linesData.coords(Utils.asArray(Utils.asArray(entry.getX(), entry.getY()),
                        Utils.asArray(entry.getToX(), entry.getToY())));
                lines.coordinateSystem(CoordinateSystem.cartesian2d);
            }
            option.legend().data(new LegendData().name(entry.getName()));
        }

        Integer coordSysIndex = createCoordinateSystem(option, data, null, null);
        List<Lines> linesList = linesMap.entrySet().stream().map(Map.Entry::getValue)
                .map(lines -> lines.geoIndex(coordSysIndex).xAxisIndex(coordSysIndex)
                        .yAxisIndex(coordSysIndex)).collect(Collectors.toList());
        option.series().addAll(linesList);
    }
}
