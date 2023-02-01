package org.example.structuraltype.proxy.dynamicproxy;

/**
 * 交换机实现局域网访问互联网
 */
public class Switch implements Intranet {
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网：" + path);
    }
}
