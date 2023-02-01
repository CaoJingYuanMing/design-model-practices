package org.example.structuraltype.proxy.testdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 购入资格审核
 * （动态代理）
 */
public class QualificationReview implements InvocationHandler {
    public List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");
    private Object stockMarket;

    public QualificationReview (Object origin) {
        this.stockMarket = origin;
        System.out.println("开始审核购买资格");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String stockName  = args[0].toString();
        for (String blackName : blackList) {
            if (stockName.contains(blackName)) {
                System.out.println("您购买的股票代码为: " + stockName + ", 不支持交易, 请重新申购");
            }
        }

        int share = Integer.valueOf(args[1].toString());
        double price = Double.valueOf(args[2].toString());
        double totalMoney = share * price;
        System.out.println("您的申购金额为 :" + totalMoney);

        if (totalMoney < 1000) {
            System.out.println("申购金额不足1000，审核不通过");
        }

        return method.invoke(stockMarket, args);
    }
}
