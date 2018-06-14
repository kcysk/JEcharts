/**
 * FileName: SplitLine.java
 * Author:   shenke
 * Date:     2018/6/14 下午2:00
 * Descriptor:
 */
package net.zdsoft.echarts.coords;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.style.LineStyle;

/**
 * @author shenke
 * @since 2018/6/14 下午2:00
 */
@Getter
@Setter
final public class SplitLine<P> extends AbstractParent<P, SplitLine> {

    private Boolean show;
    private Object interval;
    private LineStyle<SplitLine<P>, LineStyle> lineStyle;


    public SplitLine<P> show(Boolean show) {
        this.show = show;
        return this;
    }

    public SplitLine<P> interval(Object interval) {
        this.interval = interval;
        return this;
    }

    public LineStyle<SplitLine<P>, LineStyle> lineStyle() {
        if (lineStyle == null) {
            this.lineStyle = new LineStyle<>();
            lineStyle.parent(this);
        }
        return this.lineStyle;
    }

    public SplitLine<P> lineStyle(LineStyle<SplitLine<P>, LineStyle> lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }
}
