package net.tengdasoft.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * 当TestCheck方法被执行，所有加了注解的方法会被检测，判断是否出现异常
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //1.获取Calculator对象的字节码文件对象
        Calculator c = new Calculator();
        Class cClass = c.getClass();

        //2.获取所有方法
        Method[] declaredMethods = cClass.getDeclaredMethods();

        int cnt = 0;//出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method declaredMethod : declaredMethods) {
            //3.判断方法是否被Check注解
            if(declaredMethod.isAnnotationPresent(Check.class)){
                //4.有，则执行
                try {
                    declaredMethod.invoke(c);
                } catch (Exception e) {
                    //5.捕获异常
                    cnt++;
                    //记录到文件中
                    bw.write(declaredMethod.getName()+"出现了异常");
                    bw.newLine();
                    bw.write("异常原因"+e.getCause());
                    bw.newLine();
                    bw.write("=======================");
                    bw.newLine();
                }
            }
        }
        bw.write("共出现了"+cnt+"次异常");
        bw.flush();
        bw.close();
    }
}
