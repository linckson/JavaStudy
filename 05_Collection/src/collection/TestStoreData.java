package collection;

import java.util.*;

/**]
 * 测试表格数据存储
 * ID	姓名		薪水	    入职日期
 * 1001	张三		20000	2018.5.5
 * 1002	李四		30000	2005.4.4
 * 1003	王五		3000	2020.7.7
 *
 *
 * ORM思想：对象关系映射
 * @Author: LinZhiWei
 * @Date: 2020-07-08 16:40
 */
public class TestStoreData {
    public static void main(String[] args) {

        //思路：每一行数据使用一个Map，整个表格使用一个List
        Map<String,Object> row1 = new HashMap<>();//第一行
        row1.put("id",1001);
        row1.put("name","张三");
        row1.put("salary",20000);
        row1.put("入职日期","2018.5.5");
        Map<String,Object> row2 = new HashMap<>();//第一行
        row2.put("id",1002);
        row2.put("name","李四");
        row2.put("salary",30000);
        row2.put("入职日期","2005.4.4");
        Map<String,Object> row3 = new HashMap<>();//第一行
        row3.put("id",1003);
        row3.put("name","王五");
        row3.put("salary",3000);
        row3.put("入职日期","2020.7.7");

        List<Map<String,Object>> table1 = new ArrayList<>();
        table1.add(row1);//把Map放在List里面
        table1.add(row2);
        table1.add(row3);

        for(Map<String,Object> row:table1){//列表内每个对象都是Map类型,每一行再遍历Map
            Set<String> keyset = row.keySet();//返回相应的key放入Set中，（因为Set不可重复？）
            for(String key : keyset){//遍历Set
                System.out.print(key+"="+row.get(key)+" ");
            }
            System.out.println();
        }
        System.out.println("********************");

        //第二种思路：每一行数据使用javabean对象存储，多行使用放到map或list中
        User user1 = new User(1001,"张三",20000,"2020.6.28");
        User user2 = new User(1001,"张四",30000,"2020.6.28");
        User user3 = new User(1001,"张五",2000,"2020.6.28");
        //每一行数据使用javabean对象存储

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        //把javabean放进List

        for(User u : list){
            System.out.println(u);
        }
        System.out.println("**********************");

        //或者把javabean放进Map中
        Map<Integer,User> map = new HashMap<>();
        map.put(1001,user1);
        map.put(1002,user2);
        map.put(1003,user3);
        Set<Integer> keyset = map.keySet();//要遍历Map需要获得其key值，存储在Set中
        for(Integer key : keyset){
            System.out.println(key+"="+map.get(key));
        }

    }
}
class User{
    //javabean
    //封装起来
    //一般一个完整构造器，要有set和get方法，和空的构造器
    private  int id;
    private String name;
    private double salary;
    private String hiredate;

    public User() {
    }

    public User(int id, String name, double salary, String hiredate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", hiredate='" + hiredate + '\'' +
                '}';
    }
}
