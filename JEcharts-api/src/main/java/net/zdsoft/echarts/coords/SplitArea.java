/**
 * FileName: SplitArea.java
 * Author:   shenke
 * Date:     2018/6/14 下午2:03
 * Descriptor:
 */
package net.zdsoft.echarts.coords;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.style.AreaStyle;

/**
 * @author shenke
 * @since 2018/6/14 下午2:03
 */
@Getter
@Setter
final public class SplitArea<P> extends AbstractParent<P, SplitArea> {
    private Boolean show;
    private Object interval;
    private AreaStyle<SplitArea<P>, AreaStyle> areaStyle;


    public SplitArea<P> show(Boolean show) {
        this.show = show;
        return this;
    }

    public SplitArea<P> interval(Object interval) {
        this.interval = interval;
        return this;
    }

    public AreaStyle<SplitArea<P>, AreaStyle> areaStyle() {
        if (areaStyle == null) {
            areaStyle = new AreaStyle<>();
            areaStyle.parent(this);
        }
        return areaStyle;
    }

    public SplitArea<P> areaStyle(AreaStyle<SplitArea<P>, AreaStyle> areaStyle) {
        this.areaStyle = areaStyle;
        return this;
    }
}
