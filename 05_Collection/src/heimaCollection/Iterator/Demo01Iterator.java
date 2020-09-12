package heimaCollection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-29 16:10
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

//        for(Iterator<String> iter = list.iterator(); iter.hasNext();){
//            System.out.print(iter.next());
////        }
       Iterator<String> iter = list.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }

        for(String temp : list){
            System.out.println(temp);
        }
    }
}
