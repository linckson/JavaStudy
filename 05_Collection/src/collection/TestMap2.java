package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map的常用方法
 * @Author: LinZhiWei
 * @Date: 2020-07-07 8:31
 */
public class TestMap2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001,"Tom",5000);
        Employee e2 = new Employee(1002,"Jerry",4000);
        Employee e3 = new Employee(1003,"Optimus Prime",10000);
        Employee e4 = new Employee(1003,"张三",1000);

        Map<Integer,Employee> map = new HashMap<>();
        map.put(1001,e1);
        map.put(1002,e2);
        map.put(1003,e3);
        map.put(1001,e4);//键重复就会把之前的覆盖掉

        System.out.println(map.hashCode());
        System.out.println(e1.hashCode());

        Employee emp = map.get(1001);
        System.out.println(emp.getEname());
        System.out.println(map);
    }
}

class Employee{
    private int id;
    private String ename;
    private double salary;

    public Employee(int id, String ename, double salary) {
        this.id = id;
        this.ename = ename;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", 名字='" + ename + '\'' +
                ", 工资=" + salary +
                '}';
    }
}