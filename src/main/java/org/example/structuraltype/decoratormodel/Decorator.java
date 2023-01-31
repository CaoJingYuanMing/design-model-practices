package org.example.structuraltype.decoratormodel;

/**
 * 化妆品粉饰器
 */
public abstract class Decorator implements ShowAble{
    ShowAble showAble;

    // 构造的时候注入这个装饰器
    public Decorator(ShowAble showAble) {
        this.showAble = showAble;
    }

    @Override
    public void show() {
        System.out.println("粉饰 (");// 化妆品粉饰
        showAble.show();
        System.out.print(" )");//粉饰打完收工
    }
}
