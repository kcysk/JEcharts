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
}
