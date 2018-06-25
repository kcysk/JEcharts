/**
 * FileName: Parent.java
 * Author:   shenke
 * Date:     2018/6/13 上午10:32
 * Descriptor:
 */
package net.zdsoft.echarts.common;

/**
 * 实现该接口的都可以获取上层对象
 * @author shenke
 * @since 2018/6/13 上午10:32
 */
public interface Parent<P, E extends Parent> {

    P parent();

    E parent(P parent);
}
