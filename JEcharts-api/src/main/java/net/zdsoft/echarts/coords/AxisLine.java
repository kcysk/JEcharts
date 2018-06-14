/**
 * FileName: AxisLine.java
 * Author:   shenke
 * Date:     2018/6/14 下午1:01
 * Descriptor:
 */
package net.zdsoft.echarts.coords;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.style.LineStyle;

/**
 * @author shenke
 * @since 2018/6/14 下午1:01
 */
@Getter
@Setter
final public class AxisLine<P> extends AbstractParent<P, AxisLine> {

    private Boolean show;
    private Boolean onZero;
    private Integer onZeroAxisIndex;
    private Symbol symbol;
    private Object[] symbolSize;
    private Object symbolOffset;
    private LineStyle<AxisLine<P>, LineStyle> lineStyle;


    public AxisLine<P> show(Boolean show) {
        this.show = show;
        return this;
    }

    public AxisLine<P> onZero(Boolean onZero) {
        this.onZero = onZero;
        return this;
    }

    public AxisLine<P> onZeroAxisIndex(Integer onZeroAxisIndex) {
        this.onZeroAxisIndex = onZeroAxisIndex;
        return this;
    }

    public AxisLine<P> symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public AxisLine<P> symbolSize(Object[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public AxisLine<P> symbolOffset(Object symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }
    
    public LineStyle<AxisLine<P>, LineStyle> lineStyle() {
        if (lineStyle == null) {
            lineStyle = new LineStyle<>();
            lineStyle.parent(this);
        }
        return lineStyle;
    }

    public AxisLine<P> lineStyle(LineStyle<AxisLine<P>, LineStyle> lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }
}
