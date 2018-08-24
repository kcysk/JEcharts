package net.zdsoft.echarts.convert;

import net.zdsoft.echarts.BaseTest;
import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.enu.Layout;
import net.zdsoft.echarts.enu.RoamEnum;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Graph;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenke
 * @since 2018/8/24 15:37
 */
public class JGraphConvertTest extends BaseTest {

    @Test
    public void _execute() {
        JData data = new JData();
        List<JData.Entry> entries = createEntryList(3, "graphc");
        JData.Entry entry = new JData.Entry();
        entry.setX("周");
        entries.add(entry);
        for (JData.Entry et : entries) {
            JData.EntryGraphStyle entryGraphStyle = new JData.EntryGraphStyle();
            entryGraphStyle.setSymbolSize(40);
            et.setEntryGraphStyle(entryGraphStyle);
            et.setY(200);
        }
        data.setEntryList(entries);
        data.setLinkList(createLinks());
        data.setType(SeriesEnum.graph);
        data.setLayout(Layout.force);

        Option option = new Option();
        create().next(data, option);
        Graph graph = (Graph) option.series().get(0);
        Graph.Force force = new Graph.Force();
        force.setGravity(0.01);
        force.setInitLayout(Layout.circular.toString());
        force.setEdgeLength(200);
        graph.setForce(force);
        graph.setRoam(RoamEnum.move);
        write2Html(StringUtils.toJSONString(option), "graph");
    }

    public List<JData.Link> createLinks() {
        List<JData.Link> links = new ArrayList<>();
        for (int i=1; i<4; i++) {
            JData.Link link = new JData.Link();
            link.setSource("第"+ (i + 1) + "天");
            link.setTarget("周");
            link.setValue(200);
            links.add(link);
        }
        return links;
    }
}
