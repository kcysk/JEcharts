package net.zdsoft.echarts.series.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.ItemStyle;
import net.zdsoft.echarts.style.Label;

import java.util.Objects;

/**
 * @author shenke
 * @since 2018/8/24 11:24
 */
@Getter
@Setter
public class Category {

    private String name;
    private Symbol symbol;
    private Integer symbolSize;
    private Integer symbolRotate;
    private Object symbolOffset;
    private ItemStyle<Category, ItemStyle> itemStyle;
    private Label<Category> label;
    private Emphasis<Category> emphasis;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
