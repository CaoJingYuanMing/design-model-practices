package org.example.singlecasemodel;

/**
 * 懒汉模式 Lazy load 优化点
 */
public class LazyGod2 {

    // TODO: 对锁有疑问？？？？
    private volatile static LazyGod2 lazyGod2;

    // 构造方法私有化
    private LazyGod2() {
    }

    // 庙是开放的不用排队进入
    public static LazyGod2 getInstance() {
        // 如果头柱香未产生，这批抢香人进入堂内排队
        if (lazyGod2 == null) {
            synchronized (LazyGod2.class) {
                // 只有头香造了神，其他抢香的白排队了
                if (lazyGod2 == null) {
                    lazyGod2 = new LazyGod2();
                }
            }
        }
        //此处头柱香产生后不必再排队
        return lazyGod2;
    }
}
