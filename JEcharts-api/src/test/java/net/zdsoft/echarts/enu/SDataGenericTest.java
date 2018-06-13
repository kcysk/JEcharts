/**
 * FileName: SDataGenericTest.java
 * Author:   shenke
 * Date:     2018/6/13 下午5:34
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import net.zdsoft.echarts.series.Line;
import net.zdsoft.echarts.series.data.LineData;
import net.zdsoft.echarts.style.Emphasis;
import net.zdsoft.echarts.style.ItemStyle;
import org.junit.Test;

/**
 * @author shenke
 * @since 2018/6/13 下午5:34
 */
public class SDataGenericTest {

    @Test
    public void _test() {
        Line line = new Line();
        LineData data = line.create();
        data.<ItemStyle<LineData, ItemStyle>>itemStyle(ItemStyle::new);
        data.<Emphasis<LineData>>emphasis(Emphasis::new).getItemStyle().parent();
    }
}
