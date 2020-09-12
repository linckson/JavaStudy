package reflect;

import domain.Person;

import java.lang.reflect.Constructor;

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
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        Constructor[] constructors = personClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("--------------");
        Constructor constructor_noPara = personClass.getConstructor();
        System.out.println(constructor_noPara);
        Constructor constructor_withPara = personClass.getConstructor(String.class, int.class);
        Object o = constructor_noPara.newInstance();
        Object alice = constructor_withPara.newInstance("Alice", 20);
        System.out.println(o);
        System.out.println(alice);
        Person p = new Person();

    }
}
