/**
 * FileName: AbstractLabel.java
 * Author:   shenke
 * Date:     2018/6/14 下午2:26
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Align;
import net.zdsoft.echarts.enu.VerticalAlign;

/**
 * @author shenke
 * @since 2018/6/14 下午2:26
 */
@Getter
@Setter
public class AbstractLabel<P, A extends AbstractLabel> extends TextStyle<P, A> {

    private Boolean show;
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

    private Rich<A> rich;


    public A show(Boolean show) {
        this.show = show;
        return (A) this;
    }

    public A rotate(Integer rotate) {
        this.rotate = rotate;
        return (A) this;
    }

    public A offset(Integer[] offset) {
        this.offset = offset;
        return (A) this;
    }

    public A formatter(Object formatter) {
        this.formatter = formatter;
        return (A) this;
    }

    public A align(Align align) {
        this.align = align;
        return (A) this;
    }

    public A verticalAlign(VerticalAlign verticalAlign) {
        this.verticalAlign = verticalAlign;
        return (A) this;
    }

    public A backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return (A) this;
    }

    public A borderColor(String borderColor) {
        this.borderColor = borderColor;
        return (A) this;
    }

    public A borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return (A) this;
    }

    public A borderRadius(Object borderRadius) {
        this.borderRadius = borderRadius;
        return (A) this;
    }

    public A padding(Object padding) {
        this.padding = padding;
        return (A) this;
    }

    public A shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return (A) this;
    }

    public A shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return (A) this;
    }

    public A shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return (A) this;
    }

    public A shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return (A) this;
    }

    public Rich<A> rich() {
        if (rich == null) {
            rich = new Rich<>();
            rich.parent((A) this);
        }
        return rich;
    }

    public A rich(Rich<A> rich) {
        this.rich = rich;
        return (A) this;
    }
}
