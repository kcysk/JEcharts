/**
 * FileName: AbstractParent.java
 * Author:   shenke
 * Date:     2018/6/13 上午10:33
 * Descriptor:
 */
package net.zdsoft.echarts.common;

import java.util.function.Supplier;

/**
 * @author shenke
 * @since 2018/6/13 上午10:33
 */
public abstract class AbstractParent<P, A extends AbstractParent> implements Parent<P, A> {

    P parent;

    @Override
    public P parent() {
        return parent;
    }

    @Override
    public void parent(P parent) {
        this.parent = parent;
    }

    /**
     * 构建子对象
     * @param supplier
     * @param parent
     * @param t
     * @param <PA>
     * @param <T>
     * @return
     */
    protected <PA, T extends AbstractParent<PA, ?>> T build(PA parent, T t, Supplier<T> supplier) {
        if (t == null) {
            t = supplier.get();
            t.parent(parent);
        }
        return t;
    }
}
