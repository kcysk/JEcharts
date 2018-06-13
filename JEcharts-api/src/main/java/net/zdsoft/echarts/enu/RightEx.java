/**
 * FileName: RightEx.java
 * Author:   shenke
 * Date:     2018/6/13 上午9:31
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import lombok.Setter;

/**
 * @author shenke
 * @since 2018/6/13 上午9:31
 */
final public class RightEx implements Right {

    RightEx() {
    }

    @Setter
    private Object value;

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }

    public static Right create(Integer value) {
        RightEx rightEx = new RightEx();
        rightEx.setValue(value);
        return rightEx;
    }

    public static Right create(String value) {
        RightEx rightEx = new RightEx();
        rightEx.setValue(value);
        return rightEx;
    }


}
