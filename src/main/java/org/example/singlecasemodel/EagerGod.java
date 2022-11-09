package org.example.singlecasemodel;

/**
 * 痴汉模式 Eager load
 *
 * 坏处：第一次执行的时候，需要消耗cpu性能去制造神
 * 好处：省了有神期间，不需要重新造神的cpu损耗
 */
public class EagerGod {
    // 自有的永有的神单例
    private static final EagerGod EAGER_GOD = new EagerGod();

    // 构造方法私有化
    private EagerGod() {}

    // 请神方法公开
    private static EagerGod getInstance() {
        return EAGER_GOD;
    }
}
