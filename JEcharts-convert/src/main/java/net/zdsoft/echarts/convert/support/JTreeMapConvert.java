package net.zdsoft.echarts.convert.support;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.TreeMap;
import net.zdsoft.echarts.series.data.TreeMapData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author shenke
 * @since 2018/8/24 16:42
 */
public class JTreeMapConvert extends JDataConvertRoot {

    @Override
    public void convert(JData data, Option option, JDataConvertChain chain) {
        if (!SeriesEnum.treemap.equals(data.getType())) {
            chain.next(data, option);
            return;
        }

        TreeMap treeMap = new TreeMap().option(option);
        Map<String, JData.Entry> entryMap =
                data.getEntryList().stream().collect(Collectors.toMap(JData.Entry::getX, Function.identity()));
        TreeMapData emptyData = new TreeMapData();
        createNodeList(emptyData, entryMap);
        treeMap.data(emptyData.getChildren());
    }

    private List<TreeMapData> createNodeList(TreeMapData root, Map<String, JData.Entry> entryMap) {
        List<TreeMapData> nodes = new ArrayList<>();
        if (root.getName() == null) {
            //emptyRoot
            for (Map.Entry<String, JData.Entry> entryEntry : entryMap.entrySet()) {
                TreeMapData children = new TreeMapData();
                if (StringUtils.isBlank(entryEntry.getValue().getParent())) {
                    children.setName(entryEntry.getKey());
                    children.setChildren(createNodeList(children, entryMap).toArray(new TreeMapData[0]));
                    nodes.add(children);
                }
            }
        } else {
            for (Map.Entry<String, JData.Entry> entryEntry : entryMap.entrySet()) {
                TreeMapData children = new TreeMapData();
                if (root.getName().equals(entryEntry.getValue().getParent())) {
                    children.setName(entryEntry.getKey());
                    children.setChildren(createNodeList(children, entryMap).toArray(new TreeMapData[0]));
                    nodes.add(children);
                }
            }
        }
        return nodes;
    }

}
