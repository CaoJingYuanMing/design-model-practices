package org.example.behavioraltype.interpretermodel;

/**
 * 按下鼠标左键
 */
public class LeftDown implements Expression{
    @Override
    public void interpret() {
        System.out.println("按下鼠标：左键");
    }
}
