package org.example.behavioraltype.interpretermodel;

/**
 * 松开鼠标左键
 */
public class LeftUp implements Expression{
    @Override
    public void interpret() {
        System.out.println("松开鼠标：左键");
    }
}
