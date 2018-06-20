/**
 * FileName: Continuous.java
 * Author:   shenke
 * Date:     2018/6/16 上午9:15
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import net.zdsoft.echarts.element.inner.VisualMapRange;

/**
 * @author shenke
 * @since 2018/6/16 上午9:15
 */
final public class Continuous extends VisualMap<Continuous> {

    public VisualMapRange<Continuous> inRange() {
        if (inRange == null) {
            inRange = new VisualMapRange<>();
            inRange.parent(this);
        }
        return inRange;
    }

    @Override
    public VisualMap inRange(VisualMapRange<Continuous> inRange) {
        return super.inRange(inRange);
    }

    public VisualMapRange<Continuous> outRange() {
        if (outRange == null) {
            outRange = new VisualMapRange<>();
            outRange.parent(this);
        }
        return outRange;
    }

    @Override
    public VisualMap outRange(VisualMapRange<Continuous> outRange) {
        return super.outRange(outRange);
    }
}
