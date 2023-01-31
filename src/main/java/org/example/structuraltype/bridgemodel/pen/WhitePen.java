package org.example.structuraltype.bridgemodel.pen;

import org.example.structuraltype.bridgemodel.Ruler;

/**
 * 白色笔实现类
 */
public class WhitePen extends Pen{
    // 建立桥梁连接
    public WhitePen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("白");
        ruler.regularize();
    }
}
