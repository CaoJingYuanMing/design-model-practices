package org.example.behavioraltype.statemodel;

/**
 * 状态模型
 *
 * 一个状态属性如果有多个值，可以提取接口类，实现方法的解耦
 */
public class Client {
    public static void main(String[] args) {
        Switcher s = new Switcher();
        s.switchOff();//WARN!!!断电状态无需再关
        s.switchOn();//OK...灯亮
        s.switchOff();//OK...灯灭
        s.switchOn();//OK...灯亮
        s.switchOn();//WARN!!!通电状态无需再开
    }
}
