/**
 * FileName: Label.java
 * Author:   shenke
 * Date:     2018/6/13 下午2:06
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Align;
import net.zdsoft.echarts.enu.Position;
import net.zdsoft.echarts.enu.VerticalAlign;

/**
 * @author shenke
 * @since 2018/6/13 下午2:06
 */
@Getter
@Setter
public class Label<P> extends TextStyle<P, Label> {

    private Boolean show;
    private Position position;
    /**
     * 距离图形元素的距离。当 position 为字符描述值（如 'top'、'insideRight'）时候有效。
     */
    private Integer distance;
    /**
     * 标签旋转。从 -90 度到 90 度。正值是逆时针
     */
    private Integer rotate;
    /**
     * 是否对文字进行偏移。默认不偏移。例如：[30, 40] 表示文字在横向上偏移 30，纵向上偏移 40。
     */
    private Integer[] offset;
    /**
     * 标签内容格式器，支持字符串模板和回调函数两种形式，字符串模板与回调函数返回的字符串均支持用 \n 换行。
     *
     * 字符串模板 模板变量有：
     *
     * {a}：系列名。
     * {b}：数据名。
     * {c}：数据值。
     * {@xxx}：数据中名为'xxx'的维度的值，如{@product}表示名为'product'` 的维度的值。
     * {@[n]}：数据中维度n的值，如{@[3]}` 表示维度 3 的值，从 0 开始计数。
     */
    private Object formatter;
    private Align align;
    private VerticalAlign verticalAlign;
    private Object backgroundColor;
    private String borderColor;
    private Integer borderWidth;
    private Object borderRadius;
    private Object padding;
    private String shadowColor;
    private Integer shadowBlur;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;

    private Rich<Label<P>> rich;


    public Label show(Boolean show) {
        this.show = show;
        return this;
    }

    public Label position(Position position) {
        this.position = position;
        return this;
    }

    public Label distance(Integer distance) {
        this.distance = distance;
        return this;
    }

    public Label rotate(Integer rotate) {
        this.rotate = rotate;
        return this;
    }

    public Label offset(Integer[] offset) {
        this.offset = offset;
        return this;
    }

    public Label formatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    public Label align(Align align) {
        this.align = align;
        return this;
    }

    public Label verticalAlign(VerticalAlign verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public Label backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Label borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Label borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Label borderRadius(Object borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Label padding(Object padding) {
        this.padding = padding;
        return this;
    }

    public Label shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Label shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public Label shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public Label shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public Rich<Label<P>> rich() {
        if (rich == null) {
            rich = new Rich<>();
            rich.parent(this);
        }
        return rich;
    }

    public Label rich(Rich<Label<P>> rich) {
        this.rich = rich;
        rich.parent(this);
        return this;
    }
}
