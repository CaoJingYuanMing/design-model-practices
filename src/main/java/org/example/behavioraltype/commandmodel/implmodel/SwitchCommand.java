package org.example.behavioraltype.commandmodel.implmodel;

import org.example.behavioraltype.commandmodel.interfacepage.Command;
import org.example.behavioraltype.commandmodel.interfacepage.Device;

public class SwitchCommand implements Command {
    // 此处持有高级设备接口
    private Device device;

    public SwitchCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        // 执行命令调用开机操作
        device.on();
    }

    @Override
    public void unexe() {
        // 反执行命令调用关机操作
        device.off();
    }
}
