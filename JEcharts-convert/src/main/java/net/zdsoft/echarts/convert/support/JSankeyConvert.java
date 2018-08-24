package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Graph;
import net.zdsoft.echarts.series.Sankey;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenke
 * @since 2018/8/24 14:08
 */
public class JSankeyConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.sankey.equals(data.getType())) {
            chain.next(data, option);
            return;
        }

        List<Graph.Link> gLinks = new ArrayList<>(data.getLinkList().size());
        for (JData.Link link : data.getLinkList()) {
            Graph.Link gLink = new Graph.Link();
            gLink.setSource(link.getSource());
            gLink.setTarget(link.getTarget());
            gLink.setValue(link.getValue());
            gLinks.add(gLink);
        }
        Sankey sankey = new Sankey().option(option);
        sankey.setLinks(gLinks.toArray(new Graph.Link[0]));
        for (JData.Entry entry : data.getEntryList()) {
            sankey.data(sankey.create().name(entry.getX()).value(entry.getY()));
        }
        option.series(sankey);
    }
}
