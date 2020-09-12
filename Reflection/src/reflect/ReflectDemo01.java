package reflect;

import domain.Person;

public class ReflectDemo01 {
    /**
     * 获取Class对象的三种方式
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //获取Class对象的三种方式
        //方法1 Class.forName("全类名") -》 将字节码加载进内存，返回class对象
        Class aClass = Class.forName("domain.Person");
        System.out.println(aClass);

        //方法2 类名.class
        Class personClass = Person.class;
        System.out.println(personClass);

        //方法3 对象.getClass()
        Person p = new Person();
        Class aClass1 = p.getClass();
        System.out.println(aClass1);
    }
}
