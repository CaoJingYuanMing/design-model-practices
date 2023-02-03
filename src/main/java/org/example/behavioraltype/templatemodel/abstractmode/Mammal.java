package org.example.behavioraltype.templatemodel.abstractmode;

/**
 * 抽象类哺乳动物类
 */
public abstract class Mammal {
    // 既然是哺乳动物当然会喂奶了，但这里约束为只能母的喂奶
    protected final void feedMilk(String gender) {
        if ("female".equals(gender)) {//如果是母的……
            System.out.println("喂奶");
        } else {
            // 如果是公的……或者可以抛个异常出去。
            System.out.println("公的不会");
        }
    }

    // 抽象方法，每个哺乳类动物移动的方法都不一样
    public abstract void move();
}
