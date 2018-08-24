package net.zdsoft.echarts.enu;

/**
 * @author shenke
 * @since 2018/8/24 13:50
 */
public enum FocusNodeAdjacency {

    False,
    outEdges,
    inEdges,
    allEdges;


    @Override
    public String toString() {
        if (False.equals(this)) {
            return "false";
        }
        return super.toString();
    }
}
