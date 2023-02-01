package org.example.structuraltype.proxy;

import org.example.structuraltype.proxy.dynamicproxy.Intranet;
import org.example.structuraltype.proxy.dynamicproxy.KeywordFilter;
import org.example.structuraltype.proxy.dynamicproxy.Switch;
import org.example.structuraltype.proxy.normalproxy.Internet;
import org.example.structuraltype.proxy.normalproxy.RouterProxy;
import org.example.structuraltype.proxy.testdynamicproxy.QualificationReview;
import org.example.structuraltype.proxy.testdynamicproxy.SecuritiesCompany;
import org.example.structuraltype.proxy.testdynamicproxy.StockMarket;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {

        /**
         * 静态代理模式
         */

        /**
         * 正常的连接链路是 客户端 --> 路由器 --> 调制解调器 --> 互联网
         * 路由器充当代理功能，使得客户端可以直接连接路由器，由路由器调用猫接口进行连接上网
         * 路由器除了可以代理网络接入外，还可以通过重写方法，实现对参数过滤等自定义功能
         */
        // 实例化的是代理
        Internet proxy = new RouterProxy();
        proxy.access("http://www.电影.com");
        proxy.access("http://www.游戏.com");
        proxy.access("ftp://www.学习.com/java");
        proxy.access("http://www.工作.com");

        /**
         * 动态代理（详细可以参考AOP）
         *
         * 更详细的动态代理用法，参考博文：https://blog.csdn.net/qq_44715943/article/details/120785432
         */
        //访问内网（局域网），生成交换机代理。
        Intranet intranet = (Intranet) Proxy.newProxyInstance(
                Switch.class.getClassLoader(),
                Switch.class.getInterfaces(),
                new KeywordFilter(new Switch()));
        intranet.fileAccess("\\\\192.68.1.2\\共享\\电影\\IronHuman.mp4");
        intranet.fileAccess("\\\\192.68.1.2\\共享\\游戏\\Hero.exe");
        intranet.fileAccess("\\\\192.68.1.4\\shared\\Java学习资料.zip");
        intranet.fileAccess("\\\\192.68.1.6\\Java知音\\设计模式是什么鬼.doc");


        /**
         * 自建动态代理测试
         * 链路: 散户 --> 基金经理 --> 证券公司 --> 股市
         */
        StockMarket stockMarket = (StockMarket) Proxy.newProxyInstance(
                SecuritiesCompany.class.getClassLoader(),
                SecuritiesCompany.class.getInterfaces(),
                new QualificationReview(new SecuritiesCompany()));
        stockMarket.purchaseShares("白酒No0001", 1200, 3.5);
        stockMarket.purchaseShares("电影No0001", 20000, 3.5);
        stockMarket.purchaseShares("新能源No0008", 150, 5);

    }
}
