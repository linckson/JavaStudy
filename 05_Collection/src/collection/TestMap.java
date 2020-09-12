package collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 测试HashMap
 * map中键不能重复，会被新的覆盖
 * @Author: LinZhiWei
 * @Date: 2020-07-07 8:13
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(1,"one");
        m1.put(2,"two");
        m1.put(3,"three");

        System.out.println(m1.get(2));
        System.out.println("size:"+m1.size());
        System.out.println(m1.containsKey(1));
        System.out.println(m1.containsValue("two"));

    }
}
