/**
 * FileName: Option.java
 * Author:   shenke
 * Date:     2018/6/12 下午8:57
 * Descriptor:
 */
package net.zdsoft.echarts;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.Animationer;
import net.zdsoft.echarts.coords.AxisPointer;
import net.zdsoft.echarts.coords.cartesian2d.Cartesian2dAxis;
import net.zdsoft.echarts.coords.polar.AngleAxis;
import net.zdsoft.echarts.coords.polar.RadiusAxis;
import net.zdsoft.echarts.element.DataZoom;
import net.zdsoft.echarts.coords.geo.Geo;
import net.zdsoft.echarts.coords.cartesian2d.Grid;
import net.zdsoft.echarts.element.Legend;
import net.zdsoft.echarts.coords.polar.Polar;
import net.zdsoft.echarts.coords.radar.Radar;
import net.zdsoft.echarts.element.Title;
import net.zdsoft.echarts.element.Tooltip;
import net.zdsoft.echarts.element.VisualMap;
import net.zdsoft.echarts.series.Series;
import net.zdsoft.echarts.style.TextStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenke
 * @since 2018/6/12 下午8:57
 */
@Getter
@Setter
public class Option extends Animationer<Option, Option> {

    //------------- 组件 -----------//
    /**
     * 标题
     */
    private Title title;
    private Legend legend;
    private List<Grid> grid;
    private List<Cartesian2dAxis> xAxis;
    private List<Cartesian2dAxis> yAxis;
    private List<Polar> polar;
    private List<RadiusAxis> radiusAxis;
    private List<AngleAxis> angleAxis;
    private List<Radar> radar;
    private List<DataZoom> dataZoom;
    private List<VisualMap> visualMap;

    private Tooltip tooltip;
    private AxisPointer<Option> axisPointer;
    private List<Geo> geo;
    private List<Series> series;

    //------------ 样式 ------------//

    /**
     * 颜色，如果系列没有设置颜色，则会依此循环从该列表中取颜色
     * 默认为：
     * <p>
     * ['#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83',  '#ca8622', '#bda29a','#6e7074', '#546570', '#c4ccd3']
     */
    private Object color;
    /**
     * 背景色，默认无背景。
     * <p>
     * 颜色可以使用 RGB 表示，比如 'rgb(128, 128, 128)'，
     * 如果想要加上 alpha 通道表示不透明度，可以使用 RGBA，比如 'rgba(128, 128, 128, 0.5)'，
     * 也可以使用十六进制格式，比如 '#ccc'。除了纯色之外颜色也支持渐变色和纹理填充
     * <p>
     * 具体请参考 http://echarts.baidu.com/option.html#backgroundColor
     */
    private Object backgroundColor;
    private TextStyle<Option, TextStyle> textStyle;
    private Object blendMode;
    private Integer hoverLayerThreshold;
    /**
     * 是否使用 UTC 时间。
     * <p>
     * true: 表示 axis.type 为 'time' 时，依据 UTC 时间确定 tick 位置，并且 axisLabel 和 tooltip 默认展示的是 UTC 时间。
     * false: 表示 axis.type 为 'time' 时，依据本地时间确定 tick 位置，并且 axisLabel 和 tooltip 默认展示的是本地时间。
     * 默认取值为false，即使用本地时间。因为考虑到：
     * <p>
     * 很多情况下，需要展示为本地时间（无论服务器存储的是否为 UTC 时间）。
     * 如果 data 中的时间为 '2012-01-02' 这样的没有指定时区的时间表达式，往往意为本地时间。默认情况下，时间被展示时需要和输入一致而非有时差。
     * 注意，这个参数实际影响的是『展示』，而非用户输入的时间值的解析。 关于用户输入的时间值（例如 1491339540396, '2013-01-04' 等）的解析，参见 date 中时间相关部分。
     */
    private Boolean useUTC;

    public Title title() {
        if (title == null) {
            title = new Title();
            title.option(this);
        }
        return title;
    }

    public Option title(Title title) {
        this.title = title;
        return this;
    }

