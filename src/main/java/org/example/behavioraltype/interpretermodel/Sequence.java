package org.example.behavioraltype.interpretermodel;

import java.util.List;

/**
 * 指令序列集合
 */
public class Sequence implements Expression{
    // 指令集序列
    private List<Expression> expressions;

    public Sequence(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public void interpret() {
        // 循环解析每个指令
        expressions.forEach(exp -> exp.interpret());
    }
}
