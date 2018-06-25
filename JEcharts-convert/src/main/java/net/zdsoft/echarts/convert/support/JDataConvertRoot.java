/**
 * FileName: JDataConvertRoot.java
 * Author:   shenke
 * Date:     2018/6/21 下午12:59
 * Descriptor:
 */
package net.zdsoft.echarts.convert.support;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.convert.api.GeoCoordHandler;
import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvert;
import net.zdsoft.echarts.coords.Axis;
import net.zdsoft.echarts.coords.cartesian2d.Cartesian2dAxis;
import net.zdsoft.echarts.coords.cartesian2d.Grid;
import net.zdsoft.echarts.coords.geo.Geo;
import net.zdsoft.echarts.coords.polar.AngleAxis;
import net.zdsoft.echarts.coords.polar.Polar;
import net.zdsoft.echarts.coords.polar.RadiusAxis;
import net.zdsoft.echarts.coords.radar.Radar;
import net.zdsoft.echarts.enu.CoordinateSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;

/**
 * @author shenke
 * @since 2018/6/21 下午12:59
 */
public abstract class JDataConvertRoot implements JDataConvert {

    protected static List<GeoCoordHandler> handlers;

    static {
        handlers = new ArrayList<>();
        ServiceLoader.load(GeoCoordHandler.class).forEach(handlers::add);
    }

    protected Object[] getGeoCoordByEntryX(String entryX) {
        Object[] coords = null;
        for (GeoCoordHandler handler : handlers) {
            coords = handler.doGeoCoords(entryX);
            if (coords != null) {
                return coords;
            }
        }
        return null;
    }

    protected Integer createCoordinateSystem(Option option, JData data,
                                             Axis xAxis, Axis yAxis) {

        //坐标系序号
        Integer coordSysIndex = data.getCoordSysIndex();

        if (data.isSelfCoordSys()) {
            //使用独立的二维坐标体系
            if (CoordinateSystem.cartesian2d.equals(data.getCoordSys())) {
                coordSysIndex = option.grid().size();
                option.grid().add(new Grid().parent(option));
            }
            //极坐标系
            else if (CoordinateSystem.polar.equals(data.getCoordSys())) {
                coordSysIndex = option.polar().size();
                option.polar().add(new Polar().parent(option));
            }
            //地理坐标系
            else if (CoordinateSystem.geo.equals(data.getCoordSys())) {
                coordSysIndex = option.geo().size();
                option.geo().add(new Geo().map(data.getMapType()).parent(option));
            }
            else if (CoordinateSystem.radar.equals(data.getCoordSys())) {
                coordSysIndex = option.radar().size();
                option.radar().add(new Radar().option(option));
            }
        } else {
            //坐标系还未建立
            if (option.grid().size() == 0) {
                coordSysIndex = 0;
                if (CoordinateSystem.cartesian2d.equals(data.getCoordSys())) {
                    option.grid().add(new Grid().option(option));
                }
                else if (CoordinateSystem.polar.equals(data.getCoordSys())) {
                    option.polar().add(new Polar().option(option));
                }
                else if (CoordinateSystem.geo.equals(data.getCoordSys())) {
                    option.geo().add(new Geo().option(option).map(data.getMapType()));
                }
                else if (CoordinateSystem.radar.equals(data.getCoordSys())) {
                    option.radar().add(new Radar().option(option));
                }
            } else {
                if (coordSysIndex == null) {
                    if (CoordinateSystem.cartesian2d.equals(data.getCoordSys())) {
                        coordSysIndex = option.grid().size() - 1;
                    }
                    else if (CoordinateSystem.polar.equals(data.getCoordSys())) {
                        coordSysIndex = option.polar().size() - 1;
                    }
                    else if (CoordinateSystem.geo.equals(data.getCoordSys())) {
                        coordSysIndex = option.geo().size() - 1;
                    }
                    else if (CoordinateSystem.radar.equals(data.getCoordSys())) {
                        coordSysIndex = option.radar().size() - 1;
                    }
                }
            }
        }
        if (xAxis != null) {
            xAxis.coordSysIndex(coordSysIndex);
        }
        if (yAxis != null) {
            yAxis.coordSysIndex(coordSysIndex);
        }


        JData.JCoordSysPosition coordSysPosition = data.getCoordSysPosition();
        if (CoordinateSystem.cartesian2d.equals(data.getCoordSys())) {
            if (data.isSelfCoordSys() || data.isSelfXAxis()) {
                JData.JAxisPosition xJAxisPosition =
                        Optional.ofNullable(data.getXJAxisPosition()).orElse(JData.JAxisPosition.empty);
                option.xAxis().add(((Cartesian2dAxis) xAxis).position(xJAxisPosition.getPosition())
                        .offset(xJAxisPosition.getOffset()));
            }
            if (data.isSelfCoordSys() || data.isSelfYAxis()) {
                JData.JAxisPosition yJAxisPosition =
                        Optional.ofNullable(data.getYJAxisPosition()).orElse(JData.JAxisPosition.empty);
                option.yAxis().add(((Cartesian2dAxis) yAxis).offset(yJAxisPosition.getOffset())
                        .position(yJAxisPosition.getPosition()));
            }

            if (coordSysPosition != null && data.isSelfCoordSys()) {
                option.grid().get(coordSysIndex).bottom(coordSysPosition.getBottom())
                        .top(coordSysPosition.getTop()).left(coordSysPosition.getLeft())
                        .right(coordSysPosition.getRight()).z(coordSysPosition.getZ())
                        .zlevel(coordSysPosition.getZlevel());
            }
        } else if (CoordinateSystem.polar.equals(data.getCoordSys())) {
            option.angleAxis().add((AngleAxis) xAxis);
            option.radiusAxis().add((RadiusAxis) yAxis);
            if (coordSysPosition != null && data.isSelfCoordSys()) {
                option.polar().get(coordSysIndex).center(coordSysPosition.getCenter())
                        .radius(coordSysPosition.getRadius());
            }
        } else if (CoordinateSystem.geo.equals(data.getCoordSys())) {
            if (coordSysPosition != null && data.isSelfCoordSys()) {
                option.geo().get(coordSysIndex).bottom(coordSysPosition.getBottom())
                        .top(coordSysPosition.getTop()).left(coordSysPosition.getLeft())
                        .right(coordSysPosition.getRight()).z(coordSysPosition.getZ())
                        .zlevel(coordSysPosition.getZlevel());
            }
        } else if (CoordinateSystem.radar.equals(data.getCoordSys())) {
            if (coordSysPosition != null && data.isSelfCoordSys()) {
                option.radar().get(coordSysIndex).center(coordSysPosition.getCenter())
                        .radius(coordSysPosition.getRadius());
            }
        }
        return coordSysIndex;
    }

