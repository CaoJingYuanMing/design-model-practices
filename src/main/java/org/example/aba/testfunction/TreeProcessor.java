package org.example.aba.testfunction;

import java.lang.reflect.Method;

/**
 * 注解处理器
 */
public class TreeProcessor {
    public void parseMethod(final Class<?> clazz) throws Exception {
        final Object obj = clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
        final Method[] methods = clazz.getDeclaredMethods();
        for (final Method method : methods) {
            final Tree my = method.getAnnotation(Tree.class);
            if (null != my) {
                method.invoke(obj, my.name());
            }
        }
    }
}
