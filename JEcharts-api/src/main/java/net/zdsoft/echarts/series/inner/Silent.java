package net.zdsoft.echarts.series.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Target;
import net.zdsoft.echarts.series.data.Tooltip;

/**
 * @author shenke
 * @since 2018/8/24 10:28
 */
@Getter
@Setter
public class Silent {

    private String link;
    private Target target;
    private Silent[] children;
    private Tooltip<Silent> tooltip;
}
