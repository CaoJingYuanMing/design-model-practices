package org.example.factorymode;

import org.example.factorymode.factory.SimpleFactory;

import java.util.Random;

public class Player {
    public static void main(String[] args) {
        int screenWidth = 100;//屏幕宽度
        System.out.println("===============游戏开始==============");
        Random random = new Random();//准备随机数

        // 简单工厂模式 生产合适的飞机和坦克类型
        // 把实例化统一交给工厂完成
        SimpleFactory simpleFactory = new SimpleFactory(screenWidth);
        simpleFactory.create("Airplane").show();
        simpleFactory.create("Tank").show();

        // 简单地创建实例，造成重复代码
//        int x = random.nextInt(screenWidth);//生成敌机横坐标随机数
//        Enemy airplan = new Airplane(x, 0);//实例化飞机
//        airplan.show();//显示飞机
//
//        x = random.nextInt(screenWidth);//坦克同上
//        Enemy tank = new Tank(x, 0);
//        tank.show();
    }
}
