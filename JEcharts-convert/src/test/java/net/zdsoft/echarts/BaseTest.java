/**
 * FileName: BaseTest.java
 * Author:   shenke
 * Date:     2018/6/20 下午6:35
 * Descriptor:
 */
package net.zdsoft.echarts;

import net.zdsoft.echarts.convert.api.JData;
import net.zdsoft.echarts.convert.api.JDataConvert;
import net.zdsoft.echarts.convert.api.JDataConvertChain;
import net.zdsoft.echarts.convert.api.JDataConvertChainImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.ServiceLoader;

/**
 * @author shenke
 * @since 2018/6/20 下午6:35
 */
public abstract class BaseTest {

    private static final String LOCAL = "output.dir";


    protected JDataConvertChain create() {
        List<JDataConvert> converts = new ArrayList<>();
        ServiceLoader.load(JDataConvert.class).forEach(converts::add);
        JDataConvertChain chain =  new JDataConvertChainImpl();
        ((JDataConvertChainImpl) chain).setConverts(converts.toArray(new JDataConvert[0]));
        return chain;
    }

    protected List<JData.Entry> createEntryList(int size, String name) {
        Random random = new Random();
        List<JData.Entry> entryList = new ArrayList<>(7);
        for (int i=1; i< size+1; i++) {
            JData.Entry entry = new JData.Entry();
            entry.setName(name);
            entry.setX("第" + (i+1) + "天");
            entry.setY(random.nextInt(200));
            entryList.add(entry);
        }
        return entryList;
    }

    protected void write2Html(String option, String htmlName) {
        try {
            Properties properties = new Properties();
            properties.load(BaseTest.class.getResourceAsStream("/local.properties"));
            String OUTPUT = properties.getProperty(LOCAL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/template.html")));
            StringBuilder html = new StringBuilder();
            String s = null;
            while((s = reader.readLine())!=null){//使用readLine方法，一次读一行
                if (s.contains("${option}")) {
                    s = s.replace("${option}", option);
                }
                html.append(s);
                html.append(System.lineSeparator());
            }
            reader.close();
            File barHtml = new File(OUTPUT + File.separator + "JEcharts" + File.separator + htmlName + ".html");
            barHtml.getParentFile().mkdirs();
            Writer writer = new FileWriter(barHtml);
            writer.write(html.toString());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
