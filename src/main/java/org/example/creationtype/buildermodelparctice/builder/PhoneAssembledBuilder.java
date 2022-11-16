package org.example.creationtype.buildermodelparctice.builder;

import org.example.creationtype.buildermodelparctice.Phone;

/**
 * 组装手机厂商
 */
public class PhoneAssembledBuilder implements AssembledBuilder {
    private Phone phone;

    public PhoneAssembledBuilder(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void assemblePhone() {
        System.out.println("组装手机厂商开始组装手机各个部件");
    }

    @Override
    public Phone getPhone() {
        System.out.println("组装手机产商出厂新手机");
        return this.phone;
    }
}
