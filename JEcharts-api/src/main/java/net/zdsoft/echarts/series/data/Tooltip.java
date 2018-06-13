/**
 * FileName: Tooltip.java
 * Author:   shenke
 * Date:     2018/6/13 下午5:21
 * Descriptor:
 */
package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.Position;
import net.zdsoft.echarts.style.TextStyle;

/**
 * 注意：series.data.tooltip 仅在 tooltip.trigger 为 'item' 时有效。
 * @author shenke
 * @since 2018/6/13 下午5:21
 */
@Getter
@Setter
public class Tooltip<P> extends AbstractParent<P, Tooltip> {

    /**
     * 注意：series.data.tooltip 仅在 tooltip.trigger 为 'item' 时有效。
     *
     * 对于PositionEnum中定义的参数，仅有部分可用
     * http://echarts.baidu.com/option.html#series-line.data.tooltip.position
     */
    private Position position;
    /**
     * 注意：series.data.tooltip 仅在 tooltip.trigger 为 'item' 时有效。
     *
     * 提示框浮层内容格式器，支持字符串模板和回调函数两种形式。
     *
     * 1, 字符串模板
     *
     * 模板变量有 {a}, {b}，{c}，{d}，{e}，分别表示系列名，数据名，数据值等。 在 trigger 为 'axis' 的时候，会有多个系列的数据，此时可以通过 {a0}, {a1}, {a2} 这种后面加索引的方式表示系列的索引。 不同图表类型下的 {a}，{b}，{c}，{d} 含义不一样。 其中变量{a}, {b}, {c}, {d}在不同图表类型下代表数据含义为：
     *
     * 折线（区域）图、柱状（条形）图、K线图 : {a}（系列名称），{b}（类目值），{c}（数值）, {d}（无）
     *
     * 散点图（气泡）图 : {a}（系列名称），{b}（数据名称），{c}（数值数组）, {d}（无）
     *
     * 地图 : {a}（系列名称），{b}（区域名称），{c}（合并数值）, {d}（无）
     *
     * 饼图、仪表盘、漏斗图: {a}（系列名称），{b}（数据项名称），{c}（数值）, {d}（百分比）
     *
     * 更多其它图表模板变量的含义可以见相应的图表的 label.formatter 配置项
     */
    private String formatter;
    private Object backgroundColor;
    private Object borderColor;
    private Integer borderWidth;
    private Integer padding;

    private TextStyle<Tooltip<P>, TextStyle> textStyle;
    private String extraCssText;
}
