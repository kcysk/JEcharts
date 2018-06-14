/**
 * FileName: AxisTick.java
 * Author:   shenke
 * Date:     2018/6/14 下午1:56
 * Descriptor:
 */
package net.zdsoft.echarts.coords;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.style.LineStyle;

/**
 * @author shenke
 * @since 2018/6/14 下午1:56
 */
@Getter
@Setter
final public class AxisTick<P> extends AbstractParent<P, AxisTick> {

    private Boolean show;
    private Boolean alignWidthLabel;
    private Object interval;
    private Boolean inside;
    private Integer length;
    private LineStyle<AxisTick<P>, LineStyle> lineStyle;


    public AxisTick<P>  show(Boolean show) {
        this.show = show;
        return this;
    }

    public AxisTick<P>  alignWidthLabel(Boolean alignWidthLabel) {
        this.alignWidthLabel = alignWidthLabel;
        return this;
    }

    public AxisTick<P>  interval(Object interval) {
        this.interval = interval;
        return this;
    }

    public AxisTick<P>  inside(Boolean inside) {
        this.inside = inside;
        return this;
    }

    public AxisTick<P>  length(Integer length) {
        this.length = length;
        return this;
    }

    public LineStyle<AxisTick<P>, LineStyle> lineStyle() {
        if (lineStyle == null) {
            lineStyle = new LineStyle<>();
            lineStyle.parent(this);
        }
        return this.lineStyle;
    }

    public AxisTick<P>  lineStyle(LineStyle<AxisTick<P>, LineStyle> lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }
}
