package org.example.behavioraltype.statemodel.state;

import org.example.behavioraltype.statemodel.Switcher;

/**
 * 状态接口
 * （开和关状态）
 */
public interface State {
    void switchOn(Switcher switcher);//开
    void switchOff(Switcher switcher);//关
}
