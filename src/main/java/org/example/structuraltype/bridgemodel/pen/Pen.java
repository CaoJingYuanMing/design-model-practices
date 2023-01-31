package org.example.structuraltype.bridgemodel.pen;

import org.example.structuraltype.bridgemodel.Ruler;

/**
 * 笔的抽象类
 */
public abstract class Pen {
    // 引用尺子
    protected Ruler ruler;

    // 注入赤字
    public Pen (Ruler ruler) {
        this.ruler = ruler;
    }

    // 抽象具体画笔绘制的方法
    public abstract void draw();
}
