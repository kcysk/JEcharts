/**
 * FileName: Scatter.java
 * Author:   shenke
 * Date:     2018/6/13 下午11:26
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.enu.SeriesLayoutBy;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.series.data.ScatterData;
import net.zdsoft.echarts.series.data.Tooltip;
import net.zdsoft.echarts.style.Emphasis;

/**
 * @author shenke
 * @since 2018/6/13 下午11:26
 */
@Getter
@Setter
final public class Scatter extends Series<Scatter, ScatterData> {
    private CoordinateSystem coordinateSystem;

    private Integer xAxisIndex;
    private Integer yAxisIndex;
    private Integer polarIndex;
    private Integer geoIndex;
    private Integer calendarIndex;


    private Symbol symbol;
    /**
     * [ default: 4 ]
     * 标记的大小，可以设置成诸如 10 这样单一的数字，也可以用数组分开表示宽和高，例如 [20, 10] 表示标记宽为20，高为10。
     *
     * 如果需要每个数据的图形大小不一样，可以设置为如下格式的回调函数：
     *
     * (value: Array|number, params: Object) => number|Array
     * 其中第一个参数 value 为 data 中的数据值。第二个参数params 是其它的数据项参数。
     */
    private Object symbolSize;
    private Integer symbolRotate;
    /**
     * 如果 symbol 是 path:// 的形式，是否在缩放时保持该图形的长宽比。
     */
    private Boolean symbolKeepAspect;
    /**
     * 标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。
     *
     * 例如 [0, '50%'] 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点
     */
    private Object[] symbolOffset;

    private Boolean hoverAnimation;
    private Boolean legendHoverLink;

    private Boolean large;
    private Integer largeThreshold;
    private String cursor;

    private Emphasis<Line> emphasis;
    private Object[] dimensions;

    private Integer progressive;
    private Integer progressiveThreshold;
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

    private Tooltip<Scatter> tooltip;

    public Scatter() {
        type(SeriesEnum.scatter);
    }

    @Override
    public ScatterData create() {
        ScatterData data = new ScatterData();
        data.parent(this);
        return data;
    }


    public Scatter coordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
        return this;
    }

    public Scatter xAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    public Scatter yAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    public Scatter polarIndex(Integer polarIndex) {
        this.polarIndex = polarIndex;
        return this;
    }

    public Scatter geoIndex(Integer geoIndex) {
        this.geoIndex = geoIndex;
        return this;
    }

    public Scatter calendarIndex(Integer calendarIndex) {
        this.calendarIndex = calendarIndex;
        return this;
    }

    public Scatter symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public Scatter symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Scatter symbolRotate(Integer symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    public Scatter symbolKeepAspect(Boolean symbolKeepAspect) {
        this.symbolKeepAspect = symbolKeepAspect;
        return this;
    }

    public Scatter symbolOffset(Object[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public Scatter hoverAnimation(Boolean hoverAnimation) {
        this.hoverAnimation = hoverAnimation;
        return this;
    }

    public Scatter legendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
        return this;
    }

    public Scatter large(Boolean large) {
        this.large = large;
        return this;
    }

    public Scatter largeThreshold(Integer largeThreshold) {
        this.largeThreshold = largeThreshold;
        return this;
    }

    public Scatter cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Scatter emphasis(Emphasis<Line> emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public Scatter dimensions(Object[] dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public Scatter progressive(Integer progressive) {
        this.progressive = progressive;
        return this;
    }

    public Scatter progressiveThreshold(Integer progressiveThreshold) {
        this.progressiveThreshold = progressiveThreshold;
        return this;
    }

    public Scatter encode(Object encode) {
        this.encode = encode;
        return this;
    }

    public Scatter seriesLayoutBy(SeriesLayoutBy seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public Scatter datasetIndex(Integer datasetIndex) {
        this.datasetIndex = datasetIndex;
        return this;
    }

    public Tooltip<Scatter> tooltip() {
        if (tooltip == null) {
            tooltip = new Tooltip<>();
            tooltip.parent(this);
        }
        return tooltip;
    }

    public Scatter tooltip(Tooltip<Scatter> tooltip) {
        this.tooltip = tooltip;
        return this;
    }
}
