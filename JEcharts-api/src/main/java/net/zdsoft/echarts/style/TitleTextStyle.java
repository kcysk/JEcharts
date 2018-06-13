/**
 * FileName: TitleTextStyle.java
 * Author:   shenke
 * Date:     2018/6/13 下午1:16
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.element.Title;
import net.zdsoft.echarts.enu.Align;
import net.zdsoft.echarts.enu.VerticalAlign;

/**
 * @author shenke
 * @since 2018/6/13 下午1:16
 */
@Getter
@Setter
final public class TitleTextStyle extends TextStyle<Title, TitleTextStyle> {

    private Align align;
    private VerticalAlign verticalAlign;
    private Rich<TitleTextStyle> rich;


    public TitleTextStyle align(Align align) {
        this.align = align;
        return this;
    }

    public TitleTextStyle verticalAlign(VerticalAlign verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public TitleTextStyle rich(Rich<TitleTextStyle> rich) {
        this.rich = rich;
        return this;
    }
}
