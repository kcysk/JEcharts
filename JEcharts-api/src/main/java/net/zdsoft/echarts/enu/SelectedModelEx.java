/**
 * FileName: SelectedModelEx.java
 * Author:   shenke
 * Date:     2018/6/13 下午1:02
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import lombok.Setter;

/**
 * @author shenke
 * @since 2018/6/13 下午1:02
 */
@Setter
final public class SelectedModelEx implements SelectedMode {

    SelectedModelEx() {
    }

    private Boolean value;

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }

    public static SelectedMode enable() {
        SelectedModelEx ex = new SelectedModelEx();
        ex.setValue(Boolean.TRUE);
        return ex;
    }

    public static SelectedMode disable() {
        SelectedModelEx ex = new SelectedModelEx();
        ex.setValue(Boolean.FALSE);
        return ex;
    }
}
