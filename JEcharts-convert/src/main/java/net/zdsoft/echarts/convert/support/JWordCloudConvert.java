/**
 * FileName: JWordCloudConvert.java
 * Author:   shenke
 * Date:     2018/6/21 下午2:58
 * Descriptor:
 */
package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.WordCloud;
import net.zdsoft.echarts.series.data.WordCloudData;

/**
 * @author shenke
 * @since 2018/6/21 下午2:58
 */
public class JWordCloudConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.wordCloud.equals(data.getType())) {
            chain.next(data, option);
            return;
        }

        WordCloud wordCloud = new WordCloud();
        for (JData.Entry entry : data.getEntryList()) {
            wordCloud.name(entry.getName())
                    .data(new WordCloudData().name(entry.getX()).value(entry.getY()));
        }

        JData.JCoordSysPosition coordSysPosition = data.getCoordSysPosition();
        if (data.isSelfCoordSys() && coordSysPosition != null) {
            wordCloud.bottom(coordSysPosition.getBottom())
                    .left(coordSysPosition.getLeft()).right(coordSysPosition.getRight())
                    .top(coordSysPosition.getTop());
        }

        option.series().add(wordCloud);
    }
}
