/**
 * FileName: ArrayCastTest.java
 * Author:   shenke
 * Date:     2018/6/22 下午12:46
 * Descriptor:
 */
package net.zdsoft.echarts.convert;

import net.zdsoft.echarts.common.Utils;
import org.junit.Test;

/**
 * @author shenke
 * @since 2018/6/22 下午12:46
 */
public class ArrayCastTest {

    @Test
    public void _test() {
        Object[] objectArray = new Object[]{"ss", 1};
        Utils.cast2StringArray(objectArray);
    }
}
