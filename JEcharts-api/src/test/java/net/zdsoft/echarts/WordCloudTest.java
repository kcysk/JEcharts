/**
 * FileName: WordCloudTest.java
 * Author:   shenke
 * Date:     2018/6/20 下午7:08
 * Descriptor:
 */
package net.zdsoft.echarts;

import net.zdsoft.echarts.common.StringUtils;
import net.zdsoft.echarts.series.WordCloud;
import org.junit.Test;

import java.util.Random;

/**
 * @author shenke
 * @since 2018/6/20 下午7:08
 */
public class WordCloudTest extends BaseTest{

    @Test
    public void _test() {
        String[] randomArray = new String[]{"伊朗", "葡萄牙", "西班牙", "世界杯", "俄罗斯", "欧洲", "摩洛哥", "梅西" ,
        "耶罗", "C罗", "直播", "鏖战", "最佳球员"};
        Random random = new Random();
        Option option = new Option();
        WordCloud wordCloud = new WordCloud();
        for ( int i=0; i<randomArray.length; i++) {
            wordCloud.data(wordCloud.create().name(randomArray[i]).value(random.nextInt(500)));
        }
        option.series(wordCloud);

        write2Html(StringUtils.toJSONString(option), "wordCloud");
    }
}
