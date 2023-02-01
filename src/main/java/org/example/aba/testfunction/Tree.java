package org.example.aba.testfunction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target：声明注解运用的地方
@Target(ElementType.METHOD)
// @Retention：声明注解的的存活时间
@Retention(RetentionPolicy.RUNTIME)
public @interface Tree {
    String name() default "tree";
}
