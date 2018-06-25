/**
 * FileName: JConverter.java
 * Author:   shenke
 * Date:     2018/6/24 下午3:27
 * Descriptor:
 */
package net.zdsoft.echarts.convert;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvert;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.convert.api.JDataConvertChainImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author shenke
 * @since 2018/6/24 下午3:27
 */
final public class JConverter {

    private static JDataConvert[] converts;

    static {
        List<JDataConvert> convertList = new ArrayList<>();
        ServiceLoader.load(JDataConvert.class).iterator().forEachRemaining(convertList::add);
        converts = convertList.toArray(new JDataConvert[0]);
    }

    public static void convert(JData data, Option option) {
        JDataConvertChain chain = new JDataConvertChainImpl();
        ((JDataConvertChainImpl) chain).setConverts(converts);
        chain.next(data, option);
    }
}
