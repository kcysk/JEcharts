/**
 * FileName: PieData.java
 * Author:   shenke
 * Date:     2018/6/13 下午8:54
 * Descriptor:
 */
package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.series.Pie;

/**
 * @author shenke
 * @since 2018/6/13 下午8:54
 */
@Getter
@Setter
final public class PieData extends CommonSData<Pie, PieData> {

    private Boolean selected;
    private Tooltip<BarData> tooltip;


}
