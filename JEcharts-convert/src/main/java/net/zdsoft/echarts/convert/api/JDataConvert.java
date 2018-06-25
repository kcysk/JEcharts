/**
 * FileName: JDataConvert.java
 * Author:   shenke
 * Date:     2018/6/21 上午11:40
 * Descriptor:
 */
package net.zdsoft.echarts.convert.api;

import net.zdsoft.echarts.Option;

/**
 * @author shenke
 * @since 2018/6/21 上午11:40
 */
public interface JDataConvert {

    void convert(JData data, Option option, JDataConvertChain chain);

}
