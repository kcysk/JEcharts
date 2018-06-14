/**
 * FileName: Handle.java
 * Author:   shenke
 * Date:     2018/6/14 下午2:16
 * Descriptor:
 */
package net.zdsoft.echarts.coords;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;

/**
 * @author shenke
 * @since 2018/6/14 下午2:16
 */
@Getter
@Setter
final public class Handle<P> extends AbstractParent<P, Handle> {

    private Boolean show;
    private String icon;
    private Object size;
    private Integer margin;
    private String color;
    private Integer throttle;
    private Integer shadowBlur;
    private Object shadowColor;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    private Double opacity;


    public Handle<P> show(Boolean show) {
        this.show = show;
        return this;
    }

    public Handle<P> icon(String icon) {
        this.icon = icon;
        return this;
    }

    public Handle<P> size(Object size) {
        this.size = size;
        return this;
    }

    public Handle<P> margin(Integer margin) {
        this.margin = margin;
        return this;
    }

    public Handle<P> color(String color) {
        this.color = color;
        return this;
    }

    public Handle<P> throttle(Integer throttle) {
        this.throttle = throttle;
        return this;
    }

    public Handle<P> shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public Handle<P> shadowColor(Object shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Handle<P> shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public Handle<P> shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public Handle<P> opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }
}
