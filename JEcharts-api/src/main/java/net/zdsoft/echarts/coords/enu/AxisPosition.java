/**
 * FileName: AxisPosition.java
 * Author:   shenke
 * Date:     2018/6/14 上午11:30
 * Descriptor:
 */
package net.zdsoft.echarts.coords.enu;

/**
 * xy 轴的位置。
 *
 *
 * x可选：
 *
 * 'top'
 * 'bottom'
 * 默认 grid 中的第一个 x 轴在 grid 的下方（'bottom'），第二个 x 轴视第一个 x 轴的位置放在另一侧
 *
 * y可选：
 *
 * 'left'
 * 'right'
 * 默认 grid 中的第一个 y 轴在 grid 的左侧（'left'），第二个 y 轴视第一个 y 轴的位置放在另一侧
 * @author shenke
 * @since 2018/6/14 上午11:30
 */
public enum AxisPosition {
    top, bottom,
    left, right;
}
