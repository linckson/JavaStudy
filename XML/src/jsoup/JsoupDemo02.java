package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

/**
 * jsoup
 */
public class JsoupDemo02 {
    public static void main(String[] args) throws IOException {
        //2.获取DOM对象
        //2.1 获取student2.xml的路径
        String path = Jsoup.class.getClassLoader().getResource("student2.xml").getPath();
        //2.2 解析xml文档，获取dom树，-->Document对象
        //2.2.1 第一种方式
//        Document document = Jsoup.parse(new File(path), "utf-8");
//        System.out.println(document);

        //2.2.2 第二种方式 直接复制xml字符串，解析之
//        String xmlStr = "<?xml version=\"1.0\" ?>\n" +
//                "<students number=\"heima_1001\">\n" +
//                "    <student>\n" +
//                "        <name>Alice</name>\n" +
//                "        <age>18</age>\n" +
//                "        <sex>female</sex>\n" +
//                "    </student>\n" +
//                "    <student>\n" +
//                "        <name>Bob</name>\n" +
//                "        <age>99</age>\n" +
//                "        <sex>male</sex>\n" +
//                "    </student>\n" +
//                "</students>";
//        Document document = Jsoup.parse(xmlStr);
//        System.out.println(document);
        //2.2.3 第三种方法 通过网络路径获取指定的html或xml文档对象
        URL url = new URL("https://www.baidu.com");
        Document document = Jsoup.parse(url, 10000);
        System.out.println(document);
    }
}
