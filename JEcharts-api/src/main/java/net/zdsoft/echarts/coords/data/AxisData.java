/**
 * FileName: AxisData.java
 * Author:   shenke
 * Date:     2018/6/14 下午4:35
 * Descriptor:
 */
package net.zdsoft.echarts.coords.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.Data;

/**
 * @author shenke
 * @since 2018/6/14 下午4:35
 */
@Getter
@Setter
final public class AxisData implements Data<AxisData> {

    private Object value;
    private AxisDataTextStyle<AxisData> textStyle;


    public AxisData value(Object value) {
        this.value = value;
        return this;
    }

    public AxisData textStyle(AxisDataTextStyle<AxisData> textStyle) {
        this.textStyle = textStyle;
        return this;
    }
}
