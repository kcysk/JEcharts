/**
 * FileName: JDataConvertChain.java
 * Author:   shenke
 * Date:     2018/6/21 下午6:53
 * Descriptor:
 */
package net.zdsoft.echarts.convert.api;

import net.zdsoft.echarts.Option;

/**
 * @author shenke
 * @since 2018/6/21 下午6:53
 */
public interface JDataConvertChain {

    void next(JData data, Option option);
}
