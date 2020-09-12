package heimaCollection.LinkedList;

import java.util.LinkedList;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-31 8:22
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> lklist = new LinkedList<>();

        lklist.add(1);
        lklist.add(2);
        lklist.add(3);
        lklist.add(4);
        lklist.add(5);

        lklist.set(1,0);
        System.out.println("index of 1:"+lklist.get(1));

        System.out.println("remove index of 1:"+lklist.remove(1));

        lklist.removeFirst();

        //lklist.clear();
        System.out.println("getFirst:"+lklist.getFirst());

        lklist.addFirst(1);

        System.out.println("peek:"+lklist.peek());
        System.out.println("poll:"+lklist.poll());//查询并删除第一个元素



//        Iterator<Integer> it = lklist.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        for(Integer i : lklist){
            System.out.println(i);
        }

    }
}
