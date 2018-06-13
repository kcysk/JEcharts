/**
 * FileName: StepEx.java
 * Author:   shenke
 * Date:     2018/6/13 下午3:59
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import lombok.Setter;

/**
 * @author shenke
 * @since 2018/6/13 下午3:59
 */
public class StepEx implements Step {
    StepEx() {
    }

    @Setter
    private Boolean value;

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }


    public StepEx value(Boolean value) {
        this.value = value;
        return this;
    }

    public static StepEx create(Boolean value) {
        return new StepEx().value(value);
    }
}
