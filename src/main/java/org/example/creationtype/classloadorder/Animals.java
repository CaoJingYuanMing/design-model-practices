package org.example.creationtype.classloadorder;

public class Animals {
    static {
        System.out.println("==========父类静态代码块=========");
    }

    {
        System.out.println("===========父类构造代码块=================");
    }

    public Animals () {
        System.out.println("============父类构造代码===========================");
    }

    public void run() {
        System.out.println("==============动物会跑(父类普通代码块)====================");
    }
}
