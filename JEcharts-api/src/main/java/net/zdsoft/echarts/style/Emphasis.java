/**
 * FileName: Emphasis.java
 * Author:   shenke
 * Date:     2018/6/13 下午2:28
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;

/**
 * @author shenke
 * @since 2018/6/13 下午2:28
 */
@Getter
@Setter
public class Emphasis<P> extends AbstractParent<P, Emphasis> {

    private ItemStyle<Emphasis<P>, ItemStyle> itemStyle;
    private Label<Emphasis<P>> label;

    //-------部分参数对于某些组件不适用-----------//

    private LineStyle<Emphasis<P>, LineStyle> lineStyle;
    private AreaStyle<Emphasis<P>, AreaStyle> areaStyle;

    public ItemStyle<Emphasis<P>, ItemStyle> itemStyle() {
        if (itemStyle == null) {
            itemStyle = new ItemStyle<>();
            itemStyle.parent(this);
        }
        return itemStyle;
    }

    public Emphasis<P> itemStyle(ItemStyle<Emphasis<P>, ItemStyle> itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Label<Emphasis<P>> label() {
        if (label == null) {
            label = new Label<>();
        }
        return label;
    }

    public Emphasis<P> label(Label<Emphasis<P>> label) {
        this.label = label;
        return this;
    }

    public LineStyle<Emphasis<P>, LineStyle> lineStyle() {
        if (lineStyle == null) {
            lineStyle = new LineStyle<>();
            lineStyle.parent(this);
        }
        return lineStyle;
    }

    public Emphasis<P> lineStyle(LineStyle<Emphasis<P>, LineStyle> lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    public AreaStyle<Emphasis<P>, AreaStyle> areaStyle() {
        if (areaStyle == null) {
            areaStyle = new AreaStyle<>();
            areaStyle.parent(this);
        }
        return areaStyle;
    }

    public Emphasis<P> areaStyle(AreaStyle<Emphasis<P>, AreaStyle> areaStyle) {
        this.areaStyle = areaStyle;
        return this;
    }
}
