/**
 * FileName: Funnel.java
 * Author:   shenke
 * Date:     2018/6/14 上午11:00
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.FunnelAlign;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.enu.SeriesLayoutBy;
import net.zdsoft.echarts.enu.Sort;
import net.zdsoft.echarts.series.data.FunnelData;
import net.zdsoft.echarts.series.data.Tooltip;
import net.zdsoft.echarts.series.inner.LabelLine;

/**
 * @author shenke
 * @since 2018/6/14 上午11:00
 */
@Getter
@Setter
final public class Funnel extends Series<Funnel, FunnelData> {

    private Integer min;
    private Integer max;
    private Object minSize;
    private Object maxSize;
    private Sort sort;
    private Integer gap;
    private Boolean legendHoverLink;
    private FunnelAlign funnelAlign;

    private SeriesLayoutBy seriesLayoutBy;
    private Integer datasetIndex;

    private Tooltip<Funnel> tooltip;
    private LabelLine<Funnel> labelLine;

    public Funnel() {
        type(SeriesEnum.funnel);
    }

    @Override
    public FunnelData create() {
        FunnelData funnelData = new FunnelData();
        funnelData.parent(this);
        return funnelData;
    }


    public Funnel min(Integer min) {
        this.min = min;
        return this;
    }

    public Funnel max(Integer max) {
        this.max = max;
        return this;
    }

    public Funnel minSize(Object minSize) {
        this.minSize = minSize;
        return this;
    }

    public Funnel maxSize(Object maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    public Funnel sort(Sort sort) {
        this.sort = sort;
        return this;
    }

    public Funnel gap(Integer gap) {
        this.gap = gap;
        return this;
    }

    public Funnel legendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
        return this;
    }

    public Funnel funnelAlign(FunnelAlign funnelAlign) {
        this.funnelAlign = funnelAlign;
        return this;
    }

    public Funnel seriesLayoutBy(SeriesLayoutBy seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public Funnel datasetIndex(Integer datasetIndex) {
        this.datasetIndex = datasetIndex;
        return this;
    }

    public Tooltip<Funnel> tooltip() {
        if (tooltip == null) {
            tooltip = new Tooltip<>();
            tooltip.parent(this);
        }
        return tooltip;
    }

    public Funnel tooltip(Tooltip<Funnel> tooltip) {
        this.tooltip = tooltip;
        return this;
    }
    public Funnel labelLine(LabelLine<Funnel> labelLine) {
        this.labelLine = labelLine;
        return this;
    }
}
