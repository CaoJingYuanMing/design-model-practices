package org.example.factorymode.factory;

import org.example.factorymode.enemy.Boss;
import org.example.factorymode.enemy.Enemy;

/**
 * 敌霸工厂类
 */
public class BossFactory implements Factory{
    @Override
    public Enemy create(int screenWidth) {
        return new Boss(screenWidth / 2, 0);
    }
}
