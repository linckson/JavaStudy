package collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-08 8:52
 */
public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> tm = new TreeMap<>();

        tm.put(20,"aa");
        tm.put(3,"bb");
        tm.put(6,"cc");

        //按照key自增方式排序
        /*for(Integer key:tm.keySet()){
            System.out.println(key+"---"+tm.get(key));
        }*/

        Map<Emp,String> tm2 = new TreeMap<>();
        tm2.put(new Emp(101,"Tom101",2121),"汤姆");
        tm2.put(new Emp(102,"Jerry102",3131),"杰瑞");
        tm2.put(new Emp(12,"Jerry12",131),"杰瑞");
        tm2.put(new Emp(2,"Jerry2",131),"杰瑞");

        for(Emp key : tm2.keySet()){
            System.out.println(key+"---"+tm2.get(key));
        }
    }
}
class Emp implements Comparable<Emp>{//继承了Comparable，实现了可比较的Emp类
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
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
    public int compareTo(Emp o) {
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
