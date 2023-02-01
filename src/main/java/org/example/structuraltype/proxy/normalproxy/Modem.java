package org.example.structuraltype.proxy.normalproxy;

/**
 * 调制解调器
 */
public class Modem implements Internet {
    // 实现互联网访问接口
    @Override
    public void access(String url) {
        System.out.println("正在访问：" + url);
    }
}
