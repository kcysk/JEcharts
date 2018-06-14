/**
 * FileName: BarTest.java
 * Author:   shenke
 * Date:     2018/6/14 下午4:30
 * Descriptor:
 */
package net.zdsoft.echarts.bar;

import net.zdsoft.echarts.Option;
import net.zdsoft.echarts.coords.cartesian2d.Cartesian2dAxis;
import net.zdsoft.echarts.coords.data.AxisData;
import net.zdsoft.echarts.coords.enu.AxisType;
import net.zdsoft.echarts.enu.SeriesEnum;
import net.zdsoft.echarts.serialize.ToStringUtils;
import net.zdsoft.echarts.series.Bar;
import net.zdsoft.echarts.series.data.BarData;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author shenke
 * @since 2018/6/14 下午4:30
 */
public class BarTest {

    @Test
    public void _bar() {
        Random random = new Random(10);
        Option option = new Option();

        Cartesian2dAxis xAxis = new Cartesian2dAxis();
        List<AxisData> dataList = new ArrayList<>();
        List<BarData> barDatas = new ArrayList<>();
        for (int i=1 ;i<6; i++) {
            AxisData data = new AxisData();
            data.value("第" + i + "天");
            dataList.add(data);
            barDatas.add(new BarData().value(random.nextInt(500)));
        }
        xAxis.option(option).type(AxisType.category)
                .data(dataList.toArray(new AxisData[0]))
                .axisTick().alignWidthLabel(true);
        option.setXAxis(xAxis);
        option.setYAxis(new Cartesian2dAxis().type(AxisType.value));
        option.setSeries(Arrays.asList(new Bar().type(SeriesEnum.bar).data(barDatas.toArray(new BarData[0]))));

        String op = ToStringUtils.toJSONString(option);

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/template.html")));
            StringBuilder html = new StringBuilder();
            String s = null;
            while((s = reader.readLine())!=null){//使用readLine方法，一次读一行
                if (s.contains("${option}")) {
                    s = s.replace("${option}", op);
                }
                html.append(s);
                html.append(System.lineSeparator());
            }
            reader.close();

            File barHtml = new File("/Users/shenke/barHtml.html");
            Writer writer = new FileWriter(barHtml);
            writer.write(html.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
