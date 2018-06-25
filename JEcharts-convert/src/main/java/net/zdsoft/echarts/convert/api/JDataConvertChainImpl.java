/**
 * FileName: JDataConvertChainImpl.java
 * Author:   shenke
 * Date:     2018/6/21 下午6:55
 * Descriptor:
 */
package net.zdsoft.echarts.convert.api;

import net.zdsoft.echarts.Option;

/**
 * @author shenke
 * @since 2018/6/21 下午6:55
 */
public class JDataConvertChainImpl implements JDataConvertChain {

    private JDataConvert[] converts;
    private int n;
    private int pos = 0;

    public void setConverts(JDataConvert[] converts) {
        this.converts = converts;
        this.n = this.converts.length;
    }

    @Override
    public void next(JData data, Option option ) {
        if (pos < n) {
            JDataConvert convert = converts[pos++];
            convert.convert(data, option, this);
        }
    }
}
