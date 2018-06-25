/**
 * FileName: WordCloud.java
 * Author:   shenke
 * Date:     2018/6/20 下午5:50
 * Descriptor:
 */
package net.zdsoft.echarts.series;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.enu.Bottom;
import net.zdsoft.echarts.enu.Left;
import net.zdsoft.echarts.enu.Right;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.enu.Top;
import net.zdsoft.echarts.series.data.WordCloudData;
import net.zdsoft.echarts.style.TextStyle;

/**
 * @author shenke
 * @since 2018/6/20 下午5:50
 */
@Getter
@Setter
final public class WordCloud extends Series<WordCloud, WordCloudData> {

    private String shape;
    private Object maskImage;
    private Left left;
    private Top top;
    private Right right;
    private Bottom bottom;
    private Object width;
    private Object height;

    private Integer[] sizeRange;
    private Integer[] rotationRange;
    private Integer ratationStep;
    private Integer gridSize;
    private Boolean drawOutOfBound;
    private TextStyle<WordCloud, TextStyle> textStyle;

    @Override
    public WordCloudData create() {
        return new WordCloudData().parent(this);
    }

    public WordCloud() {
        this.type(SeriesEnum.wordCloud);
    }

    public WordCloud shape(String shape) {
        this.shape = shape;
        return this;
    }

    public WordCloud maskImage(Object maskImage) {
        this.maskImage = maskImage;
        return this;
    }

    public WordCloud width(Object width) {
        this.width = width;
        return this;
    }

    public WordCloud height(Object height) {
        this.height = height;
        return this;
    }

    public WordCloud sizeRange(Integer[] sizeRange) {
        this.sizeRange = sizeRange;
        return this;
    }

    public WordCloud rotationRange(Integer[] rotationRange) {
        this.rotationRange = rotationRange;
        return this;
    }

    public WordCloud ratationStep(Integer ratationStep) {
        this.ratationStep = ratationStep;
        return this;
    }

    public WordCloud gridSize(Integer gridSize) {
        this.gridSize = gridSize;
        return this;
    }

    public WordCloud drawOutOfBound(Boolean drawOutOfBound) {
        this.drawOutOfBound = drawOutOfBound;
        return this;
    }

    public TextStyle<WordCloud, TextStyle> textStyle() {
        if (textStyle == null) {
            textStyle = new TextStyle<>().parent(this);
        }
        return textStyle;
    }

    public WordCloud textStyle(TextStyle<WordCloud, TextStyle> textStyle) {
        this.textStyle = textStyle;
        return this;
    }
}
