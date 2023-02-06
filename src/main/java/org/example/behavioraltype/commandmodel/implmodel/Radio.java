package org.example.behavioraltype.commandmodel.implmodel;

import org.example.behavioraltype.commandmodel.interfacepage.Device;

public class Radio implements Device {
    @Override
    public void channelUp() {
        System.out.println("收音机调频+");
    }

    @Override
    public void channelDown() {
        System.out.println("收音机调频-");
    }

    @Override
    public void volumeUp() {
        System.out.println("收音机音量+");
    }

    @Override
    public void volumeDown() {
        System.out.println("收音机音量-");
    }

    @Override
    public void on() {
        System.out.println("收音机启动");
    }

    @Override
    public void off() {
        System.out.println("收音机关闭");
    }
}
