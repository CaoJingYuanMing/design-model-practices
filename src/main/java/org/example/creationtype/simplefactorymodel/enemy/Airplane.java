package org.example.creationtype.simplefactorymodel.enemy;

public class Airplane extends Enemy {
    public Airplane(int x, int y) {
        super(x, y);
    }

    public void show() {
        System.out.println("飞机出现在坐标, x : " + x + ", y : " + y );
        System.out.println("-------------飞机开始攻击玩家----------");
    }
}
