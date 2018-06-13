/**
 * FileName: TopEx.java
 * Author:   shenke
 * Date:     2018/6/12 下午11:48
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import lombok.Setter;

/**
 * @author shenke
 * @since 2018/6/12 下午11:48
 */
final public class TopEx implements Top {

    TopEx() {
    }

    @Setter
    private Object value;

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }

    public static Top create(Integer value) {
        TopEx topEx = new TopEx();
        topEx.setValue(value);
        return topEx;
    }

    public static Top create(String value) {
        TopEx topEx = new TopEx();
        topEx.setValue(value);
        return topEx;
    }
}
