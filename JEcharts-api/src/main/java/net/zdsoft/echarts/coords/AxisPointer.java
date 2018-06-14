/**
 * FileName: AxisPointer.java
 * Author:   shenke
 * Date:     2018/6/14 下午2:06
 * Descriptor:
 */
package net.zdsoft.echarts.coords;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.AxisPointerStatus;
import net.zdsoft.echarts.enu.AxisPointerType;
import net.zdsoft.echarts.style.LineStyle;
import net.zdsoft.echarts.style.ShadowStyle;

/**
 * @author shenke
 * @since 2018/6/14 下午2:06
 */
@Getter
@Setter
final public class AxisPointer<P> extends AbstractParent<P, AxisPointer> {

    private Boolean show;
    private AxisPointerType type;
    private Boolean snap;
    private Integer z;

    private LineStyle<AxisPointer<P>, LineStyle> lineStyle;
    private ShadowStyle<AxisPointer<P>> shadowStyle;
    private Boolean triggerTooltip;
    private Object value;
    private AxisPointerStatus status;
    private Handle<AxisPointer<P>> handle;


    public AxisPointer<P> show(Boolean show) {
        this.show = show;
        return this;
    }

    public AxisPointer<P> type(AxisPointerType type) {
        this.type = type;
        return this;
    }

    public AxisPointer<P> snap(Boolean snap) {
        this.snap = snap;
        return this;
    }

    public AxisPointer<P> z(Integer z) {
        this.z = z;
        return this;
    }

    public LineStyle<AxisPointer<P>, LineStyle> lineStyle() {
        if (lineStyle == null) {
            lineStyle = new LineStyle<>();
            lineStyle.parent(this);
        }
        return lineStyle;
    }

    public AxisPointer<P> lineStyle(LineStyle<AxisPointer<P>, LineStyle> lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public ShadowStyle<AxisPointer<P>> shadowStyle() {
        if (shadowStyle == null) {
            shadowStyle = new ShadowStyle<>();
            shadowStyle.parent(this);
        }
        return shadowStyle;
    }

    public AxisPointer<P> shadowStyle(ShadowStyle<AxisPointer<P>> shadowStyle) {
        this.shadowStyle = shadowStyle;
        return this;
    }

    public AxisPointer<P> triggerTooltip(Boolean triggerTooltip) {
        this.triggerTooltip = triggerTooltip;
        return this;
    }

    public AxisPointer<P> value(Object value) {
        this.value = value;
        return this;
    }

    public AxisPointer<P> status(AxisPointerStatus status) {
        this.status = status;
        return this;
    }

    public Handle<AxisPointer<P>> handle() {
        if (handle == null) {
            handle = new Handle<>();
            handle.parent(this);
        }

        return handle;
    }

    public AxisPointer<P> handle(Handle<AxisPointer<P>> handle) {
        this.handle = handle;
        return this;
    }
}
