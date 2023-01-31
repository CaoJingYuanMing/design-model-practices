package org.example.structuraltype.bridgemodel.pen;

import org.example.structuraltype.bridgemodel.Ruler;

/**
 * 黑笔实现类
 */
public class BlackPen extends Pen{
    // 建立桥梁连接
    public BlackPen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("黑");
        ruler.regularize();
    }
}
