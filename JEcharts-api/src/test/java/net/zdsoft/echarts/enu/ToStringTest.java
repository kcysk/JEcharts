/**
 * FileName: ToStringTest.java
 * Author:   shenke
 * Date:     2018/6/12 下午11:50
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author shenke
 * @since 2018/6/12 下午11:50
 */
public class ToStringTest {

    @Test
    public void _test() {
        Left left =  LeftEx.create("abc");
        String jsonString = JSONObject.toJSONString(left);
        Assert.assertEquals(jsonString, "abc");
    }


}
