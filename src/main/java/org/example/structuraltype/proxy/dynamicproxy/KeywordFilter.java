package org.example.structuraltype.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * 动态代理类
 * 过滤器代理类，想实现同时对两种实现类调用方法的过滤
 */
public class KeywordFilter implements InvocationHandler {
    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    // 被代理的真实对象, 有可能是猫，交换机，或者别的东西
    private Object origin;

    // 关键词过滤逻辑
    public KeywordFilter(Object origin) {
        // 注入被代理对象
        this.origin = origin;
        System.out.println("开启关键字过滤模式...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 要被切入方法面之前的业务逻辑
        String arg = args[0].toString();
        System.out.println("arg is : " + arg);
        for (String keyword : blackList) {
            if (arg.toString().contains(keyword)) {
                System.out.println("禁止访问：" + arg);
                return null;
            }
        }
        //调用真实的被代理对象方法
        return method.invoke(origin, arg);
    }
}
