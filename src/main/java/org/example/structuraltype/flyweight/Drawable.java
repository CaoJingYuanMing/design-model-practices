package org.example.structuraltype.flyweight;

/**
 * 绘制坐标
 */
public interface Drawable {
    // 绘制方法，接收地图坐标。
    void draw(int x, int y);
}
