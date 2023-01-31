package org.example.structuraltype.flyweight;

public class Client {
    public static void main(String[] args) {
        // 先实例化共享元工厂
        Factory factory = new Factory();

        //以第一行为例
        factory.getDrawable("河流").draw(10, 10);
        factory.getDrawable("河流").draw(10, 20);

        factory.getDrawable("石路").draw(10, 30);

        factory.getDrawable("草坪").draw(10, 40);
        factory.getDrawable("草坪").draw(10, 50);
        factory.getDrawable("草坪").draw(10, 60);
        factory.getDrawable("草坪").draw(10, 70);
        factory.getDrawable("草坪").draw(10, 80);

        factory.getDrawable("房屋").draw(10, 90);
        factory.getDrawable("房屋").draw(10, 150);
        factory.getDrawable("房屋").draw(10, 153);
    }
}