    public Legend legend() {
        if (legend == null) {
            legend = new Legend().option(this);
        }
        return legend;
    }

    public Option legend(Legend legend) {
        this.legend = legend;
        return this;
    }

    public List<Grid> grid() {
        if (grid == null) {
            grid = new ArrayList<>();
        }
        return grid;
    }

    public Option grid(List<Grid> grid) {
        this.grid = grid;
        return this;
    }

    public List<Cartesian2dAxis> xAxis() {
        if (xAxis == null) {
            xAxis = new ArrayList<>();
        }
        return xAxis;
    }

    public Option xAxis(List<Cartesian2dAxis> xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public List<Cartesian2dAxis> yAxis () {
        if (yAxis == null) {
            yAxis = new ArrayList<>();
        }
        return yAxis;
    }

    public Option yAxis(List<Cartesian2dAxis> yAxis) {
        this.yAxis = yAxis;
        return this;
    }



    public Option dataZoom(DataZoom zoom) {
        if (dataZoom == null) {
            dataZoom = new ArrayList<>();
        }
        dataZoom.add(zoom);
        return this;
    }

    public Option dataZoom(List<DataZoom> dataZoom) {
        this.dataZoom = dataZoom;
        return this;
    }

    public Option visualMap(VisualMap vm) {
        if (visualMap == null) {
            visualMap = new ArrayList<>();
            visualMap.add(vm);
        }
        return this;
    }

    public Option visualMap(List<VisualMap> visualMap) {
        this.visualMap = visualMap;
        return this;
    }

    public AxisPointer<Option> axisPointer() {
        if (axisPointer == null) {
            axisPointer = new AxisPointer<>();
            axisPointer.parent(this);
        }
        return axisPointer;
    }

    public Option axisPointer(AxisPointer<Option> axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }

    public Option series(Series s) {
        if (series == null) {
            series = new ArrayList<>();
        }
        series.add(s);
        return this;
    }

    public List<Series> series() {
        if (series == null) {
            series = new ArrayList<>();
        }
        return series;
    }

    public Option series(List<Series> series) {
        this.series = series;
        return this;
    }

    public Option color(Object color) {
        this.color = color;
        return this;
    }

    public Option backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public TextStyle<Option, TextStyle> textStyle() {
        if (textStyle == null) {
            textStyle = new TextStyle<>();
            textStyle.parent(this);
        }
        return textStyle;
    }

    public Option textStyle(TextStyle<Option, TextStyle> textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Option blendMode(Object blendMode) {
        this.blendMode = blendMode;
        return this;
    }

    public Option hoverLayerThreshold(Integer hoverLayerThreshold) {
        this.hoverLayerThreshold = hoverLayerThreshold;
        return this;
    }

    public Option useUTC(Boolean useUTC) {
        this.useUTC = useUTC;
        return this;
    }

    public List<Polar> polar() {
        if (polar == null) {
            polar = new ArrayList<>();
        }
        return polar;
    }

    public Option polar(List<Polar> polar) {
        this.polar = polar;
        return this;
    }

    public List<RadiusAxis> radiusAxis() {
        if (radiusAxis == null) {
            radiusAxis = new ArrayList<>();
        }
        return radiusAxis;
    }

    public Option radiusAxis(List<RadiusAxis> radiusAxis) {
        this.radiusAxis = radiusAxis;
        return this;
    }

    public List<AngleAxis> angleAxis() {
        if (angleAxis == null) {
            angleAxis = new ArrayList<>();
        }
        return angleAxis;
    }

    public Option angleAxis(List<AngleAxis> angleAxis) {
        this.angleAxis = angleAxis;
        return this;
    }

    public List<Geo> geo() {
        if (geo == null) {
            geo = new ArrayList<>();
        }
        return geo;
    }

    public Option geo(List<Geo> geo) {
        this.geo = geo;
        return this;
    }

    public List<Radar> radar() {
        if (radar == null) {
            radar = new ArrayList<>();
        }
        return radar;
    }

    public Option radar(List<Radar> radar) {
        this.radar = radar;
        return this;
    }

    public Option tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }
}
