/**
 * FileName: Bar.java
 * Author:   shenke
 * Date:     2018/6/13 下午5:52
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.ProgressiveChunkMode;
import net.zdsoft.echarts.enu.SeriesLayoutBy;
import net.zdsoft.echarts.series.data.BarData;

/**
 * @author shenke
 * @since 2018/6/13 下午5:52
 */
@Getter
@Setter
final public class Bar extends Series<Bar, BarData> {

    private Boolean legendHoverLink;

    private CoordinateSystem coordinateSystem;
    private Integer xAxisIndex;
    private Integer yAxisIndex;

    private String stack;
    private String cursor;

    private Object barWidth;
    private Object barMaxWidth;
    private Integer barMinHeight;

    /**
     * 不同系列的柱间距离，可设固定值（如 20）或者百分比（如 '30%'，表示柱子宽度的 30%）。
     *
     * 如果想要两个系列的柱子重叠，可以设置 barGap 为 '-100%'。这在用柱子做背景的时候有用。
     *
     * 在同一坐标系上，此属性会被多个 'bar' 系列共享。此属性应设置于此坐标系中最后一个 'bar' 系列上才会生效，并且是对此坐标系中所有 'bar' 系列生效
     */
    private String barGap;
    /**
     * [ default: '20%' ]
     * 同一系列的柱间距离，默认为类目间距的20%，可设固定值
     *
     * 在同一坐标系上，此属性会被多个 'bar' 系列共享。此属性应设置于此坐标系中最后一个 'bar' 系列上才会生效，并且是对此坐标系中所有 'bar' 系列生效
     */
    private String barCategoryGap;
    /**
     * 是否开启大数据量优化，在数据图形特别多而出现卡顿时候可以开启。
     *
     * 开启后配合 largeThreshold 在数据量大于指定阈值的时候对绘制进行优化。
     *
     * 缺点：优化后不能自定义设置单个数据项的样式
     */
    private Boolean large;
    private Integer largeThreshold;
    /**
     * [ default: 5000 ]
     * 渐进式渲染时每一帧绘制图形数量，设为 0 时不启用渐进式渲染，支持每个系列单独配置。
     *
     * 在图中有数千到几千万图形元素的时候，一下子把图形绘制出来，或者交互重绘的时候可能会造成界面的卡顿甚至假死。
     * ECharts 4 开始全流程支持渐进渲染（progressive rendering），渲染的时候会把创建好的图形分到数帧中渲染，每一帧渲染只渲染指定数量的图形。
     *
     * 该配置项就是用于配置该系列每一帧渲染的图形数，可以根据图表图形复杂度的需要适当调整这个数字使得在不影响交互流畅性的前提下达到绘制速度的最大化。
     * 比如在 lines 图或者平行坐标中线宽大于 1 的 polyline 绘制会很慢，这个数字就可以设置小一点，而线宽小于等于 1 的 polyline 绘制非常快，该配置项就可以相对调得比较
     */
    private Integer progressive;
    private Integer progressiveThreshold;
    private ProgressiveChunkMode progressiveChunkMode;
    private Object[] dimensions;
    /**
     * 可以定义 data 的哪个维度被编码成什么。
     * encode 支持的属性，根据坐标系不同而不同。 对于 直角坐标系（cartesian2d），支持 x、y。 对于 极坐标系（polar），支持 radius、angle。 对于 地理坐标系（geo），支持 lng，lat。 此外，均支持 tooltip 和 itemName（用于指定 tooltip 中数据项名称）。
     *
     * 当使用 dimensions 给维度定义名称后，encode 中可直接引用名称
     * http://echarts.baidu.com/option.html#series-line.encode
     */
    private Object encode;
    private SeriesLayoutBy seriesLayoutBy;
    private Integer datasetIndex;

    @Override
    public BarData create() {
        BarData data = new BarData();
        data.parent(this);
        return data;
    }
}
