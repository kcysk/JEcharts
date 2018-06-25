/**
 * FileName: Indicator.java
 * Author:   shenke
 * Date:     2018/6/21 下午2:46
 * Descriptor:
 */
package net.zdsoft.echarts.element.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.coords.radar.Radar;

import java.util.Objects;

/**
 * @author shenke
 * @since 2018/6/21 下午2:46
 */
@Getter
@Setter
final public class Indicator extends AbstractParent<Radar, Indicator> {

    private String name;
    private Double max;
    private Double min;
    private Object color;


    public Indicator name(String name) {
        this.name = name;
        return this;
    }

    public Indicator max(Double max) {
        this.max = max;
        return this;
    }

    public Indicator min(Double min) {
        this.min = min;
        return this;
    }

    public Indicator color(Object color) {
        this.color = color;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Indicator indicator = (Indicator) o;
        return Objects.equals(name, indicator.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
