package org.example.creationtype.prototype;

/**
 * 生产敌军飞机工厂
 */
public class EnemyPlaneFactory {
    private Enemy enemy = new Enemy(200);

    public Enemy getInstant(int x) {
        Enemy clone = enemy.clone();
        clone.setX(x);
        return clone;
    }
}
