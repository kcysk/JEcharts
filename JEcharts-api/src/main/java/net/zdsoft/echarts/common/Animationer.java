/**
 * FileName: Animationer.java
 * Author:   shenke
 * Date:     2018/6/13 下午4:29
 * Descriptor:
 */
package net.zdsoft.echarts.common;

import lombok.Getter;
import lombok.Setter;

/**
 * 可以更改动画效果的系列
 * @author shenke
 * @since 2018/6/13 下午4:29
 */
@Getter
@Setter
public abstract class Animationer<P, S extends Animationer> extends AbstractParent<P, S> {

    private Boolean animation;
    private Integer animationThreshold;
    private Object animationDuration;
    private Object animationEasing;
    private Object animationDelay;
    private Integer animationDurationUpdate;
    private Object animationEasingUpdate;
    private Object animationDelayUpdate;


    public S animation(Boolean animation) {
        this.animation = animation;
        return (S) this;
    }

    public S animationThreshold(Integer animationThreshold) {
        this.animationThreshold = animationThreshold;
        return (S) this;
    }

    public S animationDuration(Object animationDuration) {
        this.animationDuration = animationDuration;
        return (S) this;
    }

    public S animationEasing(Object animationEasing) {
        this.animationEasing = animationEasing;
        return (S) this;
    }

    public S animationDelay(Object animationDelay) {
        this.animationDelay = animationDelay;
        return (S) this;
    }

    public S animationDurationUpdate(Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return (S) this;
    }

    public S animationEasingUpdate(Object animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
        return (S) this;
    }

    public S animationDelayUpdate(Object animationDelayUpdate) {
        this.animationDelayUpdate = animationDelayUpdate;
        return (S) this;
    }
}
