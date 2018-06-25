/**
 * FileName: Tooltip.java
 * Author:   shenke
 * Date:     2018/6/12 下午10:31
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.IRoot;
import net.zdsoft.echarts.coords.AxisPointer;
import net.zdsoft.echarts.enu.Position;
import net.zdsoft.echarts.enu.Trigger;
import net.zdsoft.echarts.enu.TriggerOn;
import net.zdsoft.echarts.style.TextStyle;

/**
 * 提示框组件。
 *
 * 提示框组件的通用介绍：
 * 提示框组件可以设置在多种地方：
 * 可以设置在全局，即 tooltip
 * 可以设置在坐标系中，即 grid.tooltip、polar.tooltip、single.tooltip
 * 可以设置在系列中，即 series.tooltip
 * 可以设置在系列的每个数据项中，即 series.data.tooltip
 * @author shenke
 * @since 2018/6/12 下午10:31
 */
@Getter
@Setter
final public class Tooltip extends IRoot<Tooltip> {

    private Boolean show;
    private Trigger trigger;
    private AxisPointer<Tooltip> axisPointer;
    private Boolean showContent;
    private Boolean alwaysShowContent;
    /**
     * [ default: 'mousemove|click' ]
     * 提示框触发的条件
     */
    private TriggerOn triggerOn;
    private Integer showDelay;
    private Integer hideDelay;
    private Boolean enterable;
    /**
     * [ default: false ]
     * 是否将 tooltip 框限制在图表的区域内。
     *
     * 当图表外层的 dom 被设置为 'overflow: hidden'，或者移动端窄屏，导致 tooltip 超出外界被截断时，此配置比较有用。
     */
    private Boolean confine;
    private Double transitionDuration;
    private Position position;
    private String formatter;
    private Object backgroundColor;
    private Object borderColor;
    private Integer borderWidth;
    private Integer padding;
    private TextStyle<Tooltip, TextStyle> textStyle;
    private String extraCssText;


    public Tooltip show(Boolean show) {
        this.show = show;
        return this;
    }

    public Tooltip trigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public AxisPointer<Tooltip> axisPointer() {
        if (axisPointer == null) {
            axisPointer = new AxisPointer<>().parent(this);
        }
        return axisPointer;
    }

    public Tooltip axisPointer(AxisPointer<Tooltip> axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }

    public Tooltip showContent(Boolean showContent) {
        this.showContent = showContent;
        return this;
    }

    public Tooltip alwaysShowContent(Boolean alwaysShowContent) {
        this.alwaysShowContent = alwaysShowContent;
        return this;
    }

    public Tooltip triggerOn(TriggerOn triggerOn) {
        this.triggerOn = triggerOn;
        return this;
    }

    public Tooltip showDelay(Integer showDelay) {
        this.showDelay = showDelay;
        return this;
    }

    public Tooltip hideDelay(Integer hideDelay) {
        this.hideDelay = hideDelay;
        return this;
    }

    public Tooltip enterable(Boolean enterable) {
        this.enterable = enterable;
        return this;
    }

    public Tooltip confine(Boolean confine) {
        this.confine = confine;
        return this;
    }

    public Tooltip transitionDuration(Double transitionDuration) {
        this.transitionDuration = transitionDuration;
        return this;
    }

    public Tooltip position(Position position) {
        this.position = position;
        return this;
    }

    public Tooltip formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public Tooltip backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Tooltip borderColor(Object borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Tooltip borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Tooltip padding(Integer padding) {
        this.padding = padding;
        return this;
    }

    public TextStyle<Tooltip, TextStyle> textStyle() {
        if (textStyle == null) {
            textStyle = new TextStyle<>().parent(this);
        }
        return textStyle;
    }

    public Tooltip textStyle(TextStyle<Tooltip, TextStyle> textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Tooltip extraCssText(String extraCssText) {
        this.extraCssText = extraCssText;
        return this;
    }
}
