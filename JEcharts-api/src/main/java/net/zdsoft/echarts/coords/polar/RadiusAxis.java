/**
 * FileName: RadiusAxis.java
 * Author:   shenke
 * Date:     2018/6/14 下午3:11
 * Descriptor:
 */
package net.zdsoft.echarts.coords.polar;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.coords.Axis;
import net.zdsoft.echarts.coords.NameTextStyle;
import net.zdsoft.echarts.coords.enu.NameLocation;

/**
 * 极坐标系的径向轴
 * @author shenke
 * @since 2018/6/14 下午3:11
 */
@Getter
@Setter
final public class RadiusAxis extends Axis<RadiusAxis> {
    private Integer polarIndex;
    private String name;
    private NameLocation nameLocation;
    private NameTextStyle<RadiusAxis> nameTextStyle;
    private Integer nameGap;
    /**
     * 角度值
     */
    private Double nameRotate;
    private Boolean inverse;
    private Object boundaryGap;

    @Override
    public RadiusAxis coordSysIndex(Integer coordIndex) {
        polarIndex = coordIndex;
        return this;
    }

    public RadiusAxis polarIndex(Integer polarIndex) {
        this.polarIndex = polarIndex;
        return this;
    }

    public RadiusAxis name(String name) {
        this.name = name;
        return this;
    }

    public RadiusAxis nameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
        return this;
    }

    public NameTextStyle<RadiusAxis> nameTextStyle() {
        if (nameTextStyle == null) {
            nameTextStyle = new NameTextStyle<>();
            nameTextStyle.parent(this);
        }
        return nameTextStyle;
    }

    public RadiusAxis nameTextStyle(NameTextStyle<RadiusAxis> nameTextStyle) {
        this.nameTextStyle = nameTextStyle;
        return this;
    }

    public RadiusAxis nameGap(Integer nameGap) {
        this.nameGap = nameGap;
        return this;
    }

    public RadiusAxis nameRotate(Double nameRotate) {
        this.nameRotate = nameRotate;
        return this;
    }

    public RadiusAxis inverse(Boolean inverse) {
        this.inverse = inverse;
        return this;
    }

    public RadiusAxis boundaryGap(Object boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }
}
