/**
 * FileName: AngleAxis.java
 * Author:   shenke
 * Date:     2018/6/14 下午3:14
 * Descriptor:
 */
package net.zdsoft.echarts.coords.polar;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.coords.Axis;

/**
 * 极坐标系角度轴
 * @author shenke
 * @since 2018/6/14 下午3:14
 */
@Getter
@Setter
final public class AngleAxis extends Axis<AngleAxis> {

    private Integer polarIndex;
    private Double startAngle;
    private Boolean clockwise;
    private Integer boundaryGap;

    @Override
    public AngleAxis coordSysIndex(Integer coordIndex) {
        polarIndex = coordIndex;
        return this;
    }

    public AngleAxis polarIndex(Integer polarIndex) {
        this.polarIndex = polarIndex;
        return this;
    }

    public AngleAxis startAngle(Double startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    public AngleAxis clockwise(Boolean clockwise) {
        this.clockwise = clockwise;
        return this;
    }

    public AngleAxis boundaryGap(Integer boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }
}
