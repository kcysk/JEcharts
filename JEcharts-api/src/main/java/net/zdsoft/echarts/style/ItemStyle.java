/**
 * FileName: ItemStyle.java
 * Author:   shenke
 * Date:     2018/6/13 下午2:18
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.BorderType;

/**
 * @author shenke
 * @since 2018/6/13 下午2:18
 */
@Getter
@Setter
public class ItemStyle<P, I extends ItemStyle> extends AbstractParent<P, I> {

    private Object color;
    private Object borderColor;
    private Integer borderWidth;
    private BorderType borderType;
    private Integer shadowBlur;
    private Object shadowColor;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    /**
     * 图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形。
     */
    private Double opacity;


    public I color(Object color) {
        this.color = color;
        return (I) this;
    }

    public I borderColor(Object borderColor) {
        this.borderColor = borderColor;
        return (I) this;
    }

    public I borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return (I) this;
    }

    public I borderType(BorderType borderType) {
        this.borderType = borderType;
        return (I) this;
    }

    public I shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return (I) this;
    }

    public I shadowColor(Object shadowColor) {
        this.shadowColor = shadowColor;
        return (I) this;
    }

    public I shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return (I) this;
    }

    public I shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return (I) this;
    }

    public I opacity(Double opacity) {
        this.opacity = opacity;
        return (I) this;
    }
}
