/**
 * FileName: ScaleLimit.java
 * Author:   shenke
 * Date:     2018/6/13 下午1:55
 * Descriptor:
 */
package net.zdsoft.echarts.mix;


import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;

/**
 * @author shenke
 * @since 2018/6/13 下午1:55
 */
@Getter
@Setter
final public class ScaleLimit<P> extends AbstractParent<P, ScaleLimit> {

    private Double min;
    private Double max;


    public ScaleLimit min(Double min) {
        this.min = min;
        return this;
    }

    public ScaleLimit max(Double max) {
        this.max = max;
        return this;
    }
}
