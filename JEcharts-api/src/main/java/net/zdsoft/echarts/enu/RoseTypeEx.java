/**
 * FileName: RoseTypeEx.java
 * Author:   shenke
 * Date:     2018/6/13 下午10:51
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import lombok.Setter;

/**
 * @author shenke
 * @since 2018/6/13 下午10:51
 */
public class RoseTypeEx implements RoseType {

    @Setter
    private Boolean value;

    RoseTypeEx() {
    }

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }

    public RoseTypeEx value(Boolean value) {
        this.value = value;
        return this;
    }
}
