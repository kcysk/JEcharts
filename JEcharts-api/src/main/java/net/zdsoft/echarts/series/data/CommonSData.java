/**
 * FileName: CommonSData.java
 * Author:   shenke
 * Date:     2018/6/13 下午4:58
 * Descriptor:
 */
package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.ItemStyle;
import net.zdsoft.echarts.style.Label;

import java.util.function.Supplier;

/**
 * @author shenke
 * @since 2018/6/13 下午4:58
 */
@Getter
@Setter
public abstract class CommonSData<P, CD extends CommonSData> extends AbstractParent<P, CD> implements SData<CD> {
    private String name;
    private Object value;

    private Label<CD> label;
    private ItemStyle<CD, ItemStyle> itemStyle;
    private Emphasis<CD> emphasis;

    public CD name(String name) {
        this.name = name;
        return (CD) this;
    }

    public CD value(Object value) {
        this.value = value;
        return (CD) this;
    }

    public Label<CD> label() {
        if (label == null) {
            label = new Label<>();
            label.parent((CD) this);
        }
        return label;
    }

    public CD label(Label<CD> label) {
        this.label = label;
        this.label.parent((CD) this);
        return (CD) this;
    }

    public ItemStyle<CD, ItemStyle> itemStyle(Supplier<ItemStyle<CD, ItemStyle>> supplier) {
        if (itemStyle == null) {
            itemStyle = supplier.get();
            itemStyle.parent((CD) this);
        }
        return itemStyle;
    }

    public CD itemStyle(ItemStyle<CD, ItemStyle> itemStyle) {
        this.itemStyle = itemStyle;
        this.itemStyle.parent((CD) this);
        return (CD) this;
    }

    public Emphasis<CD> emphasis(Supplier<Emphasis<CD>> supplier) {
        if (emphasis == null) {
            emphasis = supplier.get();
            emphasis.parent((CD) this);
        }
        return emphasis;
    }

    public CD emphasis(Emphasis<CD> emphasis) {
        this.emphasis = emphasis;
        this.emphasis.parent((CD) this);
        return (CD) this;
    }
}
