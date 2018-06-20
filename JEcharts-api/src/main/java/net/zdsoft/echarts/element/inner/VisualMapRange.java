/**
 * FileName: VisualMapRange.java
 * Author:   shenke
 * Date:     2018/6/15 上午5:40
 * Descriptor:
 */
package net.zdsoft.echarts.element.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.Symbol;

/**
 * @author shenke
 * @since 2018/6/15 上午5:40
 */
@Getter
@Setter
final public class VisualMapRange<P> extends AbstractParent<P, VisualMapRange> {
    private Symbol symbol;
    private Object[] symbolSize;
    private Object color;
    private Object colorAlpha;
    private Integer opacity;
    private Object colorLightness;
    private Object colorSaturation;
    private Object colorHue;


    public VisualMapRange symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public VisualMapRange symbolSize(Object[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public VisualMapRange color(Object color) {
        this.color = color;
        return this;
    }

    public VisualMapRange colorAlpha(Object colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    public VisualMapRange opacity(Integer opacity) {
        this.opacity = opacity;
        return this;
    }

    public VisualMapRange colorLightness(Object colorLightness) {
        this.colorLightness = colorLightness;
        return this;
    }

    public VisualMapRange colorSaturation(Object colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    public VisualMapRange colorHue(Object colorHue) {
        this.colorHue = colorHue;
        return this;
    }
}
