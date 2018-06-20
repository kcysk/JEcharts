/**
 * FileName: DataBackground.java
 * Author:   shenke
 * Date:     2018/6/20 下午12:43
 * Descriptor:
 */
package net.zdsoft.echarts.element.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.element.SliderDataZoom;
import net.zdsoft.echarts.style.AreaStyle;
import net.zdsoft.echarts.style.LineStyle;

/**
 * @author shenke
 * @since 2018/6/20 下午12:43
 */
@Getter
@Setter
final public class DataBackground extends AbstractParent<SliderDataZoom, DataBackground> {

    private LineStyle<DataBackground, LineStyle> lineStyle;
    private AreaStyle<DataBackground, AreaStyle> areaStyle;


    public LineStyle<DataBackground, LineStyle> lineStyle() {
        if (lineStyle == null) {
            lineStyle = new LineStyle<>();
            lineStyle.parent(this);
        }
        return lineStyle;
    }

    public DataBackground lineStyle(LineStyle<DataBackground, LineStyle> lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public AreaStyle<DataBackground, AreaStyle> areaStyle() {
        if (areaStyle == null) {
            areaStyle = new AreaStyle<>();
            areaStyle.parent(this);
        }
        return areaStyle;
    }

    public DataBackground areaStyle(AreaStyle<DataBackground, AreaStyle> areaStyle) {
        this.areaStyle = areaStyle;
        return this;
    }
}
