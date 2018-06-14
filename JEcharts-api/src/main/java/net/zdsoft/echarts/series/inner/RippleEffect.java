/**
 * FileName: RippleEffect.java
 * Author:   shenke
 * Date:     2018/6/14 上午9:21
 * Descriptor:
 */
package net.zdsoft.echarts.series.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.RippleEffectBrushType;
import net.zdsoft.echarts.series.EffectScatter;

/**
 * @author shenke
 * @since 2018/6/14 上午9:21
 */
@Getter
@Setter
final public class RippleEffect extends AbstractParent<EffectScatter, RippleEffect> {

    private Integer period;
    private Double  scale;
    private RippleEffectBrushType brushType;


    public RippleEffect period(Integer period) {
        this.period = period;
        return this;
    }

    public RippleEffect scale(Double scale) {
        this.scale = scale;
        return this;
    }

    public RippleEffect brushType(RippleEffectBrushType brushType) {
        this.brushType = brushType;
        return this;
    }
}
