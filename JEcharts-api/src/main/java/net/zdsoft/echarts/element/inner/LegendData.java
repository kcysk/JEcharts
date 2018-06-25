/**
 * FileName: LegendData.java
 * Author:   shenke
 * Date:     2018/6/20 下午4:27
 * Descriptor:
 */
package net.zdsoft.echarts.element.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.Data;
import net.zdsoft.echarts.style.TextStyle;

import java.util.Objects;

/**
 * @author shenke
 * @since 2018/6/20 下午4:27
 */
@Getter
@Setter
final public class LegendData implements Data<LegendData> {

    private String name;
    private String icon;
    private TextStyle<LegendData, TextStyle> textStyle;


    public LegendData name(String name) {
        this.name = name;
        return this;
    }

    public LegendData icon(String icon) {
        this.icon = icon;
        return this;
    }

    public TextStyle<LegendData, TextStyle> textStyle() {
        if (textStyle == null) {
            this.textStyle = new TextStyle<>().parent(this);
        }
        return textStyle;
    }

    public LegendData textStyle(TextStyle<LegendData, TextStyle> textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegendData that = (LegendData) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
