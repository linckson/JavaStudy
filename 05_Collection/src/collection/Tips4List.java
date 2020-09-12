package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-04 8:46
 */
public class Tips4List {
/**
 * List接口常用的实现类：ArrayList、LinkedList、Vector
 * ArrayList：数组，线程不安全
 * Vector:数组，线程安全
 * LinkedList:链表
 */


    public static void main(String[] args) {
        test03();
    }
    public static void test01(){}

    public static void test02(){
        //List相关方法，Set内的方法基本一致
        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        List<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");

//        System.out.println("01:"+list01);
//        System.out.println("02:"+list02);
//        list01.retainAll(list02);
//        System.out.println("retain"+list01);
//        //aa  取交集

        System.out.println("list01:"+list01);

        list01.addAll(list02);
        System.out.println("list01 add :"+list01);
        list01.add("a");
        System.out.println("list01 add a"+list01);

        System.out.println(list01.containsAll(list02));//01包含02所有元素



//        list01.removeAll(list02);//01移除02所有元素
    }

    public static void test03(){
        //测试索引相关方法
       List<String> list = new ArrayList<>();
       list.add("A");
       list.add("B");
       list.add("C");
       list.add("D");

        System.out.println(list);

        list.add(2,"hello");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        list.set(0,"替换");
        System.out.println(list);

        list.add("C");
        list.add("B");
        list.add("A");
        System.out.println(list);

        System.out.println(list.indexOf("B"));//返回第一个找到的元素位置
        System.out.println(list.lastIndexOf("B"));
    }
}
