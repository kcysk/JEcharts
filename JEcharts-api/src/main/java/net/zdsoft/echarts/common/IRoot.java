/**
 * FileName: IRoot.java
 * Author:   shenke
 * Date:     2018/6/13 下午3:18
 * Descriptor:
 */
package net.zdsoft.echarts.common;

import net.zdsoft.echarts.Option;

/**
 * @author shenke
 * @since 2018/6/13 下午3:18
 */
public abstract class IRoot<R extends IRoot> extends AbstractParent<Option, R> implements Root<R> {

    @Override
    public Option option() {
        return parent;
    }

    @Override
    public R option(Option option) {
        this.parent = option;
        return (R) this;
    }
}
