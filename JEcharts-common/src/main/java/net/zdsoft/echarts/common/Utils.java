/**
 * FileName: Utils.java
 * Author:   shenke
 * Date:     2018/6/20 下午2:08
 * Descriptor:
 */
package net.zdsoft.echarts.common;

/**
 * 快速转换为数组的工具类
 * @author shenke
 * @since 2018/6/20 下午2:08
 */
final public class Utils {

    public static <T> T[] asArray(T... args) {
        return args;
    }

    public static String[] cast2StringArray(Object[] objectArray) {
        if (objectArray != null) {
            String[] stringArray = new String[objectArray.length];
            for (int i=0, length=stringArray.length; i< length; i++) {
                stringArray[i] = objectArray[i].toString();
            }
            return stringArray;
        }
        return null;
    }

    public static Object[] concat(Object[] srcArray, Object descValue) {
        if (srcArray == null) {
            return asArray(descValue);
        }
        Object[] destArray = new Object[srcArray.length + 1];
        System.arraycopy(srcArray, 0, destArray, 0, srcArray.length);
        destArray[srcArray.length] = descValue;
        return destArray;
    }
}
