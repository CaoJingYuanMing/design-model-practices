package org.example.creationtype.buildermodelparctice.builder;

import org.example.creationtype.buildermodelparctice.Phone;

/**
 * 手机外核制造商
 */
public class PhoneAppearanceBuilder implements AppearanceBuilder {
    private Phone phone;

    public PhoneAppearanceBuilder(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void createCamera() {
        System.out.println("手机外核制造商开始制造摄像头");
        phone.setCamera("手机外核制造商的摄像头");
    }

    @Override
    public void createScreen() {
        System.out.println("手机外核制造商开始制造摄像头");
        phone.setScreen("手机外核制造商的屏幕");

    }
}
