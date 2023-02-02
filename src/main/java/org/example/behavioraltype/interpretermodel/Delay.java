package org.example.behavioraltype.interpretermodel;

/**
 * 系统延时表达
 */
public class Delay implements Expression {
    // 延时秒数
    private int seconds;

    public Delay(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void interpret() {
        System.out.println("系统延迟：" + seconds + "秒钟");
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
