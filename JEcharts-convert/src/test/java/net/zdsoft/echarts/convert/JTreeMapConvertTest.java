package net.zdsoft.echarts.convert;

import net.zdsoft.echarts.BaseTest;
import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.enu.SeriesEnum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author shenke
 * @since
 */
public class JTreeMapConvertTest extends BaseTest {

    @Test
    public void execute() {
        JData data = new JData();
        List<JData.Entry> entryList = new ArrayList<>(5);
        Random random = new Random(100);
        for (int i = 0; i < 5; i++) {
            JData.Entry entry = new JData.Entry();
            entry.setX(String.valueOf(i));
            entry.setY(10 * (i+1));
            if (i==0 || i==1) {
                entry.setParent("3");
            }
            entryList.add(entry);
        }
        data.setEntryList(entryList);
        data.setType(SeriesEnum.treemap);
        Option option = new Option();
        create().next(data, option);

        write2Html(StringUtils.toJSONString(option), "treeMap");
    }
}
