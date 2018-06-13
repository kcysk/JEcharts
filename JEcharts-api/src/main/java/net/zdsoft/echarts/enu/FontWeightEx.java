/**
 * FileName: FontWeightEx.java
 * Author:   shenke
 * Date:     2018/6/13 上午10:43
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import lombok.Setter;

/**
 * @author shenke
 * @since 2018/6/13 上午10:43
 */
@Setter
final public class FontWeightEx implements FontWeight {

    FontWeightEx() {
    }

    private Object value;

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }

    public static FontWeight create(Integer val) {
        FontWeightEx ex = new FontWeightEx();
        ex.setValue(val);
        return ex;
    }

    public static FontWeight create(String val) {
        FontWeightEx ex = new FontWeightEx();
        ex.setValue(val);
        return ex;
    }

    public FontWeightEx value(Object value) {
        this.value = value;
        return this;
    }
}
