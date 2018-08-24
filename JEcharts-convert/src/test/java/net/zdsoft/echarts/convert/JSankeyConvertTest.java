package net.zdsoft.echarts.convert;

import net.zdsoft.echarts.BaseTest;
import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.enu.SeriesEnum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenke
 * @since 2018/8/24 15:08
 */
public class JSankeyConvertTest extends BaseTest {

    @Test
    public void _execute() {
        JData data = new JData();
        List<JData.Entry> entries = createEntryList(3, "sankey");
        JData.Entry entry = new JData.Entry();
        entry.setX("周");
        entries.add(entry);
        data.setEntryList(entries);
        data.setLinkList(createLinks());
        data.setType(SeriesEnum.sankey);

        Option option = new Option();
        create().next(data, option);
        write2Html(StringUtils.toJSONString(option), "ss");
    }

    public List<JData.Link> createLinks() {
        List<JData.Link> links = new ArrayList<>();
        for (int i=1; i<4; i++) {
            JData.Link link = new JData.Link();
            link.setSource("第"+ (i + 1) + "天");
            link.setTarget("周");
            link.setValue(20);
            links.add(link);
        }
        return links;
    }
}
