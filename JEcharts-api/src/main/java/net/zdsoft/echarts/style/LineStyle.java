/**
 * FileName: LineStyle.java
 * Author:   shenke
 * Date:     2018/6/13 下午4:12
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.LineType;

/**
 * @author shenke
 * @since 2018/6/13 下午4:12
 */
@Getter
@Setter
public class LineStyle<P, L extends LineStyle> extends AbstractParent<P, L> {

    private Object color;
    private Integer width;
    private LineType type;
    private String shadowColor;
    private Integer shadowBlur;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    private Double opacity;


    public L color(Object color) {
        this.color = color;
        return (L) this;
    }

    public L width(Integer width) {
        this.width = width;
        return (L) this;
    }

    public L type(LineType type) {
        this.type = type;
        return (L) this;
    }

    public L shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return (L) this;
    }

    public L shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return (L) this;
    }

    public L shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return (L) this;
    }

    public L shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return (L) this;
    }

    public L opacity(Double opacity) {
        this.opacity = opacity;
        return (L) this;
    }
}
