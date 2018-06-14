/**
 * FileName: EMap.java
 * Author:   shenke
 * Date:     2018/6/14 上午9:59
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Bottom;
import net.zdsoft.echarts.enu.Left;
import net.zdsoft.echarts.enu.MapValueCalculation;
import net.zdsoft.echarts.enu.Right;
import net.zdsoft.echarts.enu.Roam;
import net.zdsoft.echarts.enu.SelectedMode;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.enu.SeriesLayoutBy;
import net.zdsoft.echarts.enu.Top;
import net.zdsoft.echarts.mix.ScaleLimit;
import net.zdsoft.echarts.series.data.EMapData;
import net.zdsoft.echarts.series.data.Tooltip;

/**
 * @author shenke
 * @since 2018/6/14 上午9:59
 */
@Getter
@Setter
final public class EMap extends Series<EMap, EMapData> {

    private String map;
    private Roam roam;
    private Double aspectScale;
    private Double[] center;
    private Double[][] boundingCoords;
    private Double zoom;
    private ScaleLimit<EMap> scaleLimit;
    private Object nameMap;
    private SelectedMode selectedMode;
    private Left left;
    private Top top;
    private Right right;
    private Bottom bottom;

    private Object[] layoutCenter;
    private Object layoutSize;
    private Integer geoIndex;
    private MapValueCalculation mapValueCalculation;
    private Boolean showLegendSymbol;
    private SeriesLayoutBy seriesLayoutBy;
    private Integer dataIndex;

    private Tooltip<EMap> tooltip;

    public EMap() {
        type(SeriesEnum.map);
    }

    @Override
    public EMapData create() {
        EMapData data = new EMapData();
        data.parent(this);
        return data;
    }


    public EMap map(String map) {
        this.map = map;
        return this;
    }

    public EMap roam(Roam roam) {
        this.roam = roam;
        return this;
    }

    public EMap aspectScale(Double aspectScale) {
        this.aspectScale = aspectScale;
        return this;
    }

    public EMap center(Double[] center) {
        this.center = center;
        return this;
    }

    public EMap boundingCoords(Double[][] boundingCoords) {
        this.boundingCoords = boundingCoords;
        return this;
    }

    public EMap zoom(Double zoom) {
        this.zoom = zoom;
        return this;
    }

    public ScaleLimit<EMap> scaleLimit() {
        if (scaleLimit == null) {
            scaleLimit = new ScaleLimit<>();
            scaleLimit.parent(this);
        }
        return scaleLimit;
    }

    public EMap scaleLimit(ScaleLimit<EMap> scaleLimit) {
        this.scaleLimit = scaleLimit;
        return this;
    }

    public EMap nameMap(Object nameMap) {
        this.nameMap = nameMap;
        return this;
    }

    public EMap selectedMode(SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public EMap left(Left left) {
        this.left = left;
        return this;
    }

    public EMap top(Top top) {
        this.top = top;
        return this;
    }

    public EMap right(Right right) {
        this.right = right;
        return this;
    }

    public EMap bottom(Bottom bottom) {
        this.bottom = bottom;
        return this;
    }

    public EMap layoutCenter(Object[] layoutCenter) {
        this.layoutCenter = layoutCenter;
        return this;
    }

    public EMap layoutSize(Object layoutSize) {
        this.layoutSize = layoutSize;
        return this;
    }

    public EMap geoIndex(Integer geoIndex) {
        this.geoIndex = geoIndex;
        return this;
    }

    public EMap mapValueCalculation(MapValueCalculation mapValueCalculation) {
        this.mapValueCalculation = mapValueCalculation;
        return this;
    }

    public EMap showLegendSymbol(Boolean showLegendSymbol) {
        this.showLegendSymbol = showLegendSymbol;
        return this;
    }

    public EMap seriesLayoutBy(SeriesLayoutBy seriesLayoutBy) {
        this.seriesLayoutBy = seriesLayoutBy;
        return this;
    }

    public EMap dataIndex(Integer dataIndex) {
        this.dataIndex = dataIndex;
        return this;
    }

    public Tooltip<EMap> tooltip() {
        if (tooltip == null) {
            tooltip = new Tooltip<>();
            tooltip.parent(this);
        }
        return tooltip;
    }

    public EMap tooltip(Tooltip<EMap> tooltip) {
        this.tooltip = tooltip;
        return this;
    }
}
