package collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-08 10:57
 */
public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();

        ts.add(100);
        ts.add(200);
        ts.add(10);
        Set<Emp2> ts2 = new TreeSet<>();
        ts2.add(new Emp2(101,"Tom",5000));
        ts2.add(new Emp2(102,"Tom",500));
        ts2.add(new Emp2(11,"Tom",50000));
        for(Emp2 m:ts2){
            System.out.println(m);
        }
    }
}
class Emp2 implements Comparable<Emp2>{//继承了Comparable，实现了可比较的Emp2类
    int id;
    String name;
    double salary;

    public Emp2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary;
    }

    @Override
    public int compareTo(Emp2 o) {
        if(this.salary > o.salary){
            return 1;
        }else if(this.salary < o.salary){
            return -1;
        }else{
            if(this.id > o.id){
                return 1;
            }else if(this.id < o.id){
                return -1;
            }else{
                return 0;
            }
        }
    }
}