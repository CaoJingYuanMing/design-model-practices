package org.example.behavioraltype.commandmodel.implmodel;

import org.example.behavioraltype.commandmodel.interfacepage.Command;
import org.example.behavioraltype.commandmodel.interfacepage.Device;

public class ChannelCommand implements Command {
    private Device device;

    public ChannelCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.channelUp();
    }

    @Override
    public void unexe() {
        device.channelDown();
    }
}
