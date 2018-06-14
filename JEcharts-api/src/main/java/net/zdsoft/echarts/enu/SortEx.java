/**
 * FileName: SortEx.java
 * Author:   shenke
 * Date:     2018/6/14 上午11:09
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

/**
 * @author shenke
 * @since 2018/6/14 上午11:09
 */
final public class SortEx implements Sort {

    SortEx() {
    }

    private String function;

    @Override
    public String toString() {
        return function;
    }

    public SortEx function(String function) {
        this.function = function;
        return this;
    }
}
