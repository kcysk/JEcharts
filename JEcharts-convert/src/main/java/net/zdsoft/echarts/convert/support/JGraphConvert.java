package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.enu.Layout;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.Graph;
import net.zdsoft.echarts.series.data.GraphData;
import net.zdsoft.echarts.series.inner.Category;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shenke
 * @since 2018/8/24 15:19
 */
public class JGraphConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.graph.equals(data.getType())) {
            chain.next(data, option);
            return;
        }

        Graph graph = new Graph().option(option);
        List<Graph.Link> gLinks = new ArrayList<>();
        for (JData.Link link : data.getLinkList()) {
            Graph.Link gLink = new Graph.Link();
            gLink.setSource(link.getSource());
            gLink.setTarget(link.getTarget());
            gLink.setValue(link.getValue());
            gLinks.add(gLink);
        }
        graph.setLinks(gLinks.toArray(new Graph.Link[0]));
        if (!Layout.none.equals(data.getLayout())) {
            force(data, graph);
            graph.setLayout(data.getLayout());
        } else {
            coord(data, graph);
        }
        graph.setCategories(categories(data.getEntryList()).toArray(new Category[0]));
        option.series(graph);
    }

    private void force (JData data, Graph graph) {
        for (JData.Entry entry : data.getEntryList()) {
            GraphData graphData = graph.create().name(entry.getX()).value(entry.getY());
            graph.data(graphData);
            graphData.setCategory(entry.getCategory());
            entryGraphStyle(entry, graphData);
        }
    }

    private void coord(JData data, Graph graph) {
        for (JData.Entry entry : data.getEntryList()) {
            GraphData graphData = graph.create();
            graphData.setX(entry.getX());
            graphData.setY(entry.getY());
            graphData.setCategory(entry.getCategory());
            graphData.setValue(entry.getValue());
            entryGraphStyle(entry, graphData);
            graph.data(graphData);
        }
    }

    private LinkedHashSet<Category> categories(List<JData.Entry> entries) {
        return entries.stream().map(entry -> {
            Category category = new Category();
            category.setName(entry.getName());
            return category;
        }).collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private void entryGraphStyle(JData.Entry entry, GraphData graphData) {
        if (entry.getEntryGraphStyle() != null) {
            graphData.setSymbol(entry.getEntryGraphStyle().getSymbol());
            graphData.setCategory(entry.getEntryGraphStyle().getCategory());
            graphData.setSymbolSize(entry.getEntryGraphStyle().getSymbolSize());
            graphData.setSymbolKeepAspect(entry.getEntryGraphStyle().getSymbolKeepAspect());
            graphData.setSymbolOffset(entry.getEntryGraphStyle().getSymbolOffset());
            graphData.setFixed(entry.getEntryGraphStyle().getFixed());
            graphData.setSymbolRotate(entry.getEntryGraphStyle().getSymbolRotate());
        }
    }
}
