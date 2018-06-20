/**
 * FileName: Dataset.java
 * Author:   shenke
 * Date:     2018/6/20 上午11:41
 * Descriptor:
 */
package net.zdsoft.echarts.element;

import lombok.Getter;
import lombok.Setter;
import net.zdsoft.echarts.common.IRoot;

/**
 * @author shenke
 * @since 2018/6/20 上午11:41
 */
@Getter
@Setter
final public class Dataset extends IRoot<Dataset> {

    private String id;
    private Object[][] source;
    private DatasetDimensionObject[] dimensions;
    /**
     * dataset.source 第一行/列是否是 维度名 信息。可选值：
     *
     * null/undefine：默认，自动探测。
     * true：第一行/列是维度名信息。
     * false：第一行/列直接开始是数据。
     * 注意：“第一行/列” 的意思是，如果 series.seriesLayoutBy 设置为 'column'（默认值），则取第一行，如果 series.seriesLayoutBy 设置为 'row'，则取第一列
     */
    private Boolean sourceHeader;

    public Dataset id(String id) {
        this.id = id;
        return this;
    }

    public Dataset source(Object[][] source) {
        this.source = source;
        return this;
    }

    public Dataset dimensions(DatasetDimensionObject[] dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public Dataset sourceHeader(Boolean sourceHeader) {
        this.sourceHeader = sourceHeader;
        return this;
    }


    @Getter
    @Setter
    public static class DatasetDimensionObject {
        private String name;
        /**
         * 可选：
         * string, number, ordinal, float, int, time
         */
        private String type;
        private String displayName;


        public DatasetDimensionObject name(String name) {
            this.name = name;
            return this;
        }

        public DatasetDimensionObject type(String type) {
            this.type = type;
            return this;
        }

        public DatasetDimensionObject displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
    }
}
