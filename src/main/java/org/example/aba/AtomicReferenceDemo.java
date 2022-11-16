package org.example.aba;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicReferenceDemo {
    private static AtomicInteger index = new AtomicInteger(10);
    public static void main(String[] args) {
        new Thread(() -> {
            index.compareAndSet(10, 11);
            index.compareAndSet(11, 10);
            System.out.println(Thread.currentThread().getName() + ": 10 -> 11 -> 10");
            }, "张三").start();

        new Thread(() -> {
            try {
//                TimeUnit.SECONDS.sleep(3);
                boolean isSuccess = index.compareAndSet(10, 12);
                System.out.println(Thread.currentThread().getName() + ":index 的预期是10么，" + isSuccess + ", 设置的新值是：" + index.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "李四").start();
    }
}



