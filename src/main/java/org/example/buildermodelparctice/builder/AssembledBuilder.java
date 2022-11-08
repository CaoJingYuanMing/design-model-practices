package org.example.buildermodelparctice.builder;

import org.example.buildermodelparctice.Phone;

/**
 * 组装手机厂商
 */
public interface AssembledBuilder {
    // 组装手机
    void assemblePhone();

    // 产出手机
    Phone getPhone();
}
