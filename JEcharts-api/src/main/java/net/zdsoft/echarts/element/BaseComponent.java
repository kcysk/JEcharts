/**
 * FileName: BaseComponent.java
 * Author:   shenke
 * Date:     2018/6/12 下午11:00
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.IRoot;
import net.zdsoft.echarts.common.Root;
import net.zdsoft.echarts.enu.Bottom;
import net.zdsoft.echarts.enu.Left;
import net.zdsoft.echarts.enu.Right;
import net.zdsoft.echarts.enu.Top;

/**
 * @author shenke
 * @since 2018/6/12 下午11:00
 */

public abstract class BaseComponent<R extends BaseComponent<R>> extends IRoot<R> implements Root<R> {
    /**
     * 是否显示
     */
    @Getter
    @Setter
    private Boolean show;

    @Getter
    @Setter
    private Integer z;
    @Getter
    @Setter
    private Integer zlevel;

    /**
     * grid 组件离容器左侧的距离。
     *
     * left 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'center', 'right'。
     *
     * 如果 left 的值为'left', 'center', 'right'，组件会根据相应的位置自动对齐
     */
    @Getter
    @Setter
    private Left left;
    /**
     * grid 组件离容器上侧的距离。
     *
     * top 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'top', 'middle', 'bottom'。
     *
     * 如果 top 的值为'top', 'middle', 'bottom'，组件会根据相应的位置自动对齐
     */
    @Getter
    @Setter
    private Top top;
    /**
     * grid 组件离容器右侧的距离。
     *
     * right 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比。
     *
     * 默认自适应
     */
    @Getter
    @Setter
    private Right right;
    /**
     * grid 组件离容器下侧的距离。
     *
     * bottom 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比。
     *
     * 默认自适应
     */
    @Getter
    @Setter
    private Bottom bottom;

    /**
     * 标题背景色，默认透明。
     *
     * 颜色可以使用 RGB 表示，比如 'rgb(128, 128, 128)'
     * 如果想要加上 alpha 通道，可以使用 RGBA，比如 'rgba(128, 128, 128, 0.5)'，也可以使用十六进制格式，比如 '#ccc'
     */
    @Getter
    @Setter
    private Object backgroundColor;
    /**
     * 标题的边框颜色。支持的颜色格式同 backgroundColor
     */
    @Getter
    @Setter
    private Object borderColor;
    /**
     * 标题的边框线宽
     */
    @Getter
    @Setter
    private Integer borderWidth;
    /**
     * [ default: 0 ]
     * 圆角半径，单位px，支持传入数组分别指定 4 个圆角半径。 如:
     *
     * borderRadius: 5, // 统一设置四个角的圆角大小
     * borderRadius: [5, 5, 0, 0] //（顺时针左上，右上，右下，左下）
     */
    @Getter
    @Setter
    private Object borderRadius;

    /**
     * 图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果
     */
    @Getter
    @Setter
    private Integer shadowBlur;
    /**
     * 阴影颜色
     */
    @Getter
    @Setter
    private String shadowColor;
    /**
     * 阴影水平方向上的偏移距离
     */
    @Getter
    @Setter
    private Integer shadowOffsetX;
    /**
     * 阴影垂直方向上的偏移距离
     */
    @Getter
    @Setter
    private Integer shadowOffsetY;


    public R show(Boolean show) {
        this.show = show;
        return (R) this;
    }

    public R z(Integer z) {
        this.z = z;
        return (R) this;
    }

    public R zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return (R) this;
    }


    public R left(Left left) {
        this.left = left;
        return (R) this;
    }

    public R top(Top top) {
        this.top = top;
        return (R) this;
    }

    public R right(Right right) {
        this.right = right;
        return (R) this;
    }

    public R bottom(Bottom bottom) {
        this.bottom = bottom;
        return (R) this;
    }

    public R backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return (R) this;
    }

    public R borderColor(Object borderColor) {
        this.borderColor = borderColor;
        return (R) this;
    }

    public R borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return (R) this;
    }

    public R borderRadius(Object borderRadius) {
        this.borderRadius = borderRadius;
        return (R) this;
    }

    public R shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return (R) this;
    }

    public R shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return (R) this;
    }

    public R shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return (R) this;
    }

    public R shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return (R) this;
    }
}
