/**
 * FileName: BaseTest.java
 * Author:   shenke
 * Date:     2018/6/20 下午6:35
 * Descriptor:
 */
package net.zdsoft.echarts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Properties;

/**
 * @author shenke
 * @since 2018/6/20 下午6:35
 */
public abstract class BaseTest {

    private static final String LOCAL = "ouput.dir";

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
