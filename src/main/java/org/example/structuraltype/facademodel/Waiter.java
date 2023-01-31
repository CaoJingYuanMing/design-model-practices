package org.example.structuraltype.facademodel;

/**
 * 服务员
 */
public class Waiter {
    public void order() {
        System.out.println("招待客人入座位");
    }

    public void serve() {
        System.out.println("厨师准备上菜");
    }
}
