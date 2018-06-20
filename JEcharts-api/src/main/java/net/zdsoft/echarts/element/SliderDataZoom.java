/**
 * FileName: SliderDataZoom.java
 * Author:   shenke
 * Date:     2018/6/20 上午11:57
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.element.inner.DataBackground;
import net.zdsoft.echarts.element.inner.HandleStyle;
import net.zdsoft.echarts.enu.Bottom;
import net.zdsoft.echarts.enu.Left;
import net.zdsoft.echarts.enu.Right;
import net.zdsoft.echarts.enu.Top;
import net.zdsoft.echarts.style.TextStyle;

/**
 * @author shenke
 * @since 2018/6/20 上午11:57
 */
@Getter
@Setter
final public class SliderDataZoom extends DataZoom<SliderDataZoom> {

    private Boolean show;
    private Object backgroundColor;
    private DataBackground dataBackground;
    private Object fillerColor;
    private Object borderColor;
    private String handleIcon;
    private Object handleSize;
    private HandleStyle handleStyle;
    private Integer labelPrecision;
    private String labelFormatter;
    private Boolean showDetail;
    private String showDataShadow;
    private Boolean realtime;
    private TextStyle<SliderDataZoom, TextStyle> textStyle;

    private Integer zlevel;
    private Integer z;
    private Left left;
    private Top top;
    private Right right;
    private Bottom bottom;


    public SliderDataZoom show(Boolean show) {
        this.show = show;
        return this;
    }

    public SliderDataZoom backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public DataBackground dataBackground() {
        if (dataBackground == null) {
            dataBackground = new DataBackground();
            dataBackground.parent(this);
        }
        return dataBackground;
    }

    public SliderDataZoom dataBackground(DataBackground dataBackground) {
        this.dataBackground = dataBackground;
        return this;
    }

    public SliderDataZoom fillerColor(Object fillerColor) {
        this.fillerColor = fillerColor;
        return this;
    }

    public SliderDataZoom borderColor(Object borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public SliderDataZoom handleIcon(String handleIcon) {
        this.handleIcon = handleIcon;
        return this;
    }

    public SliderDataZoom handleSize(Object handleSize) {
        this.handleSize = handleSize;
        return this;
    }

    public SliderDataZoom handleStyle(HandleStyle handleStyle) {
        this.handleStyle = handleStyle;
        return this;
    }

    public SliderDataZoom labelPrecision(Integer labelPrecision) {
        this.labelPrecision = labelPrecision;
        return this;
    }

    public SliderDataZoom labelFormatter(String labelFormatter) {
        this.labelFormatter = labelFormatter;
        return this;
    }

    public SliderDataZoom showDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }

    public SliderDataZoom showDataShadow(String showDataShadow) {
        this.showDataShadow = showDataShadow;
        return this;
    }

    public SliderDataZoom realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    public TextStyle<SliderDataZoom, TextStyle> textStyle() {
        if (textStyle == null) {
            textStyle = new TextStyle<>();
            textStyle.parent(this);
        }
        return textStyle;
    }

    public SliderDataZoom textStyle(TextStyle<SliderDataZoom, TextStyle> textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public SliderDataZoom zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return this;
    }

    public SliderDataZoom z(Integer z) {
        this.z = z;
        return this;
    }

    public SliderDataZoom left(Left left) {
        this.left = left;
        return this;
    }

    public SliderDataZoom top(Top top) {
        this.top = top;
        return this;
    }

    public SliderDataZoom right(Right right) {
        this.right = right;
        return this;
    }

    public SliderDataZoom bottom(Bottom bottom) {
        this.bottom = bottom;
        return this;
    }
}
