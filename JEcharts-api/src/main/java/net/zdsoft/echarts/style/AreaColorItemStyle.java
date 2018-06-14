/**
 * FileName: AreaColorItemStyle.java
 * Author:   shenke
 * Date:     2018/6/13 下午2:26
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shenke
 * @since 2018/6/13 下午2:26
 */
@Getter
@Setter
final public class AreaColorItemStyle<P> extends ItemStyle<P, AreaColorItemStyle> {

    private Object areaColor;


    public AreaColorItemStyle areaColor(Object areaColor) {
        this.areaColor = areaColor;
        return this;
    }


}
