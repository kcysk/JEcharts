/**
 * FileName: Axis.java
 * Author:   shenke
 * Date:     2018/6/14 上午11:22
 * Descriptor:
 */
package net.zdsoft.echarts.coords;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.DataActor;
import net.zdsoft.echarts.common.IRoot;
import net.zdsoft.echarts.coords.data.AxisData;
import net.zdsoft.echarts.coords.enu.AxisType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shenke
 * @since 2018/6/14 上午11:22
 */
@Getter
@Setter
public abstract class Axis<A extends Axis> extends IRoot<A> implements DataActor<A, AxisData> {

    private String id;
    private AxisType type;
    private Object min;
    private Object max;
    /**
     * 只在数值轴中（type: 'value'）有效。
     * <p>
     * 是否是脱离 0 值比例。设置成 true 后坐标刻度不会强制包含零刻度。在双数值轴的散点图中比较有用。
     * <p>
     * 在设置 min 和 max 之后该配置项无效
     */
    private Boolean scale;
    private Integer splitNumber;
    private Integer minInterval;
    private Integer maxInterval;
    /**
     * 强制设置坐标轴分割间隔。
     * <p>
     * 因为 splitNumber 是预估的值，实际根据策略计算出来的刻度可能无法达到想要的效果，这时候可以使用 interval 配合 min、max 强制设定刻度划分，一般不建议使用。
     * <p>
     * 无法在类目轴中使用。在时间轴（type: 'time'）中需要传时间戳，在对数轴（type: 'log'）中需要传指数值
     */
    private Object interval;
    private Object logBase;
    private Boolean silent;
    private Boolean triggerEvent;
    private Integer z;
    private Integer zlevel;

    private AxisLine<A> axisLine;
    private AxisTick<A> axisTick;
    private AxisLabel<A> axisLabel;
    private SplitLine<A> splitLine;
    private SplitArea<A> splitArea;
    private AxisPointer<A> axisPointer;

    private List<AxisData> data;

    @Override
    public A data(AxisData... t) {
        if (data == null) {
            data = new ArrayList<>();
        }
        data.addAll(Arrays.asList(t));
        return (A) this;
    }

    public A id(String id) {
        this.id = id;
        return (A) this;
    }

    public A type(AxisType type) {
        this.type = type;
        return (A) this;
    }

    public A min(Object min) {
        this.min = min;
        return (A) this;
    }

    public A max(Object max) {
        this.max = max;
        return (A) this;
    }

    public A scale(Boolean scale) {
        this.scale = scale;
        return (A) this;
    }

    public A splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return (A) this;
    }

    public A minInterval(Integer minInterval) {
        this.minInterval = minInterval;
        return (A) this;
    }

    public A maxInterval(Integer maxInterval) {
        this.maxInterval = maxInterval;
        return (A) this;
    }

    public A interval(Object interval) {
        this.interval = interval;
        return (A) this;
    }

    public A logBase(Object logBase) {
        this.logBase = logBase;
        return (A) this;
    }

    public A silent(Boolean silent) {
        this.silent = silent;
        return (A) this;
    }

    public A triggerEvent(Boolean triggerEvent) {
        this.triggerEvent = triggerEvent;
        return (A) this;
    }

    public A z(Integer z) {
        this.z = z;
        return (A) this;
    }

    public A zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return (A) this;
    }

    public AxisLine<A> axisLine() {
        if (axisLine == null) {
            axisLine = new AxisLine<>();
            axisLine.parent((A) this);
        }
        return axisLine;
    }

    public A axisLine(AxisLine<A> axisLine) {
        this.axisLine = axisLine;
        return (A) this;
    }

    public AxisTick<A> axisTick() {
        if (axisTick == null) {
            axisTick = new AxisTick<>();
            axisTick.parent((A) this);
        }
        return axisTick;
    }

    public A axisTick(AxisTick<A> axisTick) {
        this.axisTick = axisTick;
        return (A) this;
    }

    public AxisLabel<A> axisLabel() {
        if (axisLabel == null) {
            axisLabel = new AxisLabel<>();
            axisLabel.parent((A) this);
        }
        return axisLabel;
    }

    public A axisLabel(AxisLabel<A> axisLabel) {
        this.axisLabel = axisLabel;
        return (A) this;
    }

    public SplitLine<A> splitLine() {
        if (splitLine == null) {
            splitLine = new SplitLine<>();
            splitLine.parent((A) this);
        }
        return splitLine;
    }

    public A splitLine(SplitLine<A> splitLine) {
        this.splitLine = splitLine;
        return (A) this;
    }

    public SplitArea<A> splitArea() {
        if (splitArea == null) {
            splitArea = new SplitArea<>();
            splitArea.parent((A) this);
        }
        return splitArea;
    }

    public A splitArea(SplitArea<A> splitArea) {
        this.splitArea = splitArea;
        return (A) this;
    }

    public AxisPointer<A> axisPointer() {
        if (axisPointer == null) {
            axisPointer = new AxisPointer<>();
            axisPointer.parent((A) this);
        }
        return axisPointer;
    }

    public A axisPointer(AxisPointer<A> axisPointer) {
        this.axisPointer = axisPointer;
        return (A) this;
    }
}
