package org.example.creationtype.simplefactorymodel.factory;

import org.example.creationtype.simplefactorymodel.enemy.Boss;
import org.example.creationtype.simplefactorymodel.enemy.Enemy;

/**
 * 敌霸工厂类
 */
public class BossFactory implements Factory{
    @Override
    public Enemy create(int screenWidth) {
        return new Boss(screenWidth / 2, 0);
    }
}
