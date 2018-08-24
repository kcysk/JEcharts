package net.zdsoft.echarts.series.inner;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.ColorMappingBy;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.ItemStyle;
import net.zdsoft.echarts.style.Label;

/**
 * @author shenke
 * @since 2018/8/24 10:11
 */
@Getter
@Setter
public class Level {

    private Integer visualDimension;
    private Integer visualMin;
    private Integer visualMax;
    private String[] color;
    private Double[] colorAlpha;
    private Double[] colorSaturation;
    private ColorMappingBy colorMappingBy;
    private Double visibleMin;
    private Double childrenVisibleMin;
    private Label<Level> label;
    private Label<Level> upperLabel;
    private ItemStyle<Level, ItemStyle> itemStyle;
    private Emphasis<Level> emphasis;
}
