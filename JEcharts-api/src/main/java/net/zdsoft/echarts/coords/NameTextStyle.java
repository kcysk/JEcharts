/**
 * FileName: NameTextStyle.java
 * Author:   shenke
 * Date:     2018/6/14 下午2:55
 * Descriptor:
 */
package net.zdsoft.echarts.coords;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.style.AbstractLabel;

/**
 * Label 属性集合多于NameTextStyle
 * 重写方法以避免部分参数被解析
 * @author shenke
 * @since 2018/6/14 下午2:55
 */
@Getter
@Setter
final public class NameTextStyle<P> extends AbstractLabel<P, NameTextStyle> {

    /* not support */

    @Override
    public NameTextStyle<P> show(Boolean show) {
        return this;
    }

    @Override
    public NameTextStyle<P> rotate(Integer rotate) {
        return this;
    }

    @Override
    public NameTextStyle<P> offset(Integer[] offset) {
        return this;
    }

    @Override
    public NameTextStyle<P> formatter(Object formatter) {
        return this;
    }

    @Override
    public Boolean getShow() {
        return null;
    }

    @Override
    public Integer getRotate() {
        return null;
    }

    @Override
    public Integer[] getOffset() {
        return null;
    }

    @Override
    public Object getFormatter() {
        return null;
    }

    @Override
    public void setShow(Boolean show) {
    }

    @Override
    public void setRotate(Integer rotate) {
    }

    @Override
    public void setOffset(Integer[] offset) {
    }

    @Override
    public void setFormatter(Object formatter) {
    }
}
