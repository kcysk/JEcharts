/**
 * FileName: Label.java
 * Author:   shenke
 * Date:     2018/6/13 下午2:06
 * Descriptor:
 */
package net.zdsoft.echarts.style;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Position;

/**
 * @author shenke
 * @since 2018/6/13 下午2:06
 */
@Getter
@Setter
final public class Label<P> extends AbstractLabel<P, Label> {

    private Position position;
    private Integer distance;


    public Label position(Position position) {
        this.position = position;
        return this;
    }

    public Label distance(Integer distance) {
        this.distance = distance;
        return this;
    }
}
