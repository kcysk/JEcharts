/**
 * FileName: Grid.java
 * Author:   shenke
 * Date:     2018/6/12 下午9:13
 * Descriptor:
 */
package net.zdsoft.echarts.coords.cartesian2d;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.element.BaseComponent;
import net.zdsoft.echarts.element.Tooltip;

/**
 * 直角坐标系内绘图网格，单个 grid 内最多可以放置上下两个 X 轴，左右两个 Y 轴。可以在网格上绘制折线图，柱状图，散点图（气泡图）。
 *
 * 在 ECharts 2.x 里单个 echarts 实例中最多只能存在一个 grid 组件，在 ECharts 3 中可以存在任意个 grid 组件。
 * @author shenke
 * @since 2018/6/12 下午9:13
 */
@Getter
@Setter
final public class Grid extends BaseComponent<Grid> {

    private String id;
    /**
     * grid 区域是否包含坐标轴的刻度标签。
     *
     * containLabel 为 false 的时候：
     * grid.left grid.right grid.top grid.bottom grid.width grid.height 决定的是由坐标轴形成的矩形的尺寸和位置。
     * 这比较适用于多个 grid 进行对齐的场景，因为往往多个 grid 对齐的时候，是依据坐标轴来对齐的。
     * containLabel 为 true 的时候：
     * grid.left grid.right grid.top grid.bottom grid.width grid.height 决定的是包括了坐标轴标签在内的所有内容所形成的矩形的位置。
     * 这常用于『防止标签溢出』的场景，标签溢出指的是，标签长度动态变化时，可能会溢出容器或者覆盖其他组件。
     */
    private Boolean containLabel;
    /**
     * 本坐标系特定的 tooltip 设定。
     *
     * 提示框组件的通用介绍：
     *
     * 提示框组件可以设置在多种地方：
     *
     * 可以设置在全局，即 tooltip
     *
     * 可以设置在坐标系中，即 grid.tooltip、polar.tooltip、single.tooltip
     *
     * 可以设置在系列中，即 series.tooltip
     *
     * 可以设置在系列的每个数据项中，即 series.data.tooltip
     */
    private Tooltip tooltip;


    public Grid containLabel(Boolean containLabel) {
        this.containLabel = containLabel;
        return this;
    }

    public Grid tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Grid id(String id) {
        this.id = id;
        return this;
    }
}
