/**
 * FileName: JFunnelConvert.java
 * Author:   shenke
 * Date:     2018/6/21 下午2:54
 * Descriptor:
 */
package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.element.inner.LegendData;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Funnel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shenke
 * @since 2018/6/21 下午2:54
 */
public class JFunnelConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.funnel.equals(data.getType())) {
            chain.next(data, option);
            return ;
        }

        Map<String, Funnel> fnnels = new HashMap<>();
        for (JData.Entry entry : data.getEntryList()) {
            Funnel funnel = fnnels.computeIfAbsent(entry.getName(), name -> new Funnel().option(option).name(name));
            funnel.data(funnel.create().name(entry.getX()).value(entry.getY()));
            option.legend().data(new LegendData().name(entry.getName()));
        }
        List<Funnel> funnelList = fnnels.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        JData.JCoordSysPosition coordSysPosition = data.getCoordSysPosition();
        if (coordSysPosition != null && data.isSelfCoordSys()) {
            funnelList.forEach(funnel -> funnel.bottom(coordSysPosition.getBottom())
                    .top(coordSysPosition.getTop()).right(coordSysPosition.getRight())
                    .left(coordSysPosition.getLeft()));
        }
        option.series().addAll(funnelList);
    }
}
