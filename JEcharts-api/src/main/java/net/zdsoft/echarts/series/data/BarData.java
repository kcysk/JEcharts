/**
 * FileName: BarData.java
 * Author:   shenke
 * Date:     2018/6/13 下午5:52
 * Descriptor:
 */
package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.series.Bar;

/**
 * @author shenke
 * @since 2018/6/13 下午5:52
 */
@Getter
@Setter
final public class BarData extends CommonSData<Bar, BarData> {

    private Tooltip<BarData> tooltip;

    public Tooltip<BarData> tooltip() {
        tooltip = super.build( this, tooltip, Tooltip::new);
        return tooltip;
    }

    public BarData tooltip(Tooltip<BarData> tooltip) {
        this.tooltip = tooltip;
        return this;
    }
}