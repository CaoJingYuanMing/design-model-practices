package org.example.behavioraltype.commandmodel;

import org.example.behavioraltype.commandmodel.implmodel.*;
import org.example.behavioraltype.commandmodel.interfacepage.Device;

public class Client {
    public static void main(String[] args) {
        /*
         * 最简单的工作流程操作
         */
//        System.out.println("===客户端用【电线】 直接操作灯泡===");
//        Bulb bulb = new Bulb();
//        bulb.on();
//        bulb.off();

        /*
            策略模式：
            打印输出：
            ===客户端用【电线】直接操作灯泡===
            通电，灯亮。
            断电，灯灭。
        */
//        System.out.println("===客户端用【开关】操作电器===");
//        Switcher switcher = new Switcher();
//
//        System.out.println("=====接入灯泡💡====");
//        switcher.setSwitchable(new Bulb());//灯泡接入开关。
//        switcher.buttonOnClick();
//        switcher.buttonOffClick();
//
//        System.out.println("=====接入风扇====");
//        switcher.setSwitchable(new Fan());//风扇接入开关。
//        switcher.buttonOnClick();
//        switcher.buttonOffClick();

        System.out.println("===客户端用【可编程式遥控器】操作电器===");
        Device tv = new TV();
        Device radio = new Radio();

        // 遥控器
        Controller controller = new Controller();

        //绑定【电视机】的【命令】到【控制器按键】
        controller.bindOKCommand(new SwitchCommand(tv));
        controller.bindVerticalCommand(new ChannelCommand(tv));//上下调台
        controller.bindHorizontalCommand(new VolumeCommand(tv));//左右调音

        controller.buttonOKHold();
        controller.buttonUpClick();
        controller.buttonUpClick();
        controller.buttonDownClick();
        controller.buttonRightClick();

        /*
           打印输出：
           ===客户端用【可编程式遥控器】操作电器===
           长按OK按键……电视机启动
           单击↑按键……电视机频道+
           单击↓按键……电视机频道-
           单击→按键……电视机音量+
        */

        // 绑定【收音机】的【命令】到【控制器按键】
        controller.bindOKCommand(new SwitchCommand(radio));
        controller.bindVerticalCommand(new VolumeCommand(radio));//上下调音
        controller.bindHorizontalCommand(new ChannelCommand(radio));//左右调台

        controller.buttonOKHold();
        controller.buttonUpClick();
        controller.buttonUpClick();
        controller.buttonRightClick();
        controller.buttonDownClick();

        /*打印输出：
            长按OK按键……收音机启动
            单击↑按键……收音机音量+
            单击↑按键……收音机音量+
            单击→按键……收音机调频+
            单击↓按键……收音机音量-
        */
    }
}
