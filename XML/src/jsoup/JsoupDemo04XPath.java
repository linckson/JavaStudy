package jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * jsoup
 */
public class JsoupDemo04XPath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = Jsoup.class.getClassLoader().getResource("student2.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");

        //根据document对象，创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);

        List<JXNode> jxNodes = jxDocument.selN("//student");
        Iterator<JXNode> iter = jxNodes.iterator();
        for(;iter.hasNext();){
            System.out.println(iter.next());
        }
        System.out.println("------------");
        //student标签下的name标签
        List<JXNode> jxNodes1 = jxDocument.selN("//student/name");
        for(JXNode node : jxNodes1){
            System.out.println(node);
        }
        System.out.println("------------");
        //student标签下带有id的name标签
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name[@id]");
        for(JXNode node : jxNodes2){
            System.out.println(node);
        }
        System.out.println("------------");
        //student标签下带有id的name标签
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id='new']");
        for(JXNode node : jxNodes3){
            System.out.println(node);
        }

    }
}
