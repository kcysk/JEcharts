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
import net.zdsoft.echarts.coords.cartesian2d.Cartesian2dAxis;
import net.zdsoft.echarts.coords.polar.AngleAxis;
import net.zdsoft.echarts.coords.polar.RadiusAxis;
import net.zdsoft.echarts.element.Geo;
import net.zdsoft.echarts.element.Grid;
import net.zdsoft.echarts.element.Legend;
import net.zdsoft.echarts.element.Title;
import net.zdsoft.echarts.series.Series;
import net.zdsoft.echarts.style.TextStyle;

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
    private Grid grid;
    private Geo geo;
    private Cartesian2dAxis xAxis;
    private Cartesian2dAxis yAxis;
    private RadiusAxis radiusAxis;
    private AngleAxis angleAxis;
    private List<Series> series;

    //------------ 样式 ------------//

    /**
     * 颜色，如果系列没有设置颜色，则会依此循环从该列表中取颜色
     * 默认为：
     *
     * ['#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83',  '#ca8622', '#bda29a','#6e7074', '#546570', '#c4ccd3']
     */
    private Object color;
    /**
     * 背景色，默认无背景。
     *
     * 颜色可以使用 RGB 表示，比如 'rgb(128, 128, 128)'，
     * 如果想要加上 alpha 通道表示不透明度，可以使用 RGBA，比如 'rgba(128, 128, 128, 0.5)'，
     * 也可以使用十六进制格式，比如 '#ccc'。除了纯色之外颜色也支持渐变色和纹理填充
     *
     * 具体请参考 http://echarts.baidu.com/option.html#backgroundColor
     */
    private Object backgroundColor;
    private TextStyle textStyle;
    private Object blendMode;
    private Integer hoverLayerThreshold;
    /**
     * 是否使用 UTC 时间。
     *
     * true: 表示 axis.type 为 'time' 时，依据 UTC 时间确定 tick 位置，并且 axisLabel 和 tooltip 默认展示的是 UTC 时间。
     * false: 表示 axis.type 为 'time' 时，依据本地时间确定 tick 位置，并且 axisLabel 和 tooltip 默认展示的是本地时间。
     * 默认取值为false，即使用本地时间。因为考虑到：
     *
     * 很多情况下，需要展示为本地时间（无论服务器存储的是否为 UTC 时间）。
     * 如果 data 中的时间为 '2012-01-02' 这样的没有指定时区的时间表达式，往往意为本地时间。默认情况下，时间被展示时需要和输入一致而非有时差。
     * 注意，这个参数实际影响的是『展示』，而非用户输入的时间值的解析。 关于用户输入的时间值（例如 1491339540396, '2013-01-04' 等）的解析，参见 date 中时间相关部分。
     */
    private Boolean useUTC;
}
