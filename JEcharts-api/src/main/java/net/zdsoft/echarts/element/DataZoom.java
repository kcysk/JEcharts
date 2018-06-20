/**
 * FileName: DataZoom.java
 * Author:   shenke
 * Date:     2018/6/12 下午9:14
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.IRoot;
import net.zdsoft.echarts.enu.DataZoomType;
import net.zdsoft.echarts.enu.FilterMode;
import net.zdsoft.echarts.enu.Orient;
import net.zdsoft.echarts.enu.RangeMode;

/**
 * dataZoom 组件 用于区域缩放，从而能自由关注细节的数据信息，或者概览数据整体，或者去除离群点的影响。
 *
 * 现在支持这几种类型的 dataZoom 组件：
 *
 * 内置型数据区域缩放组件（dataZoomInside）：内置于坐标系中，使用户可以在坐标系上通过鼠标拖拽、鼠标滚轮、手指滑动（触屏上）来缩放或漫游坐标系。
 *
 * 滑动条型数据区域缩放组件（dataZoomSlider）：有单独的滑动条，用户在滑动条上进行缩放或漫游。
 *
 * 框选型数据区域缩放组件（dataZoomSelect）：提供一个选框进行数据区域缩放。即 toolbox.feature.dataZoom，配置项在 toolbox 中。
 * @author shenke
 * @since 2018/6/12 下午9:14
 */
@Getter
@Setter
abstract public class DataZoom<R extends DataZoom> extends IRoot<R> {

    private DataZoomType type;
    private String id;
    private Integer xAxisIndex;
    private Integer yAxisIndex;
    private Integer radiusAxisIndex;
    private Integer angleAxisIndex;
    private FilterMode filterMode;
    private Double start;
    private Double end;
    private Object startValue;
    private Object endValue;
    private Double minSpan;
    private Double maxSpan;
    private Object minSpanValue;
    private Object maxSpanValue;
    private Orient orient;
    private Boolean zoomLock;
    private Integer throttle;
    private RangeMode[] rangeMode;


    public DataZoom type(DataZoomType type) {
        this.type = type;
        return this;
    }

    public DataZoom id(String id) {
        this.id = id;
        return this;
    }

    public DataZoom xAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    public DataZoom yAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    public DataZoom radiusAxisIndex(Integer radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
        return this;
    }

    public DataZoom angleAxisIndex(Integer angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
        return this;
    }

    public DataZoom filterMode(FilterMode filterMode) {
        this.filterMode = filterMode;
        return this;
    }

    public DataZoom start(Double start) {
        this.start = start;
        return this;
    }

    public DataZoom end(Double end) {
        this.end = end;
        return this;
    }

    public DataZoom startValue(Object startValue) {
        this.startValue = startValue;
        return this;
    }

    public DataZoom endValue(Object endValue) {
        this.endValue = endValue;
        return this;
    }

    public DataZoom minSpan(Double minSpan) {
        this.minSpan = minSpan;
        return this;
    }

    public DataZoom maxSpan(Double maxSpan) {
        this.maxSpan = maxSpan;
        return this;
    }

    public DataZoom minSpanValue(Object minSpanValue) {
        this.minSpanValue = minSpanValue;
        return this;
    }

    public DataZoom maxSpanValue(Object maxSpanValue) {
        this.maxSpanValue = maxSpanValue;
        return this;
    }

    public DataZoom orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public DataZoom zoomLock(Boolean zoomLock) {
        this.zoomLock = zoomLock;
        return this;
    }

    public DataZoom throttle(Integer throttle) {
        this.throttle = throttle;
        return this;
    }

    public DataZoom rangeMode(RangeMode[] rangeMode) {
        this.rangeMode = rangeMode;
        return this;
    }
}
