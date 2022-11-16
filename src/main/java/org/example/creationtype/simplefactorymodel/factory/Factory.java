package org.example.creationtype.simplefactorymodel.factory;

import org.example.creationtype.simplefactorymodel.enemy.Enemy;

/**
 * 工厂接口
 */
public interface Factory {
    // 创建敌人方法
    Enemy create(int screenWidth);
}
