/**
 * FileName: AxisPointerLabel.java
 * Author:   shenke
 * Date:     2018/6/14 下午2:31
 * Descriptor:
 */
package net.zdsoft.echarts.coords;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.style.AbstractLabel;

/**
 * @author shenke
 * @since 2018/6/14 下午2:31
 */
@Getter
@Setter
final public class AxisPointerLabel<P> extends AbstractLabel<P, AxisPointerLabel> {

    private Integer precision;
    private Integer margin;


    public AxisPointerLabel<P> precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public AxisPointerLabel<P> margin(Integer margin) {
        this.margin = margin;
        return this;
    }
}
