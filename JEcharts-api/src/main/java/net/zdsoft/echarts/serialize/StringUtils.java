/**
 * FileName: StringUtils.java
 * Author:   shenke
 * Date:     2018/6/14 下午4:27
 * Descriptor:
 */
package net.zdsoft.echarts.serialize;

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
}
