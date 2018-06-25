/**
 * FileName: Legend.java
 * Author:   shenke
 * Date:     2018/6/12 下午9:08
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;
import net.zdsoft.echarts.common.DataActor;
import net.zdsoft.echarts.element.inner.LegendData;
import net.zdsoft.echarts.enu.Align;
import net.zdsoft.echarts.enu.LegendEnum;
import net.zdsoft.echarts.enu.Orient;
import net.zdsoft.echarts.enu.PageButtonPosition;
import net.zdsoft.echarts.enu.SelectedMode;
import net.zdsoft.echarts.style.LegendTextStyle;
import net.zdsoft.echarts.style.TextStyle;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * 图例组件
 * @author shenke
 * @since 2018/6/12 下午9:08
 */
@Getter
@Setter
final public class Legend extends BaseComponent<Legend> implements DataActor<Legend, LegendData> {

    private LegendEnum          type;
    private String              id;
    private Object              width;
    private Object              height;
    private Orient              orient;
    private Align               align;
    private Integer             padding;
    private Integer             itemGap;
    private Integer             itemWidth;
    private Integer             itemHeight;
    /**
     * 如果图标（可能来自系列的 symbol 或用户自定义的 legend.data.icon）是 path:// 的形式，是否在缩放时保持该图形的长宽比。
     */
    private Boolean             symbolKeepAspect;
    /**
     * 用来格式化图例文本，支持字符串模板和回调函数两种形式
     */
    private String              formatter;
    /**
     * 图例选择的模式，控制是否可以通过点击图例改变系列的显示状态。默认开启图例选择，可以设成 false 关闭。
     *
     * 除此之外也可以设成 'single' 或者 'multiple' 使用单选或者多选模式
     * @see SelectedMode
     * @see net.zdsoft.echarts.enu.SelectedModeEnum
     * @see net.zdsoft.echarts.enu.SelectedModelEx
     */
    private SelectedMode        selectedMode;
    /**
     * 图例关闭时的颜色
     */
    private Object              inactiveColor;
    /**
     * 图例选中状态表。
     *
     * 示例：
     *
     * selected: {
     *     // 选中'系列1'
     *     '系列1': true,
     *     // 不选中'系列2'
     *     '系列2': false
     * }
     */
    private Object              selected;
    private LegendTextStyle     textStyle;
    private Tooltip             tooltip;
    private String              borderColor;
    private Integer lineHeight;
    private String backgroundColor;

    //---------------------------------------一下字段 仅legend.type 为 'scroll' 时有效。----------------------------------//
    /**
     * legend.type 为 'scroll' 时有效。
     *
     * 图例当前最左上显示项的 dataIndex。
     *
     * setOption 时指定此项的话，可决定当前图例滚动到哪里。
     *
     * 但是，如果仅仅想改变图例翻页，一般并不调用 setOption（因为这太重量了），仅仅使用 action legendScroll 即可。
     */
    private Integer scrollDataIndex;
    /**
     * [ default: 5 ]
     * legend.type 为 'scroll' 时有效。
     *
     * 图例控制块中，按钮和页信息之间的间隔。
     */
    private Integer pageButtonItemGap;
    /**
     * [ default: null ]
     * legend.type 为 'scroll' 时有效。
     *
     * 图例控制块和图例项之间的间隔。
     */
    private Integer pageButtonGap;
    private PageButtonPosition pageButtonPosition;
    /**
     * [ default: '{current}/{total}' ]
     * legend.type 为 'scroll' 时有效。
     *
     * 图例控制块中，页信息的显示格式。默认为 '{current}/{total}'，其中 {current} 是当前页号（从 1 开始计数），{total} 是总页数。
     *
     * 如果 pageFormatter 使用函数，须返回字符串，参数为：
     *
     * {
     *     current: number
     *     total: number
     * }
     */
    private Object pageFormatter;
    private PageIcons pageIcons;
    private String pageIconColor;
    private String pageIconInactiveColor;
    /**
     * [ default: 15 ]
     * legend.type 为 'scroll' 时有效。
     *
     * 翻页按钮的大小。可以是数字，也可以是数组，如 [10, 3]，表示 [宽，高]。
     */
    private Object pageIconSize;
    private TextStyle<Legend, TextStyle> pageTextStyle;
    /**
     * 图例翻页是否使用动画。
     */
    private Boolean animation;
    /**
     * [ default: 800 ]
     * 图例翻页时的动画时长。
     */
    private Integer animationDurationUpdate;

