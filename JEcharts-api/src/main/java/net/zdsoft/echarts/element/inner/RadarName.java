/**
 * FileName: RadarName.java
 * Author:   shenke
 * Date:     2018/6/14 下午5:09
 * Descriptor:
 */
package net.zdsoft.echarts.element.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.element.Radar;
import net.zdsoft.echarts.style.AbstractLabel;

/**
 * @author shenke
 * @since 2018/6/14 下午5:09
 */
@Getter
@Setter
final public class RadarName extends AbstractLabel<Radar, RadarName> {

    /* not support */

    @Override
    public RadarName rotate(Integer rotate) {
        return this;
    }

    @Override
    public RadarName offset(Integer[] offset) {
        return this;
    }

    @Override
    public RadarName formatter(Object formatter) {
        return this;
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
    public void setRotate(Integer rotate) {
    }

    @Override
    public void setOffset(Integer[] offset) {
    }

    @Override
    public void setFormatter(Object formatter) {
    }
}
