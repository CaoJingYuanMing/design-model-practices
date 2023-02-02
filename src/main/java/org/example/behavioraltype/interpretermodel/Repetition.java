package org.example.behavioraltype.interpretermodel;

/**
 * 循环表达式
 */
public class Repetition implements Expression {
    private int loopCount; // 循环次数
    private Expression expression;// 循环体表达式

    public Repetition(int loopCount, Expression expression) {
        this.loopCount = loopCount;
        this.expression = expression;
    }

    @Override
    public void interpret() {
        System.out.println("=======开始循环 " + loopCount + " 次=======");
        while (loopCount > 0) {
            expression.interpret();
            loopCount--;
        }
        System.out.println("=======循环结束=====");
    }
}
