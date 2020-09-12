package heimaCollection.Generic.HomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-30 10:55
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));
    }
    public static int listTest(Collection<String> list,String s){
        int count = 0;
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if(it.next().equals(s)){
                count++;
            }
        }
        return count;
    }
}
