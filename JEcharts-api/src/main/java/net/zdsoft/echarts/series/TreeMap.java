package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.ColorMappingBy;
import net.zdsoft.echarts.enu.NodeClick;
import net.zdsoft.echarts.enu.Roam;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.data.Tooltip;
import net.zdsoft.echarts.series.data.TreeMapData;
import net.zdsoft.echarts.series.inner.Breadcrumb;
import net.zdsoft.echarts.series.inner.Level;
import net.zdsoft.echarts.series.inner.Silent;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.Label;

/**
 * @author shenke
 * @since 2018/8/24 9:45
 */
@Getter
@Setter
public class TreeMap extends Series<TreeMap, TreeMapData> {

    public TreeMap() {
        setType(SeriesEnum.treemap);
    }

    private Double squareRatio;
    private Integer leafDepth;
    private String drillDownIcon;
    private Roam roam;
    private NodeClick nodeClick;
    private Double zoomToNodeRatio;
    private Level[] levels;
    private Silent silent;
    private Integer visualDimension;
    private Double visualMin;
    private Double visualMax;
    private Double[] colorAlpha;
    private Double[] colorSaturation;
    private ColorMappingBy colorMappingBy;
    private Double visibleMin;
    private Double childrenVisibleMin;
    private Label<TreeMap> upperLabel;
    private Emphasis<TreeMap> emphasis;
    private Breadcrumb breadcrumb;
    private Tooltip<TreeMap> tooltip;

    @Override
    public TreeMapData create() {
        return new TreeMapData().parent(this);
    }
}
