/**
 * FileName: WordCloudData.java
 * Author:   shenke
 * Date:     2018/6/20 下午5:56
 * Descriptor:
 */
package net.zdsoft.echarts.series.data;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.series.WordCloud;
import net.zdsoft.echarts.style.TextStyle;

/**
 * @author shenke
 * @since 2018/6/20 下午5:56
 */
@Getter
@Setter
final public class WordCloudData extends CommonSData<WordCloud, WordCloudData> {

    private TextStyle<WordCloudData, TextStyle> textStyle;

    public TextStyle<WordCloudData, TextStyle> textStyle() {
        if (textStyle == null) {
            textStyle = new TextStyle<>().parent(this);
        }
        return textStyle;
    }

    public WordCloudData textStyle(TextStyle<WordCloudData, TextStyle> textStyle) {
        this.textStyle = textStyle;
        return this;
    }
}
