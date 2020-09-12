package reflect;

import domain.Person;

import java.lang.reflect.Field;

/**
 * 获取成员变量们
 *    * Field[] getFields() ：获取所有public修饰的成员变量
 *    * Field getField(String name)   获取指定名称的 public修饰的成员变量
 *
 *    * Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
 *    * Field getDeclaredField(String name)
 * 2. 获取构造方法们
 *    * Constructor<?>[] getConstructors()
 *    * Constructor<T> getConstructor(类<?>... parameterTypes)
 *
 *    * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 *    * Constructor<?>[] getDeclaredConstructors()
 * 3. 获取成员方法们：
 *    * Method[] getMethods()
 *    * Method getMethod(String name, 类<?>... parameterTypes)
 *
 *    * Method[] getDeclaredMethods()
 *    * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
 *
 * 4. 获取全类名
 *    * String getName()
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Field a = personClass.getField("a");
        System.out.println(a);
        //获取成员变量的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        a.set(p,"set");
        Object value2 = a.get(p);
        System.out.println(value2);
        System.out.println(p);

        System.out.println("-------------------");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-----------------");
        Field d = personClass.getDeclaredField("d");
        System.out.println("d is : "+d);
        //忽略权限检查 //暴力反射
        d.setAccessible(true);
        Object value4 = d.get(p);//直接访问会报错，非法访问异常
        System.out.println(value4);
    }
}
