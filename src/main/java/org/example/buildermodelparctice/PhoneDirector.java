package org.example.buildermodelparctice;

import org.example.buildermodelparctice.builder.AppearanceBuilder;
import org.example.buildermodelparctice.builder.AssembledBuilder;
import org.example.buildermodelparctice.builder.KernelBuilder;

public class PhoneDirector {
    private AppearanceBuilder appearanceBuilder;
    private AssembledBuilder assembledBuilder;
    private KernelBuilder kernelBuilder;

    public PhoneDirector(AppearanceBuilder appearanceBuilder, AssembledBuilder assembledBuilder, KernelBuilder kernelBuilder) {
        this.appearanceBuilder = appearanceBuilder;
        this.assembledBuilder = assembledBuilder;
        this.kernelBuilder = kernelBuilder;
    }

    /**
     * 指导手机生产
     * @return 手机产品
     */
    public Phone direct () {
        // 生产手机内核
        kernelBuilder.createChip();
        kernelBuilder.createIntegratedCircuit();

        // 生产手机外核
        appearanceBuilder.createCamera();
        appearanceBuilder.createScreen();

        // 组装手机
        assembledBuilder.assemblePhone();

        return assembledBuilder.getPhone();
    }
}
