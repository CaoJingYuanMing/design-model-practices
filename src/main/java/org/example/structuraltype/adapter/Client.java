package org.example.structuraltype.adapter;

/**
 * 适配器的类型  详解文章: https://blog.csdn.net/qq_46111881/article/details/122849111
 *
 * 1. 对象适配器 以组合的方式出现(需要适配的类，放在适配器的属性中)
 * 2. 类适配器(类适配器需要)
 * 3. 接口适配器模式
 */

public class Client {
    public static void main(String[] args) {

        // 电视使用双孔插头
        TV tv = new TV();
        tv.electrify(12, 8);

        DualPin dualPin = new DualPin() {
            @Override
            public void electrify(int live, int nul) {
                System.out.println("火线 : " + live );
                System.out.println("零线 : " + nul );
            }
        };

        //
        // 现在只有一个三孔插头 电视想用
        Adapter adapter = new Adapter(dualPin);

        // 将三孔转成双孔
        System.out.println("将三孔插头转成双孔插头");
        adapter.electrify(12, 18, 8);

        ClassA classA = new ClassA() {
            @Override
            public void func1() {
                System.out.println("classA 重写 func1----");
            }
        };
        classA.func1();
    }
}
