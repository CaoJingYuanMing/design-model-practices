package org.example.classloadorder;

public class Cat extends Animals {
    static {
        System.out.println("==========子类静态代码块=========");
    }

    {
        System.out.println("===========子类构造代码块=================");
    }

    public Cat () {
        System.out.println("============子类构造代码===========================");
    }

    public void run() {
        System.out.println("==============猫🐱会跑(子类普通代码块)====================");
    }
}
