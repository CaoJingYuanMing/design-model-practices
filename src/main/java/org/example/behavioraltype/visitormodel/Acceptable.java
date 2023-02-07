package org.example.behavioraltype.visitormodel;

/**
 * 接待者接口
 * (双派发中间接口)
 */
public interface Acceptable {
    // 主动接受受访者
    void accept(Visitor visitor);
}
