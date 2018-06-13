/**
 * FileName: Root.java
 * Author:   shenke
 * Date:     2018/6/12 下午8:57
 * Descriptor:
 */
package net.zdsoft.echarts.common;

import net.zdsoft.echarts.Option;

/**
 * 实现该接口的组件都可以回到Option对象
 * 或者说任何Echarts组件（对象）都持有Option对象
 * @author shenke
 * @since 2018/6/12 下午8:57
 */
public interface Root<R extends Root> {

    Option option();

    R option(Option option);

}
