package org.example.behavioraltype.interpretermodel;

public class LeftClick implements Expression {
    private Expression leftDown;
    private Expression leftUp;

    public LeftClick() {
        this.leftDown = new LeftDown();
        this.leftUp = new LeftUp();
    }

    @Override
    public void interpret() {
        // 单击=先按下再松开
        leftDown.interpret();
        leftUp.interpret();
    }
}
