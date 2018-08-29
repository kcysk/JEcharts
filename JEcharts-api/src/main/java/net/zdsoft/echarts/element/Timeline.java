/**
 * FileName: Timeline.java
 * Author:   shenke
 * Date:     2018/6/12 下午10:49
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Data;
import net.zdsoft.echarts.coords.enu.AxisType;
import net.zdsoft.echarts.element.inner.CheckpointStyle;
import net.zdsoft.echarts.element.inner.ControlStyle;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.ItemStyle;
import net.zdsoft.echarts.style.Label;
import net.zdsoft.echarts.style.LineStyle;

import java.util.List;

/**
 * timeline 组件，提供了在多个 ECharts option 间进行切换、播放等操作的功能。
 * @author shenke
 * @since 2018/6/12 下午10:49
 */
@Data
final public class Timeline extends BaseComponent<Timeline> {

    private String type = "slider";
    private AxisType axisType;
    private Integer currentIndex;
    private Boolean autoPlay;
    private Boolean rewind;
    private Boolean loop;
    private Integer playInterval;
    private Boolean realtime;
    private String controlPosition;
    private Boolean inverse;
    private Symbol symbol;
    private Integer symbolSize;
    private Integer symbolRotate;
    private Boolean symbolKeepAspect;
    private Object[] symbolOffset;
    private LineStyle<Timeline, LineStyle> lineStyle;
    private Label<Timeline> label;
    private ItemStyle<Timeline, ItemStyle> itemStyle;
    private Emphasis<Timeline> emphasis;
    private CheckpointStyle checkpointStyle;
    private ControlStyle controlStyle;
    private List<Object> data;
}
