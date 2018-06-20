/**
 * FileName: InsideDataZoom.java
 * Author:   shenke
 * Date:     2018/6/20 上午11:56
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.OnMouseWheel;

/**
 * @author shenke
 * @since 2018/6/20 上午11:56
 */
@Getter
@Setter
final public class InsideDataZoom extends DataZoom<InsideDataZoom> {

    private OnMouseWheel zoomOnMouseWheel;
    private OnMouseWheel moveOnMouseWheel;
    private Boolean preventDefaultMouseMove;


    public InsideDataZoom zoomOnMouseWheel(OnMouseWheel zoomOnMouseWheel) {
        this.zoomOnMouseWheel = zoomOnMouseWheel;
        return this;
    }

    public InsideDataZoom moveOnMouseWheel(OnMouseWheel moveOnMouseWheel) {
        this.moveOnMouseWheel = moveOnMouseWheel;
        return this;
    }

    public InsideDataZoom preventDefaultMouseMove(Boolean preventDefaultMouseMove) {
        this.preventDefaultMouseMove = preventDefaultMouseMove;
        return this;
    }
}
