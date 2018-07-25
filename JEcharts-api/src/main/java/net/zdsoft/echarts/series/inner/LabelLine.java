/**
 * FileName: LabelLine.java
 * Author:   shenke
 * Date:     2018/6/14 上午11:02
 * Descriptor:
 */
package net.zdsoft.echarts.series.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.series.data.FunnelData;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.LineStyle;

/**
 * @author shenke
 * @since 2018/6/14 上午11:02
 */
@Getter
@Setter
final public class LabelLine<P> extends AbstractParent<P, LabelLine> {

    private Boolean show;
    private Integer length;
    private LineStyle<LabelLine<P>, LineStyle> lineStyle;
    private Emphasis<LabelLine<P>> emphasis;


    public LabelLine<P> show(Boolean show) {
        this.show = show;
        return this;
    }

    public LabelLine<P> length(Integer length) {
        this.length = length;
        return this;
    }

    public LineStyle<LabelLine<P>, LineStyle> lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
            this.lineStyle.parent(this);
        }

        return this.lineStyle;
    }

    public LabelLine<P> lineStyle(LineStyle<LabelLine<P>, LineStyle> lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public Emphasis<LabelLine<P>> emphasis() {
        if (this.emphasis == null) {
            this.emphasis = new Emphasis();
            this.emphasis.parent(this);
        }

        return this.emphasis;
    }

    public LabelLine<P> emphasis(Emphasis<LabelLine<P>> emphasis) {
        this.emphasis = emphasis;
        return this;
    }
}
