/**
 * FileName: Geo.java
 * Author:   shenke
 * Date:     2018/6/12 下午10:48
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.enu.Roam;
import net.zdsoft.echarts.enu.SelectedMode;
import net.zdsoft.echarts.mix.ScaleLimit;
import net.zdsoft.echarts.style.AreaColorItemStyle;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.Label;

/**
 * 地理坐标系组件。
 *
 * 地理坐标系组件用于地图的绘制，支持在地理坐标系上绘制散点图，线集。
 * @author shenke
 * @since 2018/6/12 下午10:48
 */
@Getter
@Setter
public class Geo extends BaseComponent<Geo> {

    private String map;
    /**
     * [ default: false ]
     * 是否开启鼠标缩放和平移漫游。默认不开启。如果只想要开启缩放或者平移，可以设置成 'scale' 或者 'move'。设置成 true 为都开启
     */
    private Roam roam;
    /**
     * 当前视角的中心点，用经纬度表示
     *
     * 例如：
     *
     * center: [115.97, 29.71]
     */
    private Double[] center;
    private Double aspectScale;
    /**
     * 二维数组，定义定位的左上角以及右下角分别所对应的经纬度。例如
     *
     * // 设置为一张完整经纬度的世界地图
     * map: 'world',
     * left: 0, top: 0, right: 0, bottom: 0,
     * boundingCoords: [
     *     // 定位左上角经纬度
     *     [-180, 90],
     *     // 定位右下角经纬度
     *     [180, -90]
     * ],
     */
    private Double boundingCoords;
    /**
     * default: 1
     * 当前视角的缩放比
     */
    private Double zoom;
    private ScaleLimit<Geo> scaleLimit;
    /**
     * 自定义地区的名称映射，如：
     *
     * {
     *     'China' : '中国'
     * }
     */
    private Object namedMap;
    private SelectedMode selectedMode;
    private Label<Geo> label;
    private AreaColorItemStyle<Geo> itemStyle;
    private Emphasis<Geo> emphasis;
    private String[] layoutCenter;
    private Object layoutSize;
    private Region[] regions;
    /**
     * 图形是否不响应和触发鼠标事件，默认为 false，即响应和触发鼠标事件。
     */
    private Boolean silent;

    public Geo map(String map) {
        this.map = map;
        return this;
    }

    public Geo roam(Roam roam) {
        this.roam = roam;
        return this;
    }

    public Geo center(Double[] center) {
        this.center = center;
        return this;
    }

    public Geo aspectScale(Double aspectScale) {
        this.aspectScale = aspectScale;
        return this;
    }

    public Geo boundingCoords(Double boundingCoords) {
        this.boundingCoords = boundingCoords;
        return this;
    }

    public Geo zoom(Double zoom) {
        this.zoom = zoom;
        return this;
    }

    public Geo scaleLimit(ScaleLimit<Geo> scaleLimit) {
        this.scaleLimit = scaleLimit;
        return this;
    }

    public Geo namedMap(Object namedMap) {
        this.namedMap = namedMap;
        return this;
    }

    public Geo selectedMode(SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public Geo label(Label<Geo> label) {
        this.label = label;
        return this;
    }

    public Geo itemStyle(AreaColorItemStyle<Geo> itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Geo emphasis(Emphasis<Geo> emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public Geo layoutCenter(String[] layoutCenter) {
        this.layoutCenter = layoutCenter;
        return this;
    }

    public Geo layoutSize(Object layoutSize) {
        this.layoutSize = layoutSize;
        return this;
    }

    public Geo regions(Region[] regions) {
        this.regions = regions;
        return this;
    }

    public Geo silent(Boolean silent) {
        this.silent = silent;
        return this;
    }

    @Getter
    @Setter
    public static class Region extends AbstractParent<Geo, Region> {
        private String name;
        private Boolean selected;
        private AreaColorItemStyle<Region> itemStyle;
        private Label<Region> label;
        private Emphasis<Region> emphasis;


        public Region name(String name) {
            this.name = name;
            return this;
        }

        public Region selected(Boolean selected) {
            this.selected = selected;
            return this;
        }

        public AreaColorItemStyle<Region> itemStyle() {
            if (itemStyle == null) {
                itemStyle = new AreaColorItemStyle<>();
                itemStyle.parent(this);
            }
            return itemStyle;
        }

        public Region itemStyle(AreaColorItemStyle<Region> itemStyle) {
            this.itemStyle = itemStyle;
            itemStyle.parent(this);
            return this;
        }

        public Label<Region> label() {
            if (label == null) {
                label = new Label<>();
                label.parent(this);
            }
            return label;
        }

        public Region label(Label<Region> label) {
            this.label = label;
            return this;
        }

        public Emphasis<Region> emphasis() {
            if (emphasis == null) {
                emphasis = new Emphasis<>();
                emphasis.parent(this);
            }
            return emphasis;
        }

        public Region emphasis(Emphasis<Region> emphasis) {
            this.emphasis = emphasis;
            return this;
        }
    }
}
