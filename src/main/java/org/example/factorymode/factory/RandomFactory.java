package org.example.factorymode.factory;

import org.example.factorymode.enemy.Airplane;
import org.example.factorymode.enemy.Enemy;
import org.example.factorymode.enemy.Tank;

import java.util.Random;

/**
 * 随机工厂类
 */
public class RandomFactory implements Factory {
    private Random random = new Random();

    @Override
    public Enemy create(int screenWidth) {
        Enemy enemy = null;
        if (random.nextBoolean()) {
            enemy = new Airplane(random.nextInt(screenWidth), 0);//实例化飞机
        } else {
            enemy = new Tank(random.nextInt(screenWidth), 0);//实例化坦克
        }
        return enemy;
    }
}
