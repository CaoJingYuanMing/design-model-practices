package org.example.creationtype.prototype;

/**
 * 敌人类
 */
public class Enemy implements Cloneable{
    //敌人的坐标，会被子类继承。
    protected int x;
    protected int y = 0;

    private static  Enemy enemy = new Enemy(200);

    //初始化坐标
    public Enemy(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //抽象方法，在地图上绘制。
    public void fly() {
        y++;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    // 重写clone方法(需要注意深拷贝和浅拷贝的区别)
    @Override
    protected Enemy clone() {
        try {
            return (Enemy)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Enemy(200);
    }
}
