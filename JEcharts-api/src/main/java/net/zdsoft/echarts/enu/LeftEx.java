/**
 * FileName: LeftEx.java
 * Author:   shenke
 * Date:     2018/6/12 下午11:37
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import lombok.Setter;

/**
 * @author shenke
 * @since 2018/6/12 下午11:37
 */
@Setter
final public class LeftEx implements Left {

    LeftEx() {

    }

    @Setter
    private Object value;

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }

    public static Left create(String value) {
        LeftEx leftEx = new LeftEx();
        leftEx.setValue(value);
        return leftEx;
    }

    public static Left create(Integer value) {
        LeftEx leftEx = new LeftEx();
        leftEx.setValue(value);
        return leftEx;
    }
}
