package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.ColorMappingBy;
import net.zdsoft.echarts.series.TreeMap;

/**
 * @author shenke
 * @since 2018/8/24 9:50
 */
@Getter
@Setter
public class TreeMapData extends CommonSData<TreeMap, TreeMapData> {

    private Integer visualDimension;
    private Double visualMin;
    private Double visualMax;
    private String[] color;
    private Double[] colorAlpha;
    private Double[] colorSaturation;
    private ColorMappingBy colorMappingBy;
    private Double visibleMin;
    private Double childrenVisibleMin;
    private TreeMapData[] children;
}
