/**
 * FileName: AxisLabel.java
 * Author:   shenke
 * Date:     2018/6/14 下午1:04
 * Descriptor:
 */
package net.zdsoft.echarts.coords;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.style.AbstractLabel;

/**
 * @author shenke
 * @since 2018/6/14 下午1:04
 */
@Getter
@Setter
final public class AxisLabel<P> extends AbstractLabel<P, AxisLabel> {

    private Object interval;
    private Boolean inside;
    private Integer margin;
    private Integer distance;

    private Boolean showMinLabel;
    private Boolean showMaxLabel;





    public AxisLabel<P> interval(Object interval) {
        this.interval = interval;
        return this;
    }

    public AxisLabel<P> inside(Boolean inside) {
        this.inside = inside;
        return this;
    }

    public AxisLabel<P> margin(Integer margin) {
        this.margin = margin;
        return this;
    }

    public AxisLabel<P> showMinLabel(Boolean showMinLabel) {
        this.showMinLabel = showMinLabel;
        return this;
    }

    public AxisLabel<P> showMaxLabel(Boolean showMaxLabel) {
        this.showMaxLabel = showMaxLabel;
        return this;
    }
}
