/**
 * FileName: Pie.java
 * Author:   shenke
 * Date:     2018/6/13 下午8:55
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.RoseType;
import net.zdsoft.echarts.enu.SelectedMode;
import net.zdsoft.echarts.enu.SeriesLayoutBy;
import net.zdsoft.echarts.series.data.PieData;
import net.zdsoft.echarts.series.data.Tooltip;

/**
 * @author shenke
 * @since 2018/6/13 下午8:55
 */
@Getter
@Setter
final public class Pie extends Series<Pie, PieData> {

    private Boolean legendHoverLink;
    private Boolean hoverAnimation;
    private Integer hoverOffset;

    private SelectedMode selectedMode;
    private Integer selectedOffset;
    private Boolean clockwise;
    private Integer startAngle;
    private Integer minAngle;
    private RoseType roseType;
    /**
     * 是否启用防止标签重叠策略，默认开启，在标签拥挤重叠的情况下会挪动各个标签的位置，防止标签间的重叠。
     *
     * 如果不需要开启该策略，例如圆环图这个例子中需要强制所有标签放在中心位置，可以将该值设为 false
     */
    private Boolean avoidLabelOverlap;
    /**
     * 是否在数据和为0（一般情况下所有数据为0） 的时候不显示扇区
     */
    private Boolean stillShowZeroSum;
    private String cursor;
    private String[] center;
    private Object[] radius;
    private SeriesLayoutBy seriesLayoutBy;
    private Integer datasetIndex;

    private Tooltip<Pie> tooltip;

    @Override
    public PieData create() {
        PieData data = new PieData();
        data.parent(this);
        return data;
    }
}
