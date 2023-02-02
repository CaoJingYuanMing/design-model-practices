package org.example.behavioraltype.interpretermodel;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        /**
         * 解释器
         *
         * 终极与非终极表达式的区别、表达式的多态性、以及表达式的自包含关系结构。
         * 可以考虑拆解元素
         */

        /*
         * BEGIN             // 脚本开始
         * MOVE 500,600;     // 鼠标移动到坐标(500, 600)
         *  BEGIN LOOP 5     // 开始循环5次
         *      LEFT_CLICK;  // 循环体内单击左键
         *      DELAY 1;     // 每次延时1秒
         *  END;             // 循环体结束
         * RIGHT_DOWN;       // 按下右键
         * DELAY 7200;       // 延时2小时
         * END;              // 脚本结束
         */

        // 构造指令集语义树，实际情况会交给语法解析器（Evaluator or Parser）
        Expression expression = new Sequence(Arrays.asList(new Move(500, 60),
                new Repetition(5, new Sequence(Arrays.asList(new LeftClick(), new Delay(1)))),
                new RightDown(), new Delay(2*60*60)));

        expression.interpret();
    }
}
