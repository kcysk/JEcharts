/**
 * FileName: JGeoHandlerTest.java
 * Author:   shenke
 * Date:     2018/6/22 下午5:10
 * Descriptor:
 */
package net.zdsoft.echarts;

import net.zdsoft.echarts.convert.JGeoCoordHandler;
import net.zdsoft.echarts.convert.api.GeoCoordHandler;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author shenke
 * @since 2018/6/22 下午5:10
 */
public class JGeoHandlerTest {

    @Test
    public void _test() {
        GeoCoordHandler handler = new JGeoCoordHandler();
        Arrays.stream(handler.doGeoCoords("泗县")).forEach(System.out::println);
    }
}
