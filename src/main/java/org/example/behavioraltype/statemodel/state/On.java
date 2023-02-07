package org.example.behavioraltype.statemodel.state;

import org.example.behavioraltype.statemodel.Switcher;

/**
 * 开
 */
public class On implements State {
    @Override
    public void switchOn(Switcher switcher) {
        System.out.println("WARN!!!通电状态无需再开");
        return;
    }

    @Override
    public void switchOff(Switcher switcher) {
        switcher.setState(new Off());
        System.out.println("OK...灯灭");
    }
}
