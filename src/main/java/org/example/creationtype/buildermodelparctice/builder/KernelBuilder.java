package org.example.creationtype.buildermodelparctice.builder;

/**
 * 手机内核建筑者
 */
public interface KernelBuilder {
    // 创建手机芯片
    void createChip();
    // 创建集成电路
    void createIntegratedCircuit();
}
