/**
 * FileName: Lines.java
 * Author:   shenke
 * Date:     2018/6/14 上午10:12
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.exception.NotSupportExcetion;
import net.zdsoft.echarts.series.data.LinesData;
import net.zdsoft.echarts.series.inner.Effect;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.ItemStyle;
import net.zdsoft.echarts.style.LineStyle;

/**
 * @author shenke
 * @since 2018/6/14 上午10:12
 */
@Getter
@Setter
final public class Lines extends Series<Lines, LinesData> {

    private CoordinateSystem coordinateSystem;
    private Integer xAxisIndex;
    private Integer yAxisIndex;
    private Integer geoIndex;

    private Boolean polyline;
    private Effect effect;

    private Boolean large;
    private Integer largeThreshold;
    private Symbol symbol;
    private Object symbolSize;

    private LineStyle<Lines, LineStyle> lineStyle;
    private Emphasis<Lines> emphasis;

    private Integer progressive;
    private Integer progressiveThreshold;

    public Lines() {
        type(SeriesEnum.lines);
    }

    @Override
    public ItemStyle<Lines, ?> getItemStyle() {
        return null;
    }

    @Override
    public void setItemStyle(ItemStyle<Lines, ?> itemStyle) {
        throw new NotSupportExcetion("not support itemStyle");
    }

    @Override
    public LinesData create() {
        LinesData data = new LinesData();
        data.parent(this);
        return data;
    }


    public Lines coordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
        return this;
    }

    public Lines xAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    public Lines yAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    public Lines geoIndex(Integer geoIndex) {
        this.geoIndex = geoIndex;
        return this;
    }

    public Lines polyline(Boolean polyline) {
        this.polyline = polyline;
        return this;
    }

    public Lines effect(Effect effect) {
        this.effect = effect;
        return this;
    }

    public Lines large(Boolean large) {
        this.large = large;
        return this;
    }

    public Lines largeThreshold(Integer largeThreshold) {
        this.largeThreshold = largeThreshold;
        return this;
    }

    public Lines symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public Lines symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public LineStyle<Lines, LineStyle> lineStyle() {
        if (lineStyle == null) {
            lineStyle = new LineStyle<>();
            lineStyle.parent(this);
        }
        return lineStyle;
    }

    public Lines lineStyle(LineStyle<Lines, LineStyle> lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public Emphasis<Lines> emphasis() {
        if (emphasis == null) {
            emphasis = new Emphasis<>();
            emphasis.parent(this);
        }
        return emphasis;
    }

    public Lines emphasis(Emphasis<Lines> emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public Lines progressive(Integer progressive) {
        this.progressive = progressive;
        return this;
    }

    public Lines progressiveThreshold(Integer progressiveThreshold) {
        this.progressiveThreshold = progressiveThreshold;
        return this;
    }
}
