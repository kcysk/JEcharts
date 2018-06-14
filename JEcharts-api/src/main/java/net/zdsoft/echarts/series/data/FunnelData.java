/**
 * FileName: FunnelData.java
 * Author:   shenke
 * Date:     2018/6/14 上午11:01
 * Descriptor:
 */
package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.series.Funnel;
import net.zdsoft.echarts.series.inner.LabelLine;

/**
 * @author shenke
 * @since 2018/6/14 上午11:01
 */
@Getter
@Setter
final public class FunnelData extends CommonSData<Funnel, FunnelData> {

    private LabelLine labelLine;

    public LabelLine labelLine() {
        if (labelLine == null) {
            this.labelLine = new LabelLine();
            labelLine.parent(this);
        }
        return labelLine;
    }

    public FunnelData labelLine(LabelLine labelLine) {
        this.labelLine = labelLine;
        return this;
    }
}
