package org.example.structuraltype.compositemodel;

/**
 * 文件类
 */
public class File extends Node{
    // 文件名
    public File(String name) {
        super(name);
    }

    // 增加子节点
    @Override
    protected void add(Node child) {
        System.out.println("文件类型不能增加子节点");
    }

    // 打印文件名方法
    @Override
    public void ls(int space) {
        super.ls(space);
    }
}
