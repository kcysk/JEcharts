/**
 * FileName: SymbolEx.java
 * Author:   shenke
 * Date:     2018/6/13 下午5:16
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

/**
 * @author shenke
 * @since 2018/6/13 下午5:16
 */
final public class SymbolEx implements Symbol {

    private String value;

    SymbolEx() {
    }

    @Override
    public String toString() {
        return value;
    }


    public SymbolEx value(String value) {
        this.value = value;
        return this;
    }

    public static Symbol create(String value) {
        return new SymbolEx().value(value);
    }
}
