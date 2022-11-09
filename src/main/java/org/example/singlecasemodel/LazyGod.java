package org.example.singlecasemodel;

/**
 * 懒汉模式 Lazy load
 */
public class LazyGod {

    // 与痴汉模式相比，不需要新建
    private static LazyGod lazyGod;

    // 构造方式私有化 (限制只能自己构造自己)
    private LazyGod() {}

    // 需要解决并发的问题
    // 方法一： 直接加锁在整个方法上
    public static synchronized LazyGod getInstance() {
        // 如果之前造过神，就不新造神
        if (null == lazyGod) {
            return new LazyGod();
        }

        return lazyGod;
    }
}
