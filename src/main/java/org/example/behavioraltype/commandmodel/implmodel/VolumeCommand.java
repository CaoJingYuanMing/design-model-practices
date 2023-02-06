package org.example.behavioraltype.commandmodel.implmodel;

import org.example.behavioraltype.commandmodel.interfacepage.Command;
import org.example.behavioraltype.commandmodel.interfacepage.Device;

public class VolumeCommand implements Command {
    private Device device;

    public VolumeCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.volumeUp();
    }

    @Override
    public void unexe() {
        device.volumeDown();
    }
}
