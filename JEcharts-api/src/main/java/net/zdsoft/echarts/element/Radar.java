/**
 * FileName: Radar.java
 * Author:   shenke
 * Date:     2018/6/12 下午9:13
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.IRoot;
import net.zdsoft.echarts.coords.AxisLabel;
import net.zdsoft.echarts.coords.AxisLine;
import net.zdsoft.echarts.coords.AxisPointer;
import net.zdsoft.echarts.coords.AxisTick;
import net.zdsoft.echarts.coords.SplitArea;
import net.zdsoft.echarts.coords.SplitLine;
import net.zdsoft.echarts.element.inner.RadarName;
import net.zdsoft.echarts.enu.RadarShape;

/**
 * 雷达图坐标系组件，只适用于雷达图。
 * 该组件等同 ECharts 2 中的 polar 组件。因为 3 中的 polar 被重构为标准的极坐标组件，为避免混淆，雷达图使用 radar 组件作为其坐标系。
 * <p>
 * 雷达图坐标系与极坐标系不同的是它的每一个轴（indicator 指示器）都是一个单独的维度，
 * 可以通过 name、axisLine、axisTick、axisLabel、splitLine、 splitArea 几个配置项配置指示器坐标轴线的样式
 *
 * @author shenke
 * @since 2018/6/12 下午9:13
 */
@Getter
@Setter
final public class Radar extends IRoot<Radar> {

    private Object[] center;
    private Object radius;
    private Double startAngle;

    private RadarName name;
    private Integer nameGap;
    private Integer splitNumber;
    private RadarShape shape;
    private Boolean scale;

    private Boolean silent;
    private Boolean triggerEvent;
    private Integer z;
    private Integer zlevel;

    private AxisLine<Radar> axisLine;
    private AxisTick<Radar> axisTick;
    private AxisLabel<Radar> axisLabel;
    private SplitLine<Radar> splitLine;
    private SplitArea<Radar> splitArea;
    private AxisPointer<Radar> axisPointer;


    public Radar center(Object[] center) {
        this.center = center;
        return this;
    }

    public Radar radius(Object radius) {
        this.radius = radius;
        return this;
    }

    public Radar startAngle(Double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public Radar name(RadarName name) {
        this.name = name;
        return this;
    }

    public Radar nameGap(Integer nameGap) {
        this.nameGap = nameGap;
        return this;
    }

    public Radar splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    public Radar shape(RadarShape shape) {
        this.shape = shape;
        return this;
    }

    public Radar scale(Boolean scale) {
        this.scale = scale;
        return this;
    }

    public Radar silent(Boolean silent) {
        this.silent = silent;
        return this;
    }

    public Radar triggerEvent(Boolean triggerEvent) {
        this.triggerEvent = triggerEvent;
        return this;
    }

    public Radar z(Integer z) {
        this.z = z;
        return this;
    }

    public Radar zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return this;
    }

    public AxisLine<Radar> axisLine() {
        if (axisLine == null) {
            axisLine = new AxisLine<>();
            axisLine.parent(this);
        }
        return axisLine;
    }

    public Radar axisLine(AxisLine<Radar> axisLine) {
        this.axisLine = axisLine;
        return this;
    }

    public AxisTick<Radar> axisTick() {
        if (axisTick == null) {
            axisTick = new AxisTick<>();
            axisTick.parent(this);
        }
        return axisTick;
    }

    public Radar axisTick(AxisTick<Radar> axisTick) {
        this.axisTick = axisTick;
        return this;
    }

    public AxisLabel<Radar> axisLabel() {
        if (axisLabel == null) {
            axisLabel = new AxisLabel<>();
            axisLabel.parent(this);
        }
        return axisLabel;
    }

    public Radar axisLabel(AxisLabel<Radar> axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    public SplitLine<Radar> splitLine() {
        if (splitLine == null) {
            splitLine = new SplitLine<>();
            splitLine.parent(this);
        }
        return splitLine;
    }

    public Radar splitLine(SplitLine<Radar> splitLine) {
        this.splitLine = splitLine;
        return this;
    }

    public SplitArea<Radar> splitArea() {
        if (splitArea == null) {
            splitArea = new SplitArea<>();
            splitArea.parent(this);
        }
        return splitArea;
    }

    public Radar splitArea(SplitArea<Radar> splitArea) {
        this.splitArea = splitArea;
        return this;
    }

    public AxisPointer<Radar> axisPointer() {
        if (axisPointer == null) {
            axisPointer = new AxisPointer<>();
            axisPointer.parent(this);
        }
        return axisPointer;
    }

    public Radar axisPointer(AxisPointer<Radar> axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }
}
