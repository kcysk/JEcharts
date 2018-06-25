/**
 * FileName: JPieConvert.java
 * Author:   shenke
 * Date:     2018/6/21 上午11:55
 * Descriptor:
 */
package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.Utils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.element.inner.LegendData;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Pie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shenke
 * @since 2018/6/21 上午11:55
 */
public class JPieConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.pie.equals(data.getType())) {
            chain.next(data, option);
            return;
        }

        Map<String, Pie> pies = new HashMap<>();
        for (JData.Entry entry : data.getEntryList()) {
            Pie pie = pies.computeIfAbsent(entry.getName(), name -> new Pie().option(option).name(name));
            pie.data(pie.create().name(entry.getX()).value(entry.getY()));
            option.legend().data(new LegendData().name(entry.getName()));
        }

        List<Pie> pieList = null;
        JData.JCoordSysPosition coordSysPosition = data.getCoordSysPosition();
        if (data.isSelfCoordSys() && coordSysPosition != null) {
            pieList = pies.entrySet().stream().map(Map.Entry::getValue)
                    .map(pie -> {
                        return pie.center(Utils.cast2StringArray(coordSysPosition.getCenter()))
                                .radius(coordSysPosition.getRadius()).roseType(data.getRoseType());
                    }).collect(Collectors.toList());
        } else {
            pieList = pies.entrySet().stream().map(Map.Entry::getValue)
                    .map(pie -> pie.roseType(data.getRoseType())).collect(Collectors.toList());
        }

        option.series().addAll(pieList);
    }
}
