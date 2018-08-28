package net.zdsoft.echarts.series;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.Layout;
import net.zdsoft.echarts.enu.Roam;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.series.data.GraphData;
import net.zdsoft.echarts.series.inner.Category;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.Label;
import net.zdsoft.echarts.style.LineStyle;

/**
 * @author shenke
 * @since 2018/8/24 10:47
 */
@Getter
@Setter
public class Graph extends Series<Graph, GraphData> {

    private Boolean legendHoverLink;
    private CoordinateSystem coordinateSystem;
    private Integer xAxisIndex;
    private Integer yAxisIndex;
    private Integer polarIndex;
    private Integer geoIndex;
    private Integer calendarIndex;
    private Boolean hoverAnimation;
    private Layout layout;
    private Circular circular;
    private Force force;
    private Roam roam;
    private Double nodeScaleRatio;
    private Boolean draggable;
    private Boolean focusNodeAdjacency;
    private Symbol symbol;
    private Integer symbolSize;
    private Integer symbolRotate;
    private Boolean symbolKeepAspect;
    private Object[] symbolOffset;
    private Symbol[] edgeSymbol;
    private Integer edgeSymbolSize;
    private String cursor;
    private LineStyle<Graph, LineStyle> lineStyle;
    private Label<Graph> edgeLabel;
    private Emphasis<Graph> emphasis;
    private Category[] categories;
    private Link[] links;

    public Graph() {
        setType(SeriesEnum.graph);
    }

    @Override
    public GraphData create() {
        return new GraphData().parent(this);
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Circular {
        private Boolean rotateLabel;
        public static Circular enableRotate = new Circular(true);
        public static Circular disableRotate = new Circular(false);
    }

    @Getter
    @Setter
    public static class Force {
        private String initLayout;
        private Object repulsion;
        private Double gravity;
        private Object edgeLength;
        private Boolean layoutAnimation;
    }

    @Getter
    @Setter
    public static class Link {
        private Object source;
        private Object target;
        private Object value;
        private LineStyle<Link, LineStyle> lineStyle;
        private Label<Link> label;
        private Emphasis<Link> emphasis;
        private Object symbol;
        private Object symbolSize;
        private String category;
    }
}
