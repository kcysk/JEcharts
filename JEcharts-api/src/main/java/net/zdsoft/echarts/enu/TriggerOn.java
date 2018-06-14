/**
 * FileName: TriggerOn.java
 * Author:   shenke
 * Date:     2018/6/14 下午5:22
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

/**
 * 提示框触发的条件，可选：
 *
 * 'mousemove'
 *
 * 鼠标移动时触发。
 *
 * 'click'
 *
 * 鼠标点击时触发。
 *
 * 'mousemove|click'
 *
 * 同时鼠标移动和点击时触发。
 *
 * 'none'
 *
 * 不在 'mousemove' 或 'click' 时触发，用户可以通过 action.tooltip.showTip 和 action.tooltip.hideTip 来手动触发和隐藏。也可以通过 axisPointer.handle 来触发或隐藏。
 * @author shenke
 * @since 2018/6/14 下午5:22
 */
public enum TriggerOn {

    mousemove, click, none
}
