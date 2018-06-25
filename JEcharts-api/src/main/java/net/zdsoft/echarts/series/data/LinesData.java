/**
 * FileName: LinesData.java
 * Author:   shenke
 * Date:     2018/6/14 上午10:13
 * Descriptor:
 */
package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.series.Lines;

/**
 * @author shenke
 * @since 2018/6/14 上午10:13
 */
@Getter
@Setter
final public class LinesData extends CommonSData<Lines, LinesData> {

    private Object[][] coords;

    public LinesData coords(Object[][] coords) {
        this.coords = coords;
        return this;
    }
}
