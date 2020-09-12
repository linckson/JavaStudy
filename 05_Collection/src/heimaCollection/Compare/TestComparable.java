package heimaCollection.Compare;

import java.util.Arrays;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-31 9:34
 */
public class TestComparable {
    public static void main(String[] args) {
//        ArrayList<Student> al = new ArrayList<>();
//        al.add(new Student("liusan",20,90.0F));
//        al.add(new Student("lisi",22,90.0F));
//        al.add(new Student("wangwu",20,99.0F));
//        al.add(new Student("sunliu",22,100.0F));
//
//        al.sort(Student::compareTo);

        Student[] students = {
                new Student("liusan",20,90.0F),
                new Student("lisi",22,90.0F),
                new Student("wangwu",20,99.0F),
                new Student("sunliu",22,100.0F)
        };
        Arrays.sort(students);
        for(Student s : students){
            System.out.println(s);
        }
    }
}
