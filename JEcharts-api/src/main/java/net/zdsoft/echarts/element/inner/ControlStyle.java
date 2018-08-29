package net.zdsoft.echarts.element.inner;

import lombok.Data;
import net.zdsoft.echarts.enu.Position;

/**
 * @author shenke
 * @since 18-8-29 下午7:46
 */
@Data
public class ControlStyle {

    private Boolean show;
    private Boolean showPlayBtn;
    private Boolean showPrevBtn;
    private Boolean showNextBtn;
    private Integer itemSize;
    private Integer itemGap;
    private Position position;
    private String playIcon;
    private String stopIcon;
    private String prevIcon;
    private String nextIcon;
    private String color;
    private String borderColor;
    private Integer borderWidth;
}
