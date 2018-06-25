/**
 * FileName: GeoCoordHandler.java
 * Author:   shenke
 * Date:     2018/6/22 下午3:48
 * Descriptor:
 */
package net.zdsoft.echarts.convert.api;

/**
 * 用于获取地理坐标系经纬度的回调工具类
 * @author shenke
 * @since 2018/6/22 下午3:48
 */
public interface GeoCoordHandler {

    /**
     * @see JData.Entry#x
     * @param entryX
     */
    Object[] doGeoCoords(String entryX);
}
