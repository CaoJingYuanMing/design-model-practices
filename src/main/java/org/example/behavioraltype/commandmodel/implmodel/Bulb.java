package org.example.behavioraltype.commandmodel.implmodel;

import org.example.behavioraltype.commandmodel.interfacepage.Switchable;

/**
 * 灯泡实现类
 *
 */
public class Bulb implements Switchable {
    @Override
    public void on() {
        System.out.println("通电，亮灯");
    }

    @Override
    public void off() {
        System.out.println("断电，灯灭");
    }
}
