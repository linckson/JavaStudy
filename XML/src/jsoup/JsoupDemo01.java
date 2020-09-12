package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * jsoup
 */
public class JsoupDemo01 {
    public static void main(String[] args) throws IOException {
        //2.获取DOM对象
        //2.1 获取student2.xml的路径
        String path = Jsoup.class.getClassLoader().getResource("student2.xml").getPath();
        //2.2 解析xml文档，加载文档到内存，获取DOM树-->Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3. 通过name标签 获取元素对象 返回Elements容器数组
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        //3.1 获取第一个name的element对象
//        System.out.println(elements.get(0));
        Element ele0 = elements.get(0);
        //3.2 获取数据
        String name = ele0.text();
        System.out.println(name);
    }
}
