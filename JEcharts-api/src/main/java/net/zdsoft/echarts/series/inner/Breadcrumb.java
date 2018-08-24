package net.zdsoft.echarts.series.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Bottom;
import net.zdsoft.echarts.enu.Left;
import net.zdsoft.echarts.enu.Right;
import net.zdsoft.echarts.enu.Top;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.ItemStyle;

/**
 * @author shenke
 * @since 2018/8/24 10:34
 */
@Getter
@Setter
public class Breadcrumb {

    private Boolean show;
    private Left left;
    private Top top;
    private Right right;
    private Bottom bottom;
    private Integer height;
    private Integer emptyItemWidth;
    private ItemStyle<Breadcrumb, ItemStyle> itemStyle;
    private Emphasis<Breadcrumb> emphasis;
}
