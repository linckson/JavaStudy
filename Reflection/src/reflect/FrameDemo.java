package reflect;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

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
public class FrameDemo {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1 创建properties对象
        Properties prop = new Properties();
        //1.2加载配置文件，转换为一个集合
        /*prop.load(new FileReader(new File("../prop.properties")));*/ //错误方式
        //1.2.1 获取class文件目录下的配置文件
        //1.2.1.1 获取类加载器，用于把class文件加载进内存
        ClassLoader classLoader = FrameDemo.class.getClassLoader();
        //1.2.1.2 由类加载器获取配置文件,返回其字节流
        InputStream is = classLoader.getResourceAsStream("prop.properties");
        prop.load(is); //properties对象

        //2 获取配置文件中的数据
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //3.利用反射，加载类进内存
        Class personClass = Class.forName(className);


        Constructor constructor = personClass.getConstructor(String.class, int.class);
        Object bob = constructor.newInstance("Bob", 30);
        System.out.println(bob);

        Method eat_method = personClass.getMethod("eat");
        eat_method.invoke(bob);

    }
}