    private LinkedHashSet<LegendData> data;

    @Override
    public Legend data(LegendData... t) {
        if (data == null) {
            data = new LinkedHashSet<>();
        }
        if (t != null) {
            data.addAll(Arrays.asList(t));
        }
        return this;
    }

    public Legend type(LegendEnum type) {
        this.type = type;
        return this;
    }

    public Legend id(String id) {
        this.id = id;
        return this;
    }

    public Legend width(Object width) {
        this.width = width;
        return this;
    }

    public Legend height(Object height) {
        this.height = height;
        return this;
    }

    public Legend orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public Legend align(Align align) {
        this.align = align;
        return this;
    }

    public Legend padding(Integer padding) {
        this.padding = padding;
        return this;
    }

    public Legend itemGap(Integer itemGap) {
        this.itemGap = itemGap;
        return this;
    }

    public Legend itemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public Legend itemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    public Legend symbolKeepAspect(Boolean symbolKeepAspect) {
        this.symbolKeepAspect = symbolKeepAspect;
        return this;
    }

    public Legend formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public Legend selectedMode(SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public Legend inactiveColor(Object inactiveColor) {
        this.inactiveColor = inactiveColor;
        return this;
    }

    public Legend selected(Object selected) {
        this.selected = selected;
        return this;
    }

    public Legend textStyle(LegendTextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Legend tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Legend lineHeight(Integer lineHeight) {
        this.lineHeight = lineHeight;
        return this;
    }

    public Legend backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Legend borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Legend scrollDataIndex(Integer scrollDataIndex) {
        this.scrollDataIndex = scrollDataIndex;
        return this;
    }

    public Legend pageButtonItemGap(Integer pageButtonItemGap) {
        this.pageButtonItemGap = pageButtonItemGap;
        return this;
    }

    public Legend pageButtonGap(Integer pageButtonGap) {
        this.pageButtonGap = pageButtonGap;
        return this;
    }

    public Legend pageButtonPosition(PageButtonPosition pageButtonPosition) {
        this.pageButtonPosition = pageButtonPosition;
        return this;
    }

    public Legend pageFormatter(Object pageFormatter) {
        this.pageFormatter = pageFormatter;
        return this;
    }

    public PageIcons pageIcons() {
        if (pageIcons == null) {
            pageIcons = new PageIcons();
            pageIcons.parent(this);
        }
        return pageIcons;
    }

    public Legend pageIcons(PageIcons pageIcons) {
        this.pageIcons = pageIcons;
        return this;
    }

    public Legend pageIconColor(String pageIconColor) {
        this.pageIconColor = pageIconColor;
        return this;
    }

    public Legend pageIconInactiveColor(String pageIconInactiveColor) {
        this.pageIconInactiveColor = pageIconInactiveColor;
        return this;
    }

    public Legend pageIconSize(Object pageIconSize) {
        this.pageIconSize = pageIconSize;
        return this;
    }

    public TextStyle<Legend, TextStyle> pageTextStyle() {
        if (pageTextStyle == null) {
            pageTextStyle = new TextStyle<>();
            pageTextStyle.parent(this);
        }
        return pageTextStyle;
    }

    public Legend pageTextStyle(TextStyle<Legend, TextStyle> pageTextStyle) {
        this.pageTextStyle = pageTextStyle;
        this.pageTextStyle.parent(this);
        return this;
    }

    public Legend animation(Boolean animation) {
        this.animation = animation;
        return this;
    }

    public Legend animationDurationUpdate(Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    /** 图例控制块的图标。 */
    @Getter
    @Setter
    public static class PageIcons extends AbstractParent<Legend, PageIcons> {
        private String[] horizontal;
        private String[] vertical;


        public PageIcons horizontal(String[] horizontal) {
            this.horizontal = horizontal;
            return this;
        }

        public PageIcons vertical(String[] vertical) {
            this.vertical = vertical;
            return this;
        }
    }


}
