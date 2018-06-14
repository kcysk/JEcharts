/**
 * FileName: Effect.java
 * Author:   shenke
 * Date:     2018/6/14 上午10:33
 * Descriptor:
 */
package net.zdsoft.echarts.series.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.series.Lines;

/**
 * @author shenke
 * @since 2018/6/14 上午10:33
 */
@Getter
@Setter
final public class Effect extends AbstractParent<Lines, Effect> {

    private Boolean show;
    private Integer period;
    private Object delay;
    private Integer constantSpeed;
    private Symbol symbol;
    private Object symbolSize;
    private Object color;
    private Double trailLength;
    private Boolean loop;


    public Effect show(Boolean show) {
        this.show = show;
        return this;
    }

    public Effect period(Integer period) {
        this.period = period;
        return this;
    }

    public Effect delay(Object delay) {
        this.delay = delay;
        return this;
    }

    public Effect constantSpeed(Integer constantSpeed) {
        this.constantSpeed = constantSpeed;
        return this;
    }

    public Effect symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public Effect symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Effect color(Object color) {
        this.color = color;
        return this;
    }

    public Effect trailLength(Double trailLength) {
        this.trailLength = trailLength;
        return this;
    }

    public Effect loop(Boolean loop) {
        this.loop = loop;
        return this;
    }
}
