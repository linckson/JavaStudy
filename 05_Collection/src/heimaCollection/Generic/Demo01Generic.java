package heimaCollection.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-29 16:43
 */
public class Demo01Generic {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("122");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next().length());

        }

    }

    private static void show01(){
        ArrayList list = new ArrayList();
        list.add("111");
        list.add(123);
        list.add(Math.PI);

        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
