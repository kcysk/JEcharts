/**
 * FileName: RoamEx.java
 * Author:   shenke
 * Date:     2018/6/13 下午1:49
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import lombok.Setter;

/**
 * @author shenke
 * @since 2018/6/13 下午1:49
 */
final public class RoamEx implements Roam {
    RoamEx() {
    }

    @Setter
    private Boolean value;

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }


    public RoamEx value(Boolean value) {
        this.value = value;
        return this;
    }

    public static Roam disable() {
        return new RoamEx().value(Boolean.FALSE);
    }

    public static Roam enable() {
        return new RoamEx().value(Boolean.TRUE);
    }
}
