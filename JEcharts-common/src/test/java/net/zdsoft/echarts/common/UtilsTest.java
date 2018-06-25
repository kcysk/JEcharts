/**
 * FileName: UtilsTest.java
 * Author:   shenke
 * Date:     2018/6/20 下午3:39
 * Descriptor:
 */
package net.zdsoft.echarts.common;

import org.junit.Test;

import java.util.Arrays;

import static net.zdsoft.echarts.common.Utils.asArray;

/**
 * @author shenke
 * @since 2018/6/20 下午3:39
 */
public class UtilsTest {

    @Test
    public void _testAsArray() {
        JEchartsEntity[] array = asArray(new JEchartsEntity().id("id"));
        System.out.println(array.length);

        //int[] integerArray = asArray(1, 2);

    }

    private static class JEchartsEntity {
        private String id;

        public JEchartsEntity id(String id) {
            this.id = id;
            return this;
        }
    }

    @Test
    public void _concat() {
        Object[] array = new Object[]{"1", "2"};

        Arrays.stream(Utils.concat(array, "16")).forEach(System.out::println);
    }
}
