package net.zdsoft.echarts.series.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.FontStyle;
import net.zdsoft.echarts.enu.FontWeight;
import net.zdsoft.echarts.series.Gauge;
import net.zdsoft.echarts.style.Rich;

/**
 * @author shenke
 * @since 2018/7/25 下午6:04
 */
@Getter
@Setter
public class Detail extends AbstractParent<Gauge, Detail> {

    private Boolean show;
    private Object width;
    private Object height;
    private Object backgroundColor;
    private Double borderWidth;
    private String borderColor;
    private Object[] offsetCenter;
    private String formatter;
    private Object color;
    private FontStyle fontStyle;
    private FontWeight fontWeight;
    private String fontFamily;
    private Integer fontSize;
    private Double lineHeight;
    private Object borderRadius;
    private Object padding;
    private String shadowColor;
    private Double shadowBlur;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    private String textBorderColor;
    private Integer textBorderWidth;
    private String textShadowColor;
    private Integer textShadowBlur;
    private Integer textShadowOffsetX;
    private Integer textShadowOffsetY;
    private Rich<Detail> rich;
}
