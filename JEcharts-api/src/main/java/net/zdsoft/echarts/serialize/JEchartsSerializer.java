/**
 * FileName: JEchartsSerializer.java
 * Author:   shenke
 * Date:     2018/6/13 上午12:01
 * Descriptor:
 */
package net.zdsoft.echarts.serialize;

import com.alibaba.fastjson.serializer.AutowiredObjectSerializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import net.zdsoft.echarts.enu.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/**
 * 直接调用toString方法
 * @author shenke
 * @since 2018/6/13 上午12:01
 */
public class JEchartsSerializer implements AutowiredObjectSerializer {

    private static Set<Type> autorireds;

    static {
        autorireds = new HashSet<>();
        autorireds.add(LeftEx.class);
        autorireds.add(TopEx.class);
        autorireds.add(RightEx.class);
        autorireds.add(BottomEx.class);
        autorireds.add(FontWeightEx.class);
        autorireds.add(PositionEx.class);
        autorireds.add(RoamEx.class);
        autorireds.add(SelectedModelEx.class);
        autorireds.add(StepEx.class);
        autorireds.add(RoseTypeEx.class);
    }

    @Override
    public Set<Type> getAutowiredFor() {
        return autorireds;
    }

    @Override
    public void write(JSONSerializer serializer, Object object,
                      Object fieldName, Type fieldType, int features) throws IOException {
        if (object == null) {
            serializer.out.writeNull();
            return ;
        }
        serializer.out.write(object.toString());
    }

}
