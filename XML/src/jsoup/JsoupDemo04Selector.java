package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * jsoup
 */
public class JsoupDemo04Selector {
    public static void main(String[] args) throws IOException{
        String path = Jsoup.class.getClassLoader().getResource("student2.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
//        Elements elements_select = document.select("name");
//        System.out.println(elements_select);
        Elements elements = document.select("#Old");
        System.out.println(elements);
        Elements elements1 = document.select("#New");
        System.out.println(elements1);
        System.out.println("-------------------");

        //获取student标签且number为heima_1001的age子标签
        Elements student1_age = document.select("student[number='heima_1001'] > age");
        System.out.println(student1_age);

    }
}
