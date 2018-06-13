/**
 * FileName: Series.java
 * Author:   shenke
 * Date:     2018/6/13 下午3:15
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.Animationer;
import net.zdsoft.echarts.common.DataActor;
import net.zdsoft.echarts.common.Root;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.series.data.SData;
import net.zdsoft.echarts.style.ItemStyle;
import net.zdsoft.echarts.style.Label;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author shenke
 * @since 2018/6/13 下午3:15
 */
@Getter
@Setter
public abstract class Series<R extends Series, D extends SData> extends Animationer<Option, R> implements Root<R>, DataActor<R, D> {

    private SeriesEnum type;
    private String id;
    private String name;
    private Integer z;
    private Integer zlevel;

    private ItemStyle<R, ?> itemStyle;
    private Label<R> label;


    @Override
    public Option option() {
        return parent();
    }

    @Override
    public R option(Option option) {
        this.parent(option);
        return (R) this;
    }

    private List<SData> data;

    @Override
    public R data(D... t) {
        if (data == null) {
            data = new LinkedList<>();
        }
        data.addAll(Arrays.asList(t));
        return (R) this;
    }

    public abstract D create();
}
