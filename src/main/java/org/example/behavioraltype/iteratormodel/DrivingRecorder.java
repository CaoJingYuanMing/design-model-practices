package org.example.behavioraltype.iteratormodel;

import java.util.Iterator;

/**
 * 行车记录仪
 */
public class DrivingRecorder {
    private int index = -1;// 当前记录位置
    private String[] records = new String[10];// 假设只能记录10条视频

    /**
     * 记录增加的时候
     *
     * @param record 记录值
     */
    public void append(String record) {
        if (index == 9) {
            // 循环覆盖
            index = 0;
        } else {
            index++;
        }
        records[index] = record;
    }

    /**
     * 展示方法
     */
    public void display() {
        // 循环数组并显示所有10条记录
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + records[i]);
        }
    }

    /**
     * 展示顺序
     */
    public void displayInOrder() {
        // 按顺序从新到旧显示10条记录
        for (int i = index, loopCount = 0; loopCount < 10; i = i == 0 ? i = 9 : i - 1, loopCount++) {
            System.out.println(records[i]);
        }
    }

    /**
     * 接口
     * @return
     */
    public Iterator<String> iterator() {
        return new Itr();
    }

    /**
     * 自定义迭代器 Itr
     */
    private class Itr implements Iterator<String> {
        int cursor = index; // 迭代器游标，不染指原始游标。
        int loopCount = 0;

        @Override
        public boolean hasNext() {
            return loopCount < 10;
        }

        @Override
        public String next() {
            int i = cursor;// 记录即将返回的游标位置

            // 如果游标到达末尾处，则从头开始♻️
            if (cursor == 0) {
                cursor = 9;
            } else {
                cursor--;
            }

            // 循环次数自增1
            loopCount++;
            return records[i];
        }
    }
}
