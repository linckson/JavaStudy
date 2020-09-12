package net.tengdasoft.annotation;

//用注解代替配置文件

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= {ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Pro {
    String className();
    String methodName();
}
