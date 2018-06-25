/**
 * FileName: AxisData.java
 * Author:   shenke
 * Date:     2018/6/14 下午4:35
 * Descriptor:
 */
package net.zdsoft.echarts.coords.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.common.Data;

import java.util.Objects;

/**
 * @author shenke
 * @since 2018/6/14 下午4:35
 */
@Getter
@Setter
final public class AxisData<P> extends AbstractParent<P, AxisData> implements Data<AxisData> {

    private String value;
    private AxisDataTextStyle<AxisData<P>> textStyle;


    public AxisData<P> value(String value) {
        this.value = value;
        return this;
    }

    public AxisData<P> textStyle(AxisDataTextStyle<AxisData<P>> textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AxisData<?> data = (AxisData<?>) o;
        return Objects.equals(value, data.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}
