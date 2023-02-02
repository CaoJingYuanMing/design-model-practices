package org.example.behavioraltype.interpretermodel;

/**
 * 按下鼠标右键
 */
public class RightDown implements Expression{
    @Override
    public void interpret() {
        System.out.println("按下鼠标：右键");
    }
}
