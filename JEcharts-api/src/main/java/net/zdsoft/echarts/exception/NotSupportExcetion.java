/**
 * FileName: NotSupportExcetion.java
 * Author:   shenke
 * Date:     2018/6/13 下午11:42
 * Descriptor:
 */
package net.zdsoft.echarts.exception;

/**
 * @author shenke
 * @since 2018/6/13 下午11:42
 */
public class NotSupportExcetion extends RuntimeException {

    public NotSupportExcetion(String message) {
        super(message);
    }
}
