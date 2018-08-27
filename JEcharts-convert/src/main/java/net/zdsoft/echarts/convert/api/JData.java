/**
 * FileName: JData.java
 * Author:   shenke
 * Date:     2018/6/21 上午11:43
 * Descriptor:
 */
package net.zdsoft.echarts.convert.api;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.coords.enu.AxisPosition;
import net.zdsoft.echarts.coords.enu.AxisType;
import net.zdsoft.echarts.enu.Bottom;
import net.zdsoft.echarts.enu.CoordinateSystem;
import net.zdsoft.echarts.enu.Layout;
import net.zdsoft.echarts.enu.Left;
import net.zdsoft.echarts.enu.Right;
import net.zdsoft.echarts.enu.RoseType;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.enu.Top;

import java.util.List;

/**
 *
 * @author shenke
 * @since 2018/6/21 上午11:43
 */
@Data
public class JData {

    private List<Entry> entryList;
    private List<Link> linkList;
    /**
     * 该数据对应的图表类型
     */
    private SeriesEnum type;

    /**
     * 自定义的地图类型
     */
    private String mapType;
    /**
     * 是否使用独立的坐标系
     */
    private boolean selfCoordSys;
    /**
     * 依附于某个坐标系之内
     */
    private Integer coordSysIndex;
    /**
     * 坐标系类型
     */
    private CoordinateSystem coordSys;
    /**
     * 坐标系位置等配置
     */
    private JCoordSysPosition coordSysPosition;
    /**
     * 是否使用独立的x坐标轴
     * 一般用户坐标系为 {@link CoordinateSystem#cartesian2d}的情况
     * 可能会有多个
     */
    private boolean selfXAxis;

    /**
     * 对于直角坐标系来说，其x轴通常为值类型，当散点图或者现状图形的x轴为值类型的时候
     * 对于Series的Data数据的value值的表现形式将会发生变化
     *
     */
    private AxisType xAxisType = AxisType.category;

    /**
     * 独立的y坐标轴
     */
    private boolean selfYAxis;
    /**
     * x轴位置 偏移量等配置
     */
    private JAxisPosition xJAxisPosition;
    /**
     * y轴位置 偏移量等配置
     */
    private JAxisPosition yJAxisPosition;

    /**
     * 饼图的时候可用
     */
    private RoseType roseType;

    private List<JIndicator> indicatorList;
    private Layout layout;

    @Getter
    @Setter
    public static class JIndicator {
        private String name;
        private Double max;
        private Double min;
    }

    /**
     * 当坐标系不是标准坐标系时，该配置会转嫁到
     * 坐标系的位置
     */
    @Getter
    @Setter
    public static class JCoordSysPosition {

        public static JCoordSysPosition empty = new JCoordSysPosition();

        private Integer z;
        private Integer zlevel;
        private Bottom bottom;
        private Left left;
        private Right right;
        private Top top;

        private Object[] center;
        private Object[] radius;
    }

    /**
     * 坐标轴配置
     */
    @Getter
    @Setter
    public static class JAxisPosition {

        public static JAxisPosition empty = new JAxisPosition();

        private AxisPosition position;
        private Integer offset;
    }

    @Data
    public static class Entry implements Cloneable{
        /**
         * x对应的值，
         *
         * 相当于series.data.name
         */
        private String x;
        /**
         * y对应的值
         * 相当于series.data.value
         */
        private Object y;
        /**
         * 仅适用于Graph，其他类型都不会使用该字段
         */
        private Object value;
        private String parent;
        private String category;
        private EntryGraphStyle entryGraphStyle;
        /**
         * 用于绘制直角坐标系上的Lines
         */
        private String toX;
        /**
         * 用户绘制直角坐标系上的Lines
         */
        private Object toY;
        /**
         * 堆叠
         */
        private String stack;
        /**
         * 系列名称
         */
        private String name;
        private Object min;
        private Object max;

        @Override
        public Object clone() {
            Entry entry = new Entry();
            entry.setY(y);
            entry.setX(x);
            entry.setStack(stack);
            entry.setName(name);
            return entry;
        }
    }

    @Getter
    @Setter
    public static class EntryGraphStyle {
        private Boolean fixed;
        private Integer category;
        private Symbol symbol;
        private Integer symbolSize;
        private Integer symbolRotate;
        private Boolean symbolKeepAspect;
        private Object[] symbolOffset;
    }

    @Getter
    @Setter
    public static class Link {
        private String source;
        private String target;
        private Object value;
    }
}
