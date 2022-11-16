package org.example.creationtype.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Enemy> enemyList = new ArrayList<>();

//        for (int i = 0; i < 50; i++) {
//            // 此时构造方法被调用50次，极大浪费CPU的资源
//            enemyList.add(new Enemy(new Random().nextInt()));
//        }

        EnemyPlaneFactory enemyPlaneFactory = new EnemyPlaneFactory();
        // 优化后, 改成原型模式
        for (int i = 0; i < 100; i++) {
            Enemy enemy = enemyPlaneFactory.getInstant(i);
            enemyList.add(enemy);
        }

        for (Enemy enemy : enemyList) {
            System.out.println(enemy);
        }
    }
}
