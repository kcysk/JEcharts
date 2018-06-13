/**
 * FileName: NStringSerializer.java
 * Author:   shenke
 * Date:     2018/6/13 下午8:17
 * Descriptor:
 */
package net.zdsoft.echarts.serialize;

import com.alibaba.fastjson.serializer.AutowiredObjectSerializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import net.zdsoft.echarts.javascript.NString;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/**
 * @author shenke
 * @since 2018/6/13 下午8:17
 */
public class NStringSerializer implements AutowiredObjectSerializer {

    private Set<Type> autowireds;

    @Override
    public Set<Type> getAutowiredFor() {
        if (autowireds != null) {
            autowireds = new HashSet<>();
            autowireds.add(NString.class);
        }
        return autowireds;
    }

    @Override
    public void write(JSONSerializer serializer, Object object,
                      Object fieldName, Type fieldType, int features) throws IOException {
        SerializeWriter out = serializer.out;
        if (object == null) {
            out.writeNull();
            return ;
        }
        NString ns = (NString) object;
        //if (ns.isNumber()) {
        //    out.write
        //}
        //out.writeString();
    }
}
