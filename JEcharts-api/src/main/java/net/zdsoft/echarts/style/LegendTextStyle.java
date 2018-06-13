/**
 * FileName: LegendTextStyle.java
 * Author:   shenke
 * Date:     2018/6/13 下午1:26
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.element.Legend;

/**
 * @author shenke
 * @since 2018/6/13 下午1:26
 */
@Getter
@Setter
final public class LegendTextStyle extends TextStyle<Legend, LegendTextStyle> {

    private Integer lineHeight;
    private String backgroundColor;
    private String borderColor;
    private Integer borderWidth;
    private Object borderRadius;
    /**
     * 文字块的内边距。例如：
     *
     * padding: [3, 4, 5, 6]：表示 [上, 右, 下, 左] 的边距。
     * padding: 4：表示 padding: [4, 4, 4, 4]。
     * padding: [3, 4]：表示 padding: [3, 4, 3, 4]。
     * 注意，文字块的 width 和 height 指定的是内容高宽，不包含 padding
     */
    private Object padding;
    private String shadowColor;
    private Integer shadowBlur;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;


    public LegendTextStyle backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public LegendTextStyle borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public LegendTextStyle borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public LegendTextStyle borderRadius(Object borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public LegendTextStyle padding(Object padding) {
        this.padding = padding;
        return this;
    }

    public LegendTextStyle shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public LegendTextStyle shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public LegendTextStyle shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public LegendTextStyle shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }
}
