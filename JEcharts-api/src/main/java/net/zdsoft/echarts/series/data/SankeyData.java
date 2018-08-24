package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.series.Sankey;

/**
 * @author shenke
 * @since 2018/8/24 11:47
 */
@Getter
@Setter
public class SankeyData extends CommonSData<Sankey, SankeyData> {

    private Tooltip<SankeyData> tooltip;
}
