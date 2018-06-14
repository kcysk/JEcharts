/**
 * FileName: ToStringUtils.java
 * Author:   shenke
 * Date:     2018/6/14 下午4:25
 * Descriptor:
 */
package net.zdsoft.echarts.serialize;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import net.zdsoft.echarts.Option;

import java.util.Collection;

/**
 * @author shenke
 * @since 2018/6/14 下午4:25
 */
final public class ToStringUtils {

    public static String toJSONString(Option option) {
        return JSONObject.toJSONString(option, (PropertyFilter) (owner, propertyName, value) -> {
            if (value == null) {
                return false;
            }
            if (value instanceof String) {
                return StringUtils.isNotBlank(value.toString());
            }
            if (value instanceof Collection) {
                if (((Collection) value).isEmpty()) {
                    return false;
                }
                return ((Collection) value).stream().anyMatch(e -> e != null && StringUtils.isNotBlank(e.toString()));
            }
            return true;
        }, SerializerFeature.WriteEnumUsingToString);
    }
}
