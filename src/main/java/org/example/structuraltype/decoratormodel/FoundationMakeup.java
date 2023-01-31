package org.example.structuraltype.decoratormodel;

/**
 * 打底类（面扑）
 */
public class FoundationMakeup extends Decorator{

    public FoundationMakeup(ShowAble showAble) {
        // 调用化妆品父类进行注入
        super(showAble);
    }

    public void show() {
        System.out.println("打粉底(");
        showAble.show();
        System.out.println(")");
    }
}
