package org.example.structuraltype.decoratormodel;

/**
 * 装修模式(可以动态地给对象增加一些职责)
 */
public class Client {
    public static void main(String[] args) {
        new FoundationMakeup(new Lipstick(new Girl())).show();
    }
}
