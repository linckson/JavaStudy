package heimaCollection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-31 8:55
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        //list.set(3,"4");

        for(String s : list){
            if(s.equals("four")) s="5";
            System.out.println(s);
        }
    }
}
