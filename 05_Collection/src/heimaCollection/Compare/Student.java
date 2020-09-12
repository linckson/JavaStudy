package heimaCollection.Compare;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-31 9:34
 */
public class Student implements Comparable<Student>{
    public String name;
    public int age;
    public float score;
    public Student(String name,int age,float score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    @Override
    public int compareTo(Student o) {
        if(this.score == o.score){
            return this.age - o.age;
        }else{
            return (int)o.score - (int)this.score;
        }

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
