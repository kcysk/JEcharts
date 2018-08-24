package net.zdsoft.echarts.enu;

/**
 * @author shenke
 * @since 2018/8/24 10:02
 */
public enum NodeClick {

    /**
     * 节点点击无反应
     */
    FALSE,
    /**
     * 点击节点后缩放到该节点
     */
    zoomToNode,
    /**
     * 如果节点数据中有 link 点击节点后会进行超链接跳转
     */
    link
    ;


    @Override
    public String toString() {
        if (FALSE.equals(this)) {
            return "false";
        }
        return super.toString();
    }
}
