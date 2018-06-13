/**
 * FileName: Title.java
 * Author:   shenke
 * Date:     2018/6/12 下午9:03
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Target;
import net.zdsoft.echarts.style.TitleTextStyle;

/**
 * 标题组件，包含主标题和副标题。
 * @author shenke
 * @since 2018/6/12 下午9:03
 */
@Getter
@Setter
public class Title extends BaseComponent<Title> {

    /**
     * 组件 ID。默认不指定。指定则可用于在 option 或者 API 中引用组件
     */
    private String id;
    /**
     * 主标题文本，支持使用 \n 换行
     */
    private String text;
    /**
     * 主标题文本超链接
     */
    private String link;
    /**
     * 指定窗口打开主标题超链接。
     *
     * 可选：
     *
     * 'self' 当前窗口打开
     *
     * 'blank' 新窗口打开
     * @see Target
     */
    private Target target;
    /**
     * 副标题文本，支持使用 \n 换行。
     */
    private TitleTextStyle textStyle;
    private String subtext;
    private String sublink;
    private Target subtarget;
    private TitleTextStyle subtextStyle;
    /**
     * 标题内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距。
     *
     * 使用示例：
     *
     * // 设置内边距为 5
     * padding: 5
     * // 设置上下的内边距为 5，左右的内边距为 10
     * padding: [5, 10]
     * // 分别设置四个方向的内边距
     * padding: [
     *     5,  // 上
     *     10, // 右
     *     5,  // 下
     *     10, // 左
     * ]
     */
    private Object padding;
    /**
     * [ default: 10 ]
     * 主副标题之间的间距
     */
    private Integer itemGap;

    public Title id(String id) {
        this.id = id;
        return this;
    }

    public Title text(String text) {
        this.text = text;
        return this;
    }

    public Title link(String link) {
        this.link = link;
        return this;
    }

    public Title target(Target target) {
        this.target = target;
        return this;
    }

    public TitleTextStyle textStyle() {
        if (textStyle == null) {
            this.textStyle = new TitleTextStyle();
            this.textStyle.parent(this);
        }
        return textStyle;
    }

    public Title textStyle(TitleTextStyle textStyle) {
        this.textStyle = textStyle;
        this.textStyle.parent(this);
        return this;
    }

    public Title subtext(String subtext) {
        this.subtext = subtext;
        return this;
    }
    public Title sublink(String sublink) {
        this.sublink = sublink;
        return this;
    }
    public Title subtarget(Target subtarget) {
        this.subtarget = subtarget;
        return this;
    }
    public TitleTextStyle subtextStyle() {
        if (this.subtextStyle == null) {
            subtextStyle = new TitleTextStyle();
            subtextStyle.parent(this);
        }
        return subtextStyle;
    }

    public Title subtextStyle(TitleTextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
        this.subtextStyle.parent(this);
        return this;
    }


    public Title padding(Object padding) {
        this.padding = padding;
        return this;
    }

    public Title itemGap(Integer itemGap) {
        this.itemGap = itemGap;
        return this;
    }
}
