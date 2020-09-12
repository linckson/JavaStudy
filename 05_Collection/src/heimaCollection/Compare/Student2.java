package heimaCollection.Compare;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-31 9:34
 */
public class Student2 {
    public String name;
    public int age;
    public float score;
    public Student2(String name, int age, float score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
