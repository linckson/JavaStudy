package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections辅助类的使用
 * 注意：这不是接口
 * @Author: LinZhiWei
 * @Date: 2020-07-08 16:06
 */
public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add("A"+i);
        }
        System.out.println(list);
        System.out.println("reverse逆序排列：");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("shuffle随机排列：");
        Collections.shuffle(list);//随机排列
        System.out.println(list);
        System.out.println("sort递增排序");
        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list,"A7"));
    }
}
