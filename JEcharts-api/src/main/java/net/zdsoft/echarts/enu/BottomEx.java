/**
 * FileName: BottomEx.java
 * Author:   shenke
 * Date:     2018/6/13 上午9:47
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import lombok.Setter;

/**
 * @author shenke
 * @since 2018/6/13 上午9:47
 */
final public class BottomEx implements Bottom {

    BottomEx() {

    }

    @Setter
    private Object value;

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }

    public static Bottom create(Object value) {
        return new BottomEx().value(value);
    }


    public BottomEx value(Object value) {
        this.value = value;
        return this;
    }
}
