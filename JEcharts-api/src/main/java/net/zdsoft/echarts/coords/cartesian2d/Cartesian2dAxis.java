/**
 * FileName: Cartesian2dAxis.java
 * Author:   shenke
 * Date:     2018/6/14 下午2:39
 * Descriptor:
 */
package net.zdsoft.echarts.coords.cartesian2d;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.coords.Axis;
import net.zdsoft.echarts.coords.NameTextStyle;
import net.zdsoft.echarts.coords.enu.NameLocation;
import net.zdsoft.echarts.enu.Position;

/**
 * x轴和y轴
 * @author shenke
 * @since 2018/6/14 下午2:39
 */
@Getter
@Setter
final public class Cartesian2dAxis extends Axis<Cartesian2dAxis> {

    private Boolean show;
    private Integer gridIndex;
    private Integer offset;
    /**
     * 只可用 top bottom
     */
    private Position position;

    private String name;
    private NameLocation nameLocation;
    private NameTextStyle<Cartesian2dAxis> nameTextStyle;
    private Integer nameGap;
    /**
     * 角度值
     */
    private Double nameRotate;
    private Boolean inverse;
    private Object boundaryGap;


    public Cartesian2dAxis show(Boolean show) {
        this.show = show;
        return this;
    }

    public Cartesian2dAxis gridIndex(Integer gridIndex) {
        this.gridIndex = gridIndex;
        return this;
    }

    public Cartesian2dAxis offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Cartesian2dAxis position(Position position) {
        this.position = position;
        return this;
    }

    public Cartesian2dAxis name(String name) {
        this.name = name;
        return this;
    }

    public Cartesian2dAxis nameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
        return this;
    }

    public NameTextStyle<Cartesian2dAxis> nameTextStyle() {
        if (nameTextStyle == null) {
            nameTextStyle = new NameTextStyle<>();
            nameTextStyle.parent(this);
        }
        return nameTextStyle;
    }

    public Cartesian2dAxis nameTextStyle(NameTextStyle<Cartesian2dAxis> nameTextStyle) {
        this.nameTextStyle = nameTextStyle;
        return this;
    }

    public Cartesian2dAxis nameGap(Integer nameGap) {
        this.nameGap = nameGap;
        return this;
    }

    public Cartesian2dAxis nameRotate(Double nameRotate) {
        this.nameRotate = nameRotate;
        return this;
    }

    public Cartesian2dAxis inverse(Boolean inverse) {
        this.inverse = inverse;
        return this;
    }

    public Cartesian2dAxis boundaryGap(Object boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }
}
