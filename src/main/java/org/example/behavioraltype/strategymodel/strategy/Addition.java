package org.example.behavioraltype.strategymodel.strategy;

/**
 * 加法实现类
 */
public class Addition implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
