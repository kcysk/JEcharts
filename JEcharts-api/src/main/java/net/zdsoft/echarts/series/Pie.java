/**
 * FileName: Pie.java
 * Author:   shenke
 * Date:     2018/6/13 下午8:55
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.RoseType;
import net.zdsoft.echarts.enu.SelectedMode;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.enu.SeriesLayoutBy;
import net.zdsoft.echarts.series.data.PieData;
import net.zdsoft.echarts.series.data.Tooltip;
import net.zdsoft.echarts.series.inner.LabelLine;
import net.zdsoft.echarts.style.Emphasis;

/**
 * @author shenke
 * @since 2018/6/13 下午8:55
 */
@Getter
@Setter
final public class Pie extends Series<Pie, PieData> {

    private Boolean legendHoverLink;
    private Boolean hoverAnimation;
    private Integer hoverOffset;

    private SelectedMode selectedMode;
    private Integer selectedOffset;
    private Boolean clockwise;
    private Integer startAngle;
    private Integer minAngle;
    private RoseType roseType;
    /**
     * 是否启用防止标签重叠策略，默认开启，在标签拥挤重叠的情况下会挪动各个标签的位置，防止标签间的重叠。
     *
     * 如果不需要开启该策略，例如圆环图这个例子中需要强制所有标签放在中心位置，可以将该值设为 false
     */
    private Boolean avoidLabelOverlap;
    /**
     * 是否在数据和为0（一般情况下所有数据为0） 的时候不显示扇区
     */
    private Boolean stillShowZeroSum;
    private String cursor;
    private String[] center;
    private Object[] radius;
    private SeriesLayoutBy seriesLayoutBy;
    private Integer datasetIndex;
    private LabelLine<Pie> labelLine;
    private Emphasis<Pie> emphasis;
    private Tooltip<Pie> tooltip;

    public Pie() {
        type(SeriesEnum.pie);
    }

    @Override
    public PieData create() {
        PieData data = new PieData();
        data.parent(this);
        return data;
    }


    public Pie legendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
        return this;
    }

    public Pie hoverAnimation(Boolean hoverAnimation) {
        this.hoverAnimation = hoverAnimation;
        return this;
    }

    public Pie hoverOffset(Integer hoverOffset) {
        this.hoverOffset = hoverOffset;
        return this;
    }

    public Pie selectedMode(SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public Pie selectedOffset(Integer selectedOffset) {
        this.selectedOffset = selectedOffset;
        return this;
    }

    public Pie clockwise(Boolean clockwise) {
        this.clockwise = clockwise;
        return this;
    }

    public Pie startAngle(Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public Pie minAngle(Integer minAngle) {
        this.minAngle = minAngle;
        return this;
    }

    public Pie roseType(RoseType roseType) {
        this.roseType = roseType;
        return this;
    }

    public Pie avoidLabelOverlap(Boolean avoidLabelOverlap) {
        this.avoidLabelOverlap = avoidLabelOverlap;
        return this;
    }

    public Pie stillShowZeroSum(Boolean stillShowZeroSum) {
        this.stillShowZeroSum = stillShowZeroSum;
        return this;
    }

    public Pie cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public Pie center(String[] center) {
        this.center = center;
        return this;
    }

    public Pie radius(Object[] radius) {
        this.radius = radius;
        return this;
    }

    public Pie seriesLayoutBy(SeriesLayoutBy seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public Pie datasetIndex(Integer datasetIndex) {
        this.datasetIndex = datasetIndex;
        return this;
    }

    public Tooltip<Pie> tooltip() {
        if (tooltip == null) {
            tooltip = new Tooltip<>();
            tooltip.parent(this);
        }
        return tooltip;
    }

    public Pie tooltip(Tooltip<Pie> tooltip) {
        this.tooltip = tooltip;
        return this;
    }
    public Pie labelLine(LabelLine<Pie> labelLine) {
        this.labelLine = labelLine;
        return this;
    }

    public Pie emphasis(Emphasis<Pie> emphasis) {
        this.emphasis = emphasis;
        return this;
    }
}
