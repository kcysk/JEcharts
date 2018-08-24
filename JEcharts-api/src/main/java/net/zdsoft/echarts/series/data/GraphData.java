package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.series.Graph;

/**
 * @author shenke
 * @since 2018/8/24 10:52
 */
@Getter
@Setter
public class GraphData extends CommonSData<Graph, GraphData> {

    private Object x;
    private Object y;
    private Boolean fixed;
    private Integer category;
    private Symbol symbol;
    private Object symbolSize;
    private Integer symbolRotate;
    private Boolean symbolKeepAspect;
    private Object[] symbolOffset;

}
