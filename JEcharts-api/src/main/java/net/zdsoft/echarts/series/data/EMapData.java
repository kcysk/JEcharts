/**
 * FileName: EMapData.java
 * Author:   shenke
 * Date:     2018/6/14 上午10:00
 * Descriptor:
 */
package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.series.EMap;

/**
 * @author shenke
 * @since 2018/6/14 上午10:00
 */
@Getter
@Setter
final public class EMapData extends CommonSData<EMap, EMapData> {

    private Boolean selected;


    public EMapData selected(Boolean selected) {
        this.selected = selected;
        return this;
    }
}
