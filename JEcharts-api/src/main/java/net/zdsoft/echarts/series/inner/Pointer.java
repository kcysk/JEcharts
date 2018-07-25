package net.zdsoft.echarts.series.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.series.Gauge;

/**
 * @author shenke
 * @since 2018/7/25 下午5:59
 */
@Getter
@Setter
public class Pointer extends AbstractParent<Gauge, Pointer> {

    private Boolean show;
    private Object length;
    private Object width;
}
