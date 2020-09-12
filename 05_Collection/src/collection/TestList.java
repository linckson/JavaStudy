package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试Collection接口中的方法
 * boolean removeAll(Collection c)  移除本容器和容器c相同的元素
 * boolean retainAll(Collection c)  取和c容器相同的元素，移除不同的元素
 * Object[] toArray()   转化为Object数组
 * @Author: LinZhiWei
 * @Date: 2020-07-03 16:28
 */
public class TestList {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("sad");
        c.add("happy");
        System.out.println(c);
        System.out.println(c.size());

        System.out.println(c.contains("happy"));

        Object[] objs = c.toArray();
        for(int i =0 ; i < objs.length; i++){
            System.out.print("*"+objs[i]);
        }

        c.remove("sad");//把这个对象从容器中移出，而非删除(把容器中的地址删了)
        System.out.println("\n"+c);

        c.clear();//全部移除

    }
}
