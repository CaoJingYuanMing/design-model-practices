package org.example.structuraltype.proxy.normalproxy;

import java.util.Arrays;
import java.util.List;

/**
 * 路由器代理类
 */
public class RouterProxy implements Internet {
    // 持有被代理类引用
    private Internet modem;
    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    // 构造的时候注入这个猫功能类，新建接口实现类对象
    public RouterProxy() {
        this.modem = new Modem();
        System.out.println("拨号上网....连接成功");
    }

    @Override
    public void access(String url) {
        /**
         * 对上网功能的过滤
         */
        // 循环黑名单
        for (String keyword : blackList) {
           // 是否包含黑名单字眼
           if (url.contains(keyword)) {
               System.out.println("禁止访问：" + url);
               return;
           }
        }
        // 正常访问互联网
        modem.access(url);
    }
}