    /**
     * 建立坐标轴
     *
     * @param coordSys  坐标系类型
     * @param angleAxis 是否是角度轴
     * @return
     */
    protected Axis createCoordinateSystemAxis(CoordinateSystem coordSys, boolean angleAxis) {
        switch (coordSys) {
            case polar:
                if (angleAxis) {
                    return new AngleAxis();
                }
                return new RadiusAxis();
            case cartesian2d:
                return new Cartesian2dAxis();
            default:
                return null;
        }
    }

    /*protected List<JDataEntry> parseJDataEntry(final JData data) {
        String text = data.getData();
        if (text == null) {
            return null;
        }

        List<JDataEntry> list;
        DefaultJSONParser parser = new DefaultJSONParser(text, ParserConfig.getGlobalInstance());
        parser.getExtraProcessors().add(new ExtraProcessor() {
            @Override
            public void processExtra(Object object, String key, Object value) {
                JDataEntry entry = (JDataEntry) object;
                if (StringUtils.equals(key, data.getX())) {
                    entry.setX(value == null ? null : value.toString());
                }
                if (StringUtils.equals(key, data.getY())) {
                    entry.setY(value);
                }
                if (StringUtils.equals(key, data.getStack())) {
                    entry.setStack(value == null ? null : value.toString());
                }
                if (StringUtils.equals(key, data.getS())) {
                    entry.setS(value == null ? null : value.toString());
                }
                if (entry.getOrigin() == null) {
                    entry.setOrigin(data);
                }
            }
        });

        JSONLexer lexer = parser.lexer;
        int token = lexer.token();
        if (token == JSONToken.NULL) {
            lexer.nextToken();
            list = null;
        } else if (token == JSONToken.EOF && lexer.isBlankInput()) {
            list = null;
        } else {
            list = new ArrayList<>();
            parser.parseArray(JDataEntry.class, list);

            parser.handleResovleTask(list);
        }
        parser.close();
        return list;
    }*/
}
