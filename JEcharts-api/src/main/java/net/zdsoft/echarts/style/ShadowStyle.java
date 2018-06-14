/**
 * FileName: ShadowStyle.java
 * Author:   shenke
 * Date:     2018/6/14 下午2:11
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;

/**
 * @author shenke
 * @since 2018/6/14 下午2:11
 */
@Getter
@Setter
final public class ShadowStyle<P> extends AbstractParent<P, ShadowStyle> {

    private Object color;
    private Integer shadowBlur;
    private Object shadowColor;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    private Double opacity;


    public ShadowStyle<P> color(Object color) {
        this.color = color;
        return this;
    }

    public ShadowStyle<P> shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public ShadowStyle<P> shadowColor(Object shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public ShadowStyle<P> shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public ShadowStyle<P> shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public ShadowStyle<P> opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }
}
