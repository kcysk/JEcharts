package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.coords.AxisLabel;
import net.zdsoft.echarts.coords.AxisLine;
import net.zdsoft.echarts.coords.AxisTick;
import net.zdsoft.echarts.coords.SplitLine;
import net.zdsoft.echarts.element.Title;
import net.zdsoft.echarts.series.data.GaugeData;
import net.zdsoft.echarts.series.data.Tooltip;
import net.zdsoft.echarts.series.inner.Detail;
import net.zdsoft.echarts.series.inner.Pointer;
import net.zdsoft.echarts.style.Emphasis;


/**
 * @author shenke
 * @since 2018/7/25 下午6:00
 */
@Getter
@Setter
public class Gauge extends Series<Gauge, GaugeData> {

    private Object radius;
    private Object[] center;
    private Double startAngle;
    private Double endAngle;
    private Boolean clockwise;
    private Object min;
    private Object max;
    private Integer splitNumber;
    private AxisLine<Gauge> axisLine;
    private SplitLine<Gauge> splitLine;
    private AxisTick<Gauge> axisTick;
    private AxisLabel<Gauge> axisLabel;
    private Pointer pointer;
    private Emphasis<Gauge> emphasis;
    private Title title;
    private Detail detail;
    private Tooltip<Gauge> tooltip;

    @Override
    public GaugeData create() {
        GaugeData data = (GaugeData)(new GaugeData()).parent(this);
        return data;
    }
}
