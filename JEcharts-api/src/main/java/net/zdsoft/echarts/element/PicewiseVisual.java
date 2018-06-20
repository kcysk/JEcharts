/**
 * FileName: PicewiseVisual.java
 * Author:   shenke
 * Date:     2018/6/15 上午5:53
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.element.inner.VisualMapRange;

/**
 * @author shenke
 * @since 2018/6/15 上午5:53
 */
@Getter
@Setter
final public class PicewiseVisual extends VisualMap<PicewiseVisual> {
    private Integer splitNumber;
    private Object[] pieces;
    private String categories;
    private Boolean minOpen;
    private Boolean maxOpen;


    public PicewiseVisual splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    public PicewiseVisual pieces(Object[] pieces) {
        this.pieces = pieces;
        return this;
    }

    public PicewiseVisual categories(String categories) {
        this.categories = categories;
        return this;
    }

    public PicewiseVisual minOpen(Boolean minOpen) {
        this.minOpen = minOpen;
        return this;
    }

    public PicewiseVisual maxOpen(Boolean maxOpen) {
        this.maxOpen = maxOpen;
        return this;
    }

    public VisualMapRange<PicewiseVisual> inRange() {
        if (inRange == null) {
            inRange = new VisualMapRange<>();
            inRange.parent(this);
        }
        return inRange;
    }

    public VisualMapRange<PicewiseVisual> outRange() {
        if (outRange == null) {
            outRange = new VisualMapRange<>();
            outRange.parent(this);
        }
        return outRange;
    }
}
