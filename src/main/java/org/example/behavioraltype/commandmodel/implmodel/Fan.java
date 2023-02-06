package org.example.behavioraltype.commandmodel.implmodel;

import org.example.behavioraltype.commandmodel.interfacepage.Switchable;

/**
 * 风扇
 * <p>
 * 通电转, 断电停
 */
public class Fan implements Switchable {
    @Override
    public void on() {
        System.out.println("风扇, 通电转");
    }

    @Override
    public void off() {
        System.out.println("风扇, 断电停");
    }
}
