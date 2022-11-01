package org.example.factorymode.factory;

import org.example.factorymode.enemy.Enemy;

/**
 * 工厂接口
 */
public interface Factory {
    // 创建敌人方法
    Enemy create(int screenWidth);
}
