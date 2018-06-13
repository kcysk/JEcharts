/**
 * FileName: TextStyle.java
 * Author:   shenke
 * Date:     2018/6/13 上午10:31
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.FontStyle;
import net.zdsoft.echarts.enu.FontWeight;

/**
 * Title
 * @author shenke
 * @since 2018/6/13 上午10:31
 */
@Getter
@Setter
public class TextStyle<P, TS extends TextStyle> extends AbstractParent<P, TS> {
    private Object                  color;
    private FontStyle               fontStyle;
    private FontWeight              fontWeight;
    private String                  fontFamily;
    private Integer                 fontSize;
    private Integer                 lineHeight;


    private Object                  width;
    private Object                  height;

    private String                  textBorderColor;
    private Integer                 textBorderWidth;
    private String                  textShadowColor;
    private Integer                 textShadowBlur;
    private Integer                 textShadowOffsetX;
    private Integer                 textShadowOffsetY;


    public TS color(Object color) {
        this.color = color;
        return (TS) this;
    }

    public TS fontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return (TS) this;
    }

    public TS fontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
        return (TS) this;
    }

    public TS fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return (TS) this;
    }

    public TS fontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return (TS) this;
    }

    public TS width(Object width) {
        this.width = width;
        return (TS) this;
    }

    public TS height(Object height) {
        this.height = height;
        return (TS) this;
    }

    public TS textBorderColor(String textBorderColor) {
        this.textBorderColor = textBorderColor;
        return (TS) this;
    }

    public TS textBorderWidth(Integer textBorderWidth) {
        this.textBorderWidth = textBorderWidth;
        return (TS) this;
    }

    public TS textShadowColor(String textShadowColor) {
        this.textShadowColor = textShadowColor;
        return (TS) this;
    }

    public TS textShadowBlur(Integer textShadowBlur) {
        this.textShadowBlur = textShadowBlur;
        return (TS) this;
    }

    public TS textShadowOffsetX(Integer textShadowOffsetX) {
        this.textShadowOffsetX = textShadowOffsetX;
        return (TS) this;
    }

    public TS textShadowOffsetY(Integer textShadowOffsetY) {
        this.textShadowOffsetY = textShadowOffsetY;
        return (TS) this;
    }


    public TS lineHeight(Integer lineHeight) {
        this.lineHeight = lineHeight;
        return (TS) this;
    }
}
