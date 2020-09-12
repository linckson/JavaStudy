package collection.collectionhomework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-10 9:22
 */
public class Test2 {
    //2.使用HashSet和TreeSet存储多个商品信息，遍历并输出;其中商品属性：编号，名称，单价，出版社;
    // 要求向其中添加多个相同的商品，验证集合中元素的唯一性。
    public static void main(String[] args) {
        hashSetStore();
    }
    public static void hashSetStore(){
        Set<Student> hs = new HashSet<>();
        hs.add(new Student(101,"101",18,"男"));
        hs.add(new Student(102,"101",18,"男"));
        hs.add(new Student(103,"101",18,"男"));
        hs.add(new Student(104,"101",18,"男"));
        hs.add(new Student(104,"101",18,"男"));
        hs.add(new Student(104,"101",18,"男"));

        for(Iterator<Student> temp = hs.iterator(); temp.hasNext();){
            System.out.println(temp.next());
        }
    }

}
