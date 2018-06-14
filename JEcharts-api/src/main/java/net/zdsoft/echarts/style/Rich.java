/**
 * FileName: Rich.java
 * Author:   shenke
 * Date:     2018/6/13 上午10:55
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.Align;
import net.zdsoft.echarts.enu.FontStyle;
import net.zdsoft.echarts.enu.FontWeight;
import net.zdsoft.echarts.enu.VerticalAlign;

/**
 * @author shenke
 * @since 2018/6/13 上午10:55
 */
@Getter
@Setter
public class Rich<P> extends AbstractParent<P, Rich<P>> {

    private Object color;
    private FontStyle fontStyle;
    private FontWeight fontWeight;
    private String fontFamily;
    private Integer fontSize;
    private Align align;
    private VerticalAlign verticalAlign;
    private Integer lineHeight;

    private Object backgroundColor;
    private String borderColor;
    private Integer borderWidth;
    private Object borderRadius;
    private Integer padding;
    private String shadowColor;
    private Integer shadowBlur;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;

    private Object width;
    private Object height;

    private String textBorderColor;
    private Integer textBorderWidth;
    private String textShadowColor;
    private Integer textShadowBlur;
    private Integer textShadowOffsetX;
    private Integer textShadowOffsetY;


    public Rich<P> color(Object color) {
        this.color = color;
        return this;
    }

    public Rich<P> fontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    public Rich<P> fontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    public Rich<P> fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public Rich<P> fontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public Rich<P> align(Align align) {
        this.align = align;
        return this;
    }

    public Rich<P> verticalAlign(VerticalAlign verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public Rich<P> lineHeight(Integer lineHeight) {
        this.lineHeight = lineHeight;
        return this;
    }

    public Rich<P> backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Rich<P> borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Rich<P> borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Rich<P> borderRadius(Object borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Rich<P> padding(Integer padding) {
        this.padding = padding;
        return this;
    }

    public Rich<P> shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Rich<P> shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public Rich<P> shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public Rich<P> shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public Rich<P> width(Object width) {
        this.width = width;
        return this;
    }

    public Rich<P> height(Object height) {
        this.height = height;
        return this;
    }

    public Rich<P> textBorderColor(String textBorderColor) {
        this.textBorderColor = textBorderColor;
        return this;
    }

    public Rich<P> textBorderWidth(Integer textBorderWidth) {
        this.textBorderWidth = textBorderWidth;
        return this;
    }

    public Rich<P> textShadowColor(String textShadowColor) {
        this.textShadowColor = textShadowColor;
        return this;
    }

    public Rich<P> textShadowBlur(Integer textShadowBlur) {
        this.textShadowBlur = textShadowBlur;
        return this;
    }

    public Rich<P> textShadowOffsetX(Integer textShadowOffsetX) {
        this.textShadowOffsetX = textShadowOffsetX;
        return this;
    }

    public Rich<P> textShadowOffsetY(Integer textShadowOffsetY) {
        this.textShadowOffsetY = textShadowOffsetY;
        return this;
    }
}
