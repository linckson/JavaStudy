package heimaCollection.Generic.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-30 11:24
 */
public class Test04 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",15,"男");
        Student s2 = new Student("李丽",25,"女");
        Student s3 = new Student("王林",18,"男");

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Student maxAge = s1;
        Iterator<Student> it = al.iterator();
        while(it.hasNext()){
            Student temp = it.next();
            System.out.println(temp);
            if(temp.getAge()>maxAge.getAge()){
                maxAge = temp;
            }
        }
        maxAge.setName("最大年龄者");
        System.out.println(maxAge.getName()+maxAge.getAge()+"岁");
    }
}
