package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Gauge;
import net.zdsoft.echarts.series.data.GaugeData;
import net.zdsoft.echarts.series.inner.Detail;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author shenke
 * @since 2018/7/30 下午5:42
 */
public class JGaugeConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.gauge.equals(data.getType())) {
            chain.next(data, option);
        } else {
            Map<String, Gauge> gaugeMap = new HashMap<>();

            Iterator var5 = data.getEntryList().iterator();
            while(var5.hasNext()) {
                JData.Entry entry = (JData.Entry)var5.next();
                Gauge gauge =  gaugeMap.computeIfAbsent(entry.getName(), name -> new Gauge().option(option).type(SeriesEnum.gauge).name(name));
                gauge.data(new GaugeData[]{(GaugeData)((GaugeData)gauge.create().name(entry.getX())).value(entry.getY())});
                gauge.setMin(entry.getMin());
                gauge.setMax(entry.getMax());
                Detail detail = new Detail();
                detail.setFontSize(12);
                detail.setFormatter("{value}%");
                gauge.setDetail(detail);
            }
            option.series().addAll(gaugeMap.values());
        }
    }
}
