/**
 * FileName: OnMouseWheelEx.java
 * Author:   shenke
 * Date:     2018/6/20 上午11:59
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import lombok.Getter;

/**
 * @author shenke
 * @since 2018/6/20 上午11:59
 */
final public class OnMouseWheelEx implements OnMouseWheel {

    @Getter
    private Boolean value;

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }

    public OnMouseWheelEx value(Boolean value) {
        this.value = value;
        return this;
    }
}
