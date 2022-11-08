package org.example.buildermodelparctice.builder;

import org.example.buildermodelparctice.Phone;

/**
 * 手机内核制造商
 */
public class PhoneKernelBuilder implements KernelBuilder {
    private Phone phone;

    public PhoneKernelBuilder(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void createChip() {
        System.out.println("手机内核制造商开始制造芯片");
        phone.setChip("手机内核制造商的芯片");
    }
    
    @Override
    public void createIntegratedCircuit() {
        System.out.println("手机内核制造商开始制造集成电路");
        phone.setIntegratedCircuit("手机内核制造商的集成电路");
    }
}
