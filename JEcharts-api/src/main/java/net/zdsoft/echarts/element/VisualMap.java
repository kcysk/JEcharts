/**
 * FileName: VisualMap.java
 * Author:   shenke
 * Date:     2018/6/12 下午9:14
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.IRoot;
import net.zdsoft.echarts.element.inner.Controller;
import net.zdsoft.echarts.element.inner.VisualMapRange;
import net.zdsoft.echarts.enu.Align;
import net.zdsoft.echarts.enu.Bottom;
import net.zdsoft.echarts.enu.Left;
import net.zdsoft.echarts.enu.Orient;
import net.zdsoft.echarts.enu.Right;
import net.zdsoft.echarts.enu.Top;
import net.zdsoft.echarts.enu.VisualMapType;
import net.zdsoft.echarts.style.TextStyle;

/**
 * visualMap 是视觉映射组件，用于进行『视觉编码』，也就是将数据映射到视觉元素（视觉通道）。
 *
 * 视觉元素可以是：
 *
 * symbol: 图元的图形类别。
 * symbolSize: 图元的大小。
 * color: 图元的颜色。
 * colorAlpha: 图元的颜色的透明度。
 * opacity: 图元以及其附属物（如文字标签）的透明度。
 * colorLightness: 颜色的明暗度，参见 HSL。
 * colorSaturation: 颜色的饱和度，参见 HSL。
 * colorHue: 颜色的色调，参见 HSL。
 * visualMap 组件可以定义多个，从而可以同时对数据中的多个维度进行视觉映射。
 *
 * visualMap 组件可以定义为 分段型（visualMapPiecewise） 或 连续型（visualMapContinuous），通过 type 来区分
 * @author shenke
 * @since 2018/6/12 下午9:14
 */
@Getter
@Setter
public class VisualMap<V extends VisualMap> extends IRoot<V> {

    private VisualMapType type;
    private String id;
    private Double min;
    private Double max;
    private Double[] range;
    private Boolean calculable;
    private Boolean realtime;
    private Boolean inverse;
    private Integer precision;
    private Integer itemWidth;
    private Integer itemHeight;
    private Align align;
    private String[] text;
    private Object textGap;
    private Boolean show;
    private Integer dimensions;
    private Object seriesIndex;
    private Boolean hoverLink;
    protected VisualMapRange<V> inRange;
    protected VisualMapRange<V> outRange;
    private Controller controller;
    private Integer zlevel;
    private Integer z;
    private Left left;
    private Top top;
    private Right right;
    private Bottom bottom;
    private Orient orient;
    private Integer padding;
    private Object backgroundColor;
    private Object borderColor;
    private Integer borderWidth;
    private Object[] color;
    private TextStyle<V, TextStyle> textStyle;
    private String formatter;


    public VisualMap type(VisualMapType type) {
        this.type = type;
        return this;
    }

    public VisualMap id(String id) {
        this.id = id;
        return this;
    }

    public VisualMap min(Double min) {
        this.min = min;
        return this;
    }

    public VisualMap max(Double max) {
        this.max = max;
        return this;
    }

    public VisualMap range(Double[] range) {
        this.range = range;
        return this;
    }

    public VisualMap calculable(Boolean calculable) {
        this.calculable = calculable;
        return this;
    }

    public VisualMap realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    public VisualMap inverse(Boolean inverse) {
        this.inverse = inverse;
        return this;
    }

    public VisualMap precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public VisualMap itemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public VisualMap itemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    public VisualMap align(Align align) {
        this.align = align;
        return this;
    }

    public VisualMap text(String[] text) {
        this.text = text;
        return this;
    }

    public VisualMap textGap(Object textGap) {
        this.textGap = textGap;
        return this;
    }

    public VisualMap show(Boolean show) {
        this.show = show;
        return this;
    }

    public VisualMap dimensions(Integer dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public VisualMap seriesIndex(Object seriesIndex) {
        this.seriesIndex = seriesIndex;
        return this;
    }

    public VisualMap hoverLink(Boolean hoverLink) {
        this.hoverLink = hoverLink;
        return this;
    }

    public VisualMap inRange(VisualMapRange<V> inRange) {
        this.inRange = inRange;
        return this;
    }

    public VisualMap outRange(VisualMapRange<V> outRange) {
        this.outRange = outRange;
        return this;
    }

    public VisualMap controller(Controller controller) {
        this.controller = controller;
        return this;
    }

    public VisualMap zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return this;
    }

    public VisualMap z(Integer z) {
        this.z = z;
        return this;
    }

    public VisualMap left(Left left) {
        this.left = left;
        return this;
    }

    public VisualMap top(Top top) {
        this.top = top;
        return this;
    }

    public VisualMap right(Right right) {
        this.right = right;
        return this;
    }

    public VisualMap bottom(Bottom bottom) {
        this.bottom = bottom;
        return this;
    }

    public VisualMap orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public VisualMap padding(Integer padding) {
        this.padding = padding;
        return this;
    }

    public VisualMap backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public VisualMap borderColor(Object borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public VisualMap borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public VisualMap color(Object[] color) {
        this.color = color;
        return this;
    }

    public TextStyle<V, TextStyle> textStyle() {
        if (textStyle == null) {
            textStyle = new TextStyle<>();
            textStyle.parent((V) this);
        }
        return textStyle;
    }

    public VisualMap textStyle(TextStyle<V, TextStyle> textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public VisualMap formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }
}
