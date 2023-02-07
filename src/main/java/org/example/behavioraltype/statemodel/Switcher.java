package org.example.behavioraltype.statemodel;

import org.example.behavioraltype.statemodel.state.Off;
import org.example.behavioraltype.statemodel.state.State;

/**
 * 开关类
 */
public class Switcher {
    /**
     * 引入状态接口
     */
    private State state = new Off();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switchOn() {
        // 这里调用的是当前状态的开方法
        state.switchOn(this);
    }

    public void switchOff() {
        // 这里调用的是当前状态的关方法
        state.switchOff(this);
    }
}
