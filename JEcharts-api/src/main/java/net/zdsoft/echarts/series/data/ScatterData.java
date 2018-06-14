/**
 * FileName: ScatterData.java
 * Author:   shenke
 * Date:     2018/6/13 下午11:26
 * Descriptor:
 */
package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Symbol;
import net.zdsoft.echarts.series.Scatter;

/**
 * @author shenke
 * @since 2018/6/13 下午11:26
 */
@Getter
@Setter
final public class ScatterData extends CommonSData<Scatter, ScatterData> {

    private Symbol symbol;
    /**
     * [ default: 4 ]
     * 标记的大小，可以设置成诸如 10 这样单一的数字，也可以用数组分开表示宽和高，例如 [20, 10] 表示标记宽为20，高为10。
     *
     * 如果需要每个数据的图形大小不一样，可以设置为如下格式的回调函数：
     *
     * (value: Array|number, params: Object) => number|Array
     * 其中第一个参数 value 为 data 中的数据值。第二个参数params 是其它的数据项参数。
     */
    private Object symbolSize;
    private Integer symbolRotate;
    /**
     * 如果 symbol 是 path:// 的形式，是否在缩放时保持该图形的长宽比。
     */
    private Boolean symbolKeepAspect;
    /**
     * 标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。
     *
     * 例如 [0, '50%'] 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点
     */
    private Object[] symbolOffset;


    public ScatterData symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public ScatterData symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public ScatterData symbolRotate(Integer symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    public ScatterData symbolKeepAspect(Boolean symbolKeepAspect) {
        this.symbolKeepAspect = symbolKeepAspect;
        return this;
    }

    public ScatterData symbolOffset(Object[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }
}
