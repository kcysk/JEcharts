/**
 * FileName: StringUtils.java
 * Author:   shenke
 * Date:     2018/6/14 下午4:27
 * Descriptor:
 */
package net.zdsoft.echarts.common;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.Collection;

/**
 * @author shenke
 * @since 2018/6/14 下午4:27
 */
final public class StringUtils {

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }

    public static boolean equals(String src, String other) {
        if (src == other) {
            return true;
        } else if(src != null && other != null) {
            return src.equals(other);
        }
        return false;
    }

    /**
     * 特殊的转换字符串的方法
     * @param option
     * @return
     */
    public static String toJSONString(Object option) {
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
