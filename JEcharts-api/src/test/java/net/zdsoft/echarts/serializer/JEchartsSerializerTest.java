/**
 * FileName: JEchartsSerializerTest.java
 * Author:   shenke
 * Date:     2018/6/13 下午10:53
 * Descriptor:
 */
package net.zdsoft.echarts.serializer;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Left;
import net.zdsoft.echarts.enu.LeftEx;
import net.zdsoft.echarts.enu.RoseType;
import org.junit.Before;
import org.junit.Test;

/**
 * @author shenke
 * @since 2018/6/13 下午10:53
 */
public class JEchartsSerializerTest {

    @Getter
    @Setter
    class JvmObject {
        private String strValue;
        private Boolean boolValue;
        private Integer intValue;
        private Double doubleValue;
        private RoseType roseType;
        private Left left;
    }

    private JvmObject jvmObject;

    @Before
    public void create() {
        jvmObject = new JvmObject();
        jvmObject.setBoolValue(Boolean.TRUE);
        jvmObject.setDoubleValue(12.1);
        jvmObject.setIntValue(2);
        jvmObject.setStrValue("ssss");
    }


    @Test
    public void _testSimpleObject() {
        Left left = LeftEx.create("abc");
        System.out.println(JSONObject.toJSONString(left));
    }

    @Test
    public void _string() {
        jvmObject.setRoseType(RoseType.DISABLE);
        jvmObject.setLeft(LeftEx.create(10));
        System.out.println(JSONObject.toJSONString(jvmObject));
    }
}
