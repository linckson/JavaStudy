package net.tengdasoft.annotation;

import java.lang.reflect.Method;

/**
 * 需求：写一个"框架"，不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
 * 		* 实现：
 * 			1. 配置文件
 * 			2. 反射
 * 		* 步骤：
 * 			1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 * 			2. 在程序中加载读取配置文件
 * 			3. 使用反射技术来加载类文件进内存
 * 			4. 创建对象
 * 			5. 执行方法
 */

@Pro(className = "net.tengdasoft.annotation.Demo01",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {

        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.获取上面的注解对象   //下面语句在內存中生成了一个该注解接口的子类实现对象
        Pro anno_Pro = reflectTestClass.getAnnotation(Pro.class);
/*      相当于
        public class ProImpl implements Pro｛
            public String className()
            ｛return "cn. itcast.annotation.Demo1";｝
            public String methodName()
            {return "show";}
        }
*/

        //3.调用注解对象的方法(实质上是属性)，获取返回值(类名和方法名)
        String className = anno_Pro.className();
        String methodName = anno_Pro.methodName();

        //4.通过forName()，将类加载金进内存，并创建对象
        Class aClass = Class.forName(className);
        Object obj = aClass.newInstance();

        //5.通过getMethod，获取方法对象并执行方法(参数传入类对象)
        Method method = aClass.getMethod(methodName);
        method.invoke(obj);

    }
}



