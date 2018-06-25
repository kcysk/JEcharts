/**
 * FileName: JRadarConvert.java
 * Author:   shenke
 * Date:     2018/6/21 下午2:35
 * Descriptor:
 */
package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.element.inner.Indicator;
import net.zdsoft.echarts.element.inner.LegendData;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Radar;
import net.zdsoft.echarts.series.data.RadarData;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author shenke
 * @since 2018/6/21 下午2:35
 */
public class JRadarConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.radar.equals(data.getType())) {
            chain.next(data, option);
            return ;
        }

        Map<String, RadarData> radarDatas = new LinkedHashMap<>();
        Set<String> indicatorName = new LinkedHashSet<>();
        for (JData.Entry entry : data.getEntryList()) {
            RadarData radarData = radarDatas.computeIfAbsent(entry.getName(), name -> new RadarData().name(name));
            if (radarData.getValue() == null) {
                radarData.value(new ArrayList<Object>());
            }
            ((List<Object>)radarData.getValue()).add(entry.getY());

            option.legend().data(new LegendData().name(entry.getName()));
            indicatorName.add(entry.getX());
        }

        Radar radar = new Radar().option(option);
        radar.data(radarDatas.values().toArray(new RadarData[0]));

        Integer coordSysIndex = createCoordinateSystem(option, data, null, null);
        radar.radarIndex(coordSysIndex);
        net.zdsoft.echarts.coords.radar.Radar coordRadar = option.radar().get(coordSysIndex);
        if (data.getIndicatorList() != null && data.getIndicatorList().size() > 0) {
            coordRadar.indicator(data.getIndicatorList().stream().map(jIndicator -> {
                Indicator indicator = new Indicator();
                indicator.parent(coordRadar).name(jIndicator.getName())
                        .max(jIndicator.getMax()).min(jIndicator.getMin());
                return indicator;
            }).collect(Collectors.toCollection(LinkedHashSet::new)));
        } else {
            coordRadar.indicator(indicatorName.stream().map(name-> {
                Indicator indicator = new Indicator();
                indicator.parent(coordRadar).name(name);
                return indicator;
            }).collect(Collectors.toCollection(LinkedHashSet::new)));
        }
        option.series().add(radar);
    }
}
