package collection.collectionhomework;

import java.util.*;

/**
 *
 * @Author: LinZhiWei
 * @Date: 2020-07-10 9:12
 */
public class Test3 {
    //3. 实现List和Map数据的转换。具体要求如下：
    //
    //功能1：定义方法public void listToMap( ){ }将List中Student元素封装到Map中
    //
    //     1) 使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息并加入List;
    //
    //     2) 遍历List，输出每个Student信息;
    //
    //     3) 将List中数据放入Map，使用Student的id属性作为key，使用Student对象信息作为value;
    //
    //     4) 遍历Map，输出每个Entry的key和value。
    //
    //功能2：定义方法public void mapToList( ){ }将Map中Student映射信息封装到List
    //
    //     1) 创建实体类StudentEntry，可以存储Map中每个Entry的信息;
    //
    //     2) 使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息，并使用Student的id属性作为key，存入Map;
    //
    //     3) 创建List对象，每个元素类型是StudentEntry;
    //
    //     4) 将Map中每个Entry信息放入List对象。
    public static void main(String[] args) {
        listToMap();
        mapToList();
    }
    public static void listToMap(){
        Student s1 = new Student(100,"100",20,"男");
        Student s2 = new Student(101,"101",20,"男");
        Student s3 = new Student(102,"102",20,"男");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for(Student s : list){
            System.out.println(s);//遍历输出List
        }
        System.out.println("***********************");
        System.out.println("list to map");
        Map<Integer,Object> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            map.put(list.get(i).getId(),list.get(i));//(id，Student)
        }
        Set<Integer> keySet = map.keySet();
        for(Iterator<Integer> iter = keySet.iterator(); iter.hasNext();){
            Integer key = iter.next();
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("***********************");

    }
    public static void mapToList(){
        Student s3 = new Student(200,"100",20,"女");
        Student s4 = new Student(201,"101",20,"女");
        Student s5 = new Student(202,"102",20,"女");
        Map<Integer,Object> map = new HashMap<>();
        map.put(200,s3);
        map.put(201,s4);
        map.put(202,s5);
        Set<Integer> keySet = map.keySet();
        for(Iterator<Integer> iter = keySet.iterator(); iter.hasNext();){
            Integer key = iter.next();
            System.out.println(key+"="+map.get(key));
        }

        List<Object> list = new ArrayList<>();
        Set<Map.Entry<Integer,Object>> entrySet = map.entrySet();
        for(Iterator<Map.Entry<Integer,Object>> iter = entrySet.iterator();iter.hasNext();){
            list.add(iter.next().getValue());
        }
        System.out.println("***********************");
        System.out.println("map to list");
        for(Object iter : list){
            System.out.println(iter);
        }
        System.out.println("***********************");
    }

}
