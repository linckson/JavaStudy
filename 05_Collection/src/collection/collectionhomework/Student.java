package collection.collectionhomework;

/**
 * @Author: LinZhiWei
 * @Date: 2020-07-10 9:14
 */

public class Student {
    private int id;
    private String name;
    private int age;
    private String sex;

    public Student() {

    }

    public Student(int id,String name,int age,String sex){
        this.id = id;
        this.name = name;
        this.age =age;
        this.sex = sex;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}