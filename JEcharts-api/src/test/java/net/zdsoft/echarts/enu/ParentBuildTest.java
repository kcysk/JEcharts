/**
 * FileName: ParentBuildTest.java
 * Author:   shenke
 * Date:     2018/6/13 下午8:07
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import net.zdsoft.echarts.series.data.BarData;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author shenke
 * @since 2018/6/13 下午8:07
 */
public class ParentBuildTest {

    @Test
    public void _test() {
        BarData barData = new BarData();
        barData.tooltip();
        Assert.assertNotNull(barData.getTooltip());
    }
}
