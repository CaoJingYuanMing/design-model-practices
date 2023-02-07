package org.example.behavioraltype.strategymodel;

import org.example.behavioraltype.strategymodel.strategy.Strategy;

/**
 * 计算器
 */
public class Calculator {
    private Strategy strategy;

    // 接入策略算法
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // 获取计算方法(策略模式)的最后接口
    public int getResult(int a, int b) {
        // 返回具体策略的结果
        return this.strategy.calculate(a, b);
    }
}
