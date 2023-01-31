package org.example.structuraltype.compositemodel;

/**
 * 抽象出来的结点类（部分）
 */
public abstract class Node {
    // 结点名
    protected String name;

    // 构造结点，传入结点名字
    public Node(String name) {
        this.name = name;
    }

    // 增加后续结点
    protected abstract void add(Node child);

    /**
     * 打印结点
     * @param space 空格
     */
    protected void ls(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print("　");//先循环输出n个空格；
        }
        System.out.println(name);//然后再打印自己的名字。
    }
}
