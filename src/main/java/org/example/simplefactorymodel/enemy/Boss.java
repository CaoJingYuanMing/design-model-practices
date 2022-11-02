package org.example.simplefactorymodel.enemy;

/**
 * 敌霸
 */
public class Boss extends Enemy{
    public Boss(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("敌霸出现在坐标 x : "+ x + ", y : " + y);
        System.out.println("----------敌霸开始攻击玩家-------");
    }
}
