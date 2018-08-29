package net.zdsoft.echarts.element.inner;

import lombok.Data;
import net.zdsoft.echarts.enu.Symbol;

/**
 * @author shenke
 * @since 18-8-29 下午7:33
 */
@Data
public class CheckpointStyle {

    private Symbol symbol;
    private Integer symbolSize;
    private Integer symbolRotate;
    private Boolean symbolKeepAspect;
    private Object[] symbolOffset;
    private String color;
    private Integer borderWidth;
    private String borderColor;
    private Boolean animation;
    private Integer animationDuration;
    private String animationEasing;
}
