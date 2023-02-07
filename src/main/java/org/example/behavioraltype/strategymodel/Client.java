package org.example.behavioraltype.strategymodel;

import org.example.behavioraltype.strategymodel.strategy.Addition;
import org.example.behavioraltype.strategymodel.strategy.Subtraction;

/**
 * 策略模式
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new Addition());
        int result = calculator.getResult(10, 5);
        System.out.println("加法结果: " + result);

        calculator.setStrategy(new Subtraction());
        result = calculator.getResult(10, 5);
        System.out.println("减法结果: " + result);
    }
}
