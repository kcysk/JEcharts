/**
 * FileName: HandleStyle.java
 * Author:   shenke
 * Date:     2018/6/20 下午12:49
 * Descriptor:
 */
package net.zdsoft.echarts.element.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.element.SliderDataZoom;
import net.zdsoft.echarts.enu.BorderType;

/**
 * @author shenke
 * @since 2018/6/20 下午12:49
 */
@Getter
@Setter
final public class HandleStyle extends AbstractParent<SliderDataZoom, HandleStyle> {

    private Object color;
    private Object borderColor;
    private Integer borderWidth;
    private BorderType borderType;
    private Integer shadowBlur;
    private Object shadowColor;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    private Double opacity;


    public HandleStyle color(Object color) {
        this.color = color;
        return this;
    }

    public HandleStyle borderColor(Object borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public HandleStyle borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public HandleStyle borderType(BorderType borderType) {
        this.borderType = borderType;
        return this;
    }

    public HandleStyle shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public HandleStyle shadowColor(Object shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public HandleStyle shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public HandleStyle shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public HandleStyle opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }
}
