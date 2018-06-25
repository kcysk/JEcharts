/**
 * FileName: Radar.java
 * Author:   shenke
 * Date:     2018/6/14 上午9:28
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.series.data.RadarData;
import net.zdsoft.echarts.style.AreaStyle;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.LineStyle;

/**
 * @author shenke
 * @since 2018/6/14 上午9:28
 */
@Getter
@Setter
final public class Radar extends Series<Radar, RadarData> {

    private Integer radarIndex;
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


    private LineStyle<Radar, LineStyle> lineStyle;
    private AreaStyle<Radar, AreaStyle> areaStyle;
    private Emphasis<Radar> emphasis;


    public Radar() {
        type(SeriesEnum.radar);
    }

    @Override
    public RadarData create() {
        RadarData data = new RadarData();
        data.parent(this);
        return data;
    }


    public Radar radarIndex(Integer radarIndex) {
        this.radarIndex = radarIndex;
        return this;
    }

    public Radar symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public Radar symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Radar symbolRotate(Integer symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    public Radar symbolKeepAspect(Boolean symbolKeepAspect) {
        this.symbolKeepAspect = symbolKeepAspect;
        return this;
    }

    public Radar symbolOffset(Object[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public LineStyle<Radar, LineStyle> lineStyle() {
        if (lineStyle == null) {
            lineStyle = new LineStyle<>();
            lineStyle.parent(this);
        }
        return lineStyle;
    }

    public Radar lineStyle(LineStyle<Radar, LineStyle> lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public AreaStyle<Radar, AreaStyle> areaStyle() {
        if (areaStyle == null) {
            areaStyle = new AreaStyle<>();
            areaStyle.parent(this);
        }
        return areaStyle;
    }

    public Radar areaStyle(AreaStyle<Radar, AreaStyle> areaStyle) {
        this.areaStyle = areaStyle;
        return this;
    }

    public Emphasis<Radar> emphasis() {
        if (emphasis == null) {
            emphasis = new Emphasis<>();
            emphasis.parent(this);
        }
        return emphasis;
    }

    public Radar emphasis(Emphasis<Radar> emphasis) {
        this.emphasis = emphasis;
        return this;
    }

}
