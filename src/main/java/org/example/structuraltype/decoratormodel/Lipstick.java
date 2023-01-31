package org.example.structuraltype.decoratormodel;

public class Lipstick extends Decorator{

    // 调用父类方法进行注入
    public Lipstick(ShowAble showAble) {
        super(showAble);
    }

    @Override
    public void show() {
        System.out.println("涂抹口红 (");
        showAble.show();
        System.out.println(")");
    }
}
