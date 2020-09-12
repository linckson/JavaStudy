package heimaCollection.Compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-31 9:55
 */
public class TestComparator {
    public static void main(String[] args) {
        Student2[] students = {
                new Student2("liusan",200,90.0F),
                new Student2("lisi",220,90.0F),
                new Student2("wangwu",200,99.0F),
                new Student2("sunliu",220,100.0F)
        };
        Comparator<Student2> comparator1 = new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                if(o1.score == o2.score){
                    return o1.age - o2.age;
                }else{
                    return (int)o2.score - (int)o1.score;
                }
            }
        };
        Arrays.sort(students,comparator1);
        for(Student2 s : students){
            System.out.println(s);
        }
    }
}
