package org.example.structuraltype.compositemodel;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 */
public class Folder extends Node {
    // 文件夹可以包含子节点（文件夹或者文件）。
    private List<Node> childrenNodes = new ArrayList<>(23);

    // 调用父类“节点”的构造方法命名。
    public Folder(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        childrenNodes.add(child);
    }

    @Override
    public void ls(int space) {
        //调用父类共通的ls方法列出自己的名字。
        super.ls(space);
        //之后列出的子节点前，空格数要增加一个了。
        space++;
        for (Node node : childrenNodes) {
            //调用子节点的ls方法。
            node.ls(space);
        }
    }

}
