/**
 * FileName: Emphasis.java
 * Author:   shenke
 * Date:     2018/6/13 下午2:28
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.AbstractParent;

/**
 * @author shenke
 * @since 2018/6/13 下午2:28
 */
@Getter
@Setter
final public class Emphasis<P> extends AbstractParent<P, Emphasis> {

    private ItemStyle<Emphasis<P>, ItemStyle<Emphasis<P>, ItemStyle>> itemStyle;
    private Label<Emphasis<P>> label;


}
