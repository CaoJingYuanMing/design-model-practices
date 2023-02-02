package org.example.behavioraltype.interpretermodel;

/**
 * 移动表达式实现类
 */
public class Move implements Expression {
    // 鼠标位置坐标
    private int x, y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void interpret() {
        System.out.println("移动鼠标：【" + x + "," + y + "】");
    }
}
