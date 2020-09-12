package collection;

import java.util.*;
import java.util.Map.Entry;

/**
 * 用迭代器Iterator去遍历List、Map、Set
 * Iterator提供了
 * @Author: LinZhiWei
 * @Date: 2020-07-08 11:15
 */
public class TestIterator {
    public static void main(String[] args) {
        testIterator();
    }

    public static void testIterator(){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("vv");

        //使用Iterator遍历List
        for(Iterator<String> iter = list.iterator(); iter.hasNext(); ){
            System.out.println(iter.next());
        }

        Set<String> set = new HashSet<>();
        set.add("cc");
        set.add("dd");
        set.add("ee");
        //和List没区别，Iterator提供了统一的遍历方式,map则不同
        for(Iterator<String> iter = set.iterator(); iter.hasNext(); ){
            System.out.println(iter.next());
        }

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(10,"ff");
        map1.put(20,"gg");
        map1.put(100,"hh");


        Set<Map.Entry<Integer,String>> ss = map1.entrySet();
        for(Iterator<Entry<Integer,String>> iter = ss.iterator(); iter.hasNext(); ){
            System.out.println(iter.next());
        }
        System.out.println("************************");
        //第二种遍历Map的方式
        //通过ketSet()获得Map的key集合，构造Iterator，通过hasNext()判断，利用next()遍历key和返回value
        Set<Integer> keySet = map1.keySet();
        for(Iterator<Integer> iter = keySet.iterator(); iter.hasNext();){
            Integer key = iter.next();
            System.out.println(key+"-"+map1.get(key));
        }
    }
}
