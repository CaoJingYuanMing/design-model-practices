package org.example.factorymode.enemy;

import org.example.factorymode.enemy.Enemy;

public class Tank extends Enemy {

    public Tank(int x, int y) {
        super(x, y);
    }

    public void show() {
        System.out.println("坦克出现在坐标 x : "+ x + ", y : " + y);
        System.out.println("----------坦克开始攻击玩家-------");
    }
}
