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
public class JsoupDemo03 {
    public static void main(String[] args) throws IOException{
        //获取路径
        String path = Jsoup.class.getClassLoader().getResource("student2.xml").getPath();
        //解析路径，获取Document对象
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取Element
        Elements elements = document.getElementsByAttribute("id");
        for(Element e : elements){
//            System.out.println(e);
            System.out.println(e.attr("id"));
            System.out.println(e.html());
            System.out.println(e.id());
        }


    }
}
