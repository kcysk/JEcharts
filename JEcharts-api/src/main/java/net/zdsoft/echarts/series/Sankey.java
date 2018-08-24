package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.FocusNodeAdjacency;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.data.SankeyData;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.LineStyle;

/**
 * @author shenke
 * @since 2018/8/24 11:46
 */
@Getter
@Setter
public class Sankey extends Series<Sankey, SankeyData> {

    private Integer nodeWidth;
    private Integer nodeGap;
    private Integer layoutIterations;
    private Boolean draggable;
    private FocusNodeAdjacency focusNodeAdjacency;
    private LineStyle<Sankey, LineStyle> lineStyle;
    private Emphasis<Sankey> emphasis;
    private Graph.Link[] links;

    public Sankey() {
        setType(SeriesEnum.sankey);
    }

    @Override
    public SankeyData create() {
        return new SankeyData().parent(this);
    }
}
