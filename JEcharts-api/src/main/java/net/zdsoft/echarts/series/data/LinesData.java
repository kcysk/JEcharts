/**
 * FileName: LinesData.java
 * Author:   shenke
 * Date:     2018/6/14 上午10:13
 * Descriptor:
 */
package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.exception.NotSupportExcetion;
import net.zdsoft.echarts.series.Lines;

/**
 * @author shenke
 * @since 2018/6/14 上午10:13
 */
@Getter
@Setter
final public class LinesData extends CommonSData<Lines, LinesData> {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public void setValue(Object value) {
        throw new NotSupportExcetion("option.series.data[type='lines'] not support name");
    }

    @Override
    public void setName(String name) {
        throw new NotSupportExcetion("option.series.data[type='lines'] not support value");
    }
}
