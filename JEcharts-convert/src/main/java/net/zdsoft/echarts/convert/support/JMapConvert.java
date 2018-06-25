/**
 * FileName: JMapConvert.java
 * Author:   shenke
 * Date:     2018/6/21 下午3:03
 * Descriptor:
 */
package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.element.inner.LegendData;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.EMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shenke
 * @since 2018/6/21 下午3:03
 */
public class JMapConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.map.equals(data.getType())) {
            chain.next(data, option);
            return ;
        }

        Map<String, EMap> emps = new HashMap<>();
        for (JData.Entry entry : data.getEntryList()) {
            EMap eMap = emps.computeIfAbsent(entry.getName(), name -> new EMap().option(option));
            eMap.data(eMap.create().name(entry.getX()).value(entry.getY())).map(data.getMapType());
            option.legend().data(new LegendData().name(entry.getName()));
        }
        option.series().addAll(emps.values());
    }
}
