/**
 * FileName: AreaStyle.java
 * Author:   shenke
 * Date:     2018/6/13 下午4:18
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.Origin;

/**
 * @author shenke
 * @since 2018/6/13 下午4:18
 */
@Getter
@Setter
public class AreaStyle<P, AS extends AreaStyle> extends AbstractParent<P, AS> {

    private Object color;
    private Origin origin;
    private String shadowColor;
    private Integer shadowBlur;
    private Integer shadowOffsetX;
    private Integer shadowOffsetY;
    private Double opacity;


    public AS color(Object color) {
        this.color = color;
        return (AS) this;
    }

    public AS origin(Origin origin) {
        this.origin = origin;
        return (AS) this;
    }

    public AS shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return (AS) this;
    }

    public AS shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return (AS) this;
    }

    public AS shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return (AS) this;
    }

    public AS shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return (AS) this;
    }

    public AS opacity(Double opacity) {
        this.opacity = opacity;
        return (AS) this;
    }
}
