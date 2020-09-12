package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 无序、不可重复
 * HashSet底层其实是map，但全是key的操作，key不能重复，所以set不能重复
 * @Author: LinZhiWei
 * @Date: 2020-07-08 10:21
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("aa");
        set1.add("bb");
        set1.add("aa");
        System.out.println(set1);
    }
}
