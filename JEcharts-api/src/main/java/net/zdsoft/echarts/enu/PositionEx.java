/**
 * FileName: PositionEx.java
 * Author:   shenke
 * Date:     2018/6/13 下午2:09
 * Descriptor:
 */
package net.zdsoft.echarts.enu;

import com.alibaba.fastjson.JSONObject;

/**
 * @author shenke
 * @since 2018/6/13 下午2:09
 */
final public class PositionEx implements Position {

    private String[] array;
    private String function;

    PositionEx() {
    }

    @Override
    public String toString() {
        if (function == null) {
            return JSONObject.toJSONString(array);
        } else {
            return function;
        }
    }


    public PositionEx array(String[] array) {
        this.array = array;
        return this;
    }


    public PositionEx function(String function) {
        this.function = function;
        return this;
    }

    public static Position crate(String[] array) {
        return new PositionEx().array(array);
    }

    public static Position create(String function) {
        return new PositionEx().function(function);
    }
}
