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
final public class LabelLine extends AbstractParent<FunnelData, LabelLine> {

    private Boolean show;
    private Integer length;
    private LineStyle<LabelLine, LineStyle> lineStyle;
    private Emphasis<LabelLine> emphasis;


    public LabelLine show(Boolean show) {
        this.show = show;
        return this;
    }

    public LabelLine length(Integer length) {
        this.length = length;
        return this;
    }

    public LineStyle<LabelLine, LineStyle> lineStyle() {
        if (lineStyle == null) {
            lineStyle = new LineStyle<>();
            lineStyle.parent(this);
        }
        return lineStyle;
    }

    public LabelLine lineStyle(LineStyle<LabelLine, LineStyle> lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public Emphasis<LabelLine> emphasis() {
        if (emphasis == null) {
            emphasis = new Emphasis<>();
            emphasis.parent(this);
        }
        return emphasis;
    }

    public LabelLine emphasis(Emphasis<LabelLine> emphasis) {
        this.emphasis = emphasis;
        return this;
    }
}
