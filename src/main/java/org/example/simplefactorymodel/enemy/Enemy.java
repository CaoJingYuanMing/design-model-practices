package org.example.simplefactorymodel.enemy;

/**
 * 敌人抽象类
 */
public abstract class Enemy {
    //敌人的坐标，会被子类继承。
    protected int x;
    protected int y;

    //初始化坐标
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //抽象方法，在地图上绘制。
    public abstract void show();
}
