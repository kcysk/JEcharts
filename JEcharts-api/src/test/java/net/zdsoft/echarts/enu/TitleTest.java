/**
 * FileName: TitleTest.java
 * Author:   shenke
 * Date:     2018/6/13 上午11:11
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import net.zdsoft.echarts.element.Title;
import org.junit.Test;

/**
 * @author shenke
 * @since 2018/6/13 上午11:11
 */
public class TitleTest {

    @Test
    public void _test() {
        Title title = new Title();
        title.textStyle().align(Align.center);
    }
}
