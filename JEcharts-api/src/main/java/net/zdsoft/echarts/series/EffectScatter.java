/**
 * FileName: EffectScatter.java
 * Author:   shenke
 * Date:     2018/6/13 下午11:34
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.EffectOn;
import net.zdsoft.echarts.enu.EffectType;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.enu.SeriesLayoutBy;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.series.data.EffectScatterData;
import net.zdsoft.echarts.series.data.Tooltip;
import net.zdsoft.echarts.series.inner.RippleEffect;
import net.zdsoft.echarts.style.Emphasis;

/**
 * @author shenke
 * @since 2018/6/13 下午11:34
 */
@Getter
@Setter
final public class EffectScatter extends Series<EffectScatter, EffectScatterData> {

    private EffectType effectType;
    private EffectOn showEffectOn;
    private RippleEffect rippleEffect;

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

    private String cursor;

    private Emphasis<EffectScatter> emphasis;
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

    private Tooltip<EffectScatter> tooltip;

    public EffectScatter() {
        type(SeriesEnum.effectScatter);
    }

    @Override
    public EffectScatterData create() {
        EffectScatterData data = new EffectScatterData();
        data.parent(this);
        return data;
    }


    public EffectScatter effectType(EffectType effectType) {
        this.effectType = effectType;
        return this;
    }

    public EffectScatter showEffectOn(EffectOn showEffectOn) {
        this.showEffectOn = showEffectOn;
        return this;
    }

    public EffectScatter rippleEffect(RippleEffect rippleEffect) {
        this.rippleEffect = rippleEffect;
        return this;
    }

    public EffectScatter coordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
        return this;
    }

    public EffectScatter xAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    public EffectScatter yAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    public EffectScatter polarIndex(Integer polarIndex) {
        this.polarIndex = polarIndex;
        return this;
    }

    public EffectScatter geoIndex(Integer geoIndex) {
        this.geoIndex = geoIndex;
        return this;
    }

    public EffectScatter calendarIndex(Integer calendarIndex) {
        this.calendarIndex = calendarIndex;
        return this;
    }

    public EffectScatter symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public EffectScatter symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public EffectScatter symbolRotate(Integer symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    public EffectScatter symbolKeepAspect(Boolean symbolKeepAspect) {
        this.symbolKeepAspect = symbolKeepAspect;
        return this;
    }

    public EffectScatter symbolOffset(Object[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public EffectScatter hoverAnimation(Boolean hoverAnimation) {
        this.hoverAnimation = hoverAnimation;
        return this;
    }

    public EffectScatter legendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
        return this;
    }

    public EffectScatter cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Emphasis<EffectScatter> emphasis() {
        if (emphasis == null) {
            emphasis = new Emphasis<>();
            emphasis.parent(this);
        }
        return emphasis;
    }

    public EffectScatter emphasis(Emphasis<EffectScatter> emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public EffectScatter dimensions(Object[] dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public EffectScatter progressive(Integer progressive) {
        this.progressive = progressive;
        return this;
    }

    public EffectScatter progressiveThreshold(Integer progressiveThreshold) {
        this.progressiveThreshold = progressiveThreshold;
        return this;
    }

    public EffectScatter encode(Object encode) {
        this.encode = encode;
        return this;
    }

    public EffectScatter seriesLayoutBy(SeriesLayoutBy seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public EffectScatter datasetIndex(Integer datasetIndex) {
        this.datasetIndex = datasetIndex;
        return this;
    }

    public Tooltip<EffectScatter> tooltip() {
        if (tooltip == null) {
            tooltip = new Tooltip<>();
            tooltip.parent(this);
        }
        return tooltip;
    }

    public EffectScatter tooltip(Tooltip<EffectScatter> tooltip) {
        this.tooltip = tooltip;
        return this;
    }
}
