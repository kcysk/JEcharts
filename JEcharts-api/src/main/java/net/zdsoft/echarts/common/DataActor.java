/**
 * FileName: DataActor.java
 * Author:   shenke
 * Date:     2018/6/13 下午4:49
 * Descriptor:
 */
package net.zdsoft.echarts.common;

/**
 * @author shenke
 * @since 2018/6/13 下午4:49
 */
public interface DataActor<DA extends DataActor, T extends Data> {

    DA data(T... t);
}
