/**
 * FileName: AxisDataTextStyle.java
 * Author:   shenke
 * Date:     2018/6/14 下午4:39
 * Descriptor:
 */
package net.zdsoft.echarts.coords.data;

import net.zdsoft.echarts.style.AbstractLabel;

/**
 * @author shenke
 * @since 2018/6/14 下午4:39
 */
final public class AxisDataTextStyle<P> extends AbstractLabel<P, AxisDataTextStyle> {

    /* not support */

    @Override
    public AxisDataTextStyle<P> show(Boolean show) {
        return this;
    }

    @Override
    public AxisDataTextStyle<P> rotate(Integer rotate) {
        return this;
    }

    @Override
    public AxisDataTextStyle<P> offset(Integer[] offset) {
        return this;
    }

    @Override
    public AxisDataTextStyle<P> formatter(Object formatter) {
        return this;
    }

    @Override
    public Boolean getShow() {
        return null;
    }

    @Override
    public Integer getRotate() {
        return null;
    }

    @Override
    public Integer[] getOffset() {
        return null;
    }

    @Override
    public Object getFormatter() {
        return null;
    }

    @Override
    public void setShow(Boolean show) {
    }

    @Override
    public void setRotate(Integer rotate) {
    }

    @Override
    public void setOffset(Integer[] offset) {
    }

    @Override
    public void setFormatter(Object formatter) {
    }
}
