/**
 * FileName: Polar.java
 * Author:   shenke
 * Date:     2018/6/20 下午3:20
 * Descriptor:
 */
package net.zdsoft.echarts.coords.polar;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.common.IRoot;
import net.zdsoft.echarts.coords.AxisPointer;
import net.zdsoft.echarts.enu.Position;
import net.zdsoft.echarts.enu.Trigger;
import net.zdsoft.echarts.style.TextStyle;

/**
 * @author shenke
 * @since 2018/6/20 下午3:20
 */
@Getter
@Setter
final public class Polar extends IRoot<Polar> {
    private String id;
    private Integer zlevel;
    private Integer z;
    private Object[] center;
    private Object[] radius;
    private Tooltip tooltip;


    public Polar id(String id) {
        this.id = id;
        return this;
    }

    public Polar zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return this;
    }

    public Polar z(Integer z) {
        this.z = z;
        return this;
    }

    public Polar center(Object[] center) {
        this.center = center;
        return this;
    }

    public Polar radius(Object[] radius) {
        this.radius = radius;
        return this;
    }

    public Tooltip tooltip() {
        if (tooltip == null) {
            tooltip = new Tooltip();
            tooltip.parent(this);
        }
        return tooltip;
    }

    public Polar tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    @Getter
    @Setter
    public static class Tooltip extends AbstractParent<Polar, Tooltip> {

        private Boolean show;
        private Trigger trigger;
        private AxisPointer<Tooltip> axisPointer;
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

        private TextStyle<Tooltip, TextStyle> textStyle;
        private String extraCssText;


        public Tooltip show(Boolean show) {
            this.show = show;
            return this;
        }

        public Tooltip trigger(Trigger trigger) {
            this.trigger = trigger;
            return this;
        }

        public Tooltip axisPointer(AxisPointer<Tooltip> axisPointer) {
            this.axisPointer = axisPointer;
            return this;
        }

        public Tooltip position(Position position) {
            this.position = position;
            return this;
        }

        public Tooltip formatter(String formatter) {
            this.formatter = formatter;
            return this;
        }

        public Tooltip backgroundColor(Object backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Tooltip borderColor(Object borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public Tooltip borderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        public Tooltip padding(Integer padding) {
            this.padding = padding;
            return this;
        }

        public Tooltip textStyle(TextStyle<Tooltip, TextStyle> textStyle) {
            this.textStyle = textStyle;
            return this;
        }

        public Tooltip extraCssText(String extraCssText) {
            this.extraCssText = extraCssText;
            return this;
        }
    }
}
