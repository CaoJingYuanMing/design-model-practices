package org.example.structuraltype.adapter;

/**
 * 对象适配器
 * 适配器(转换三孔插头为双孔插头)
 */
public class Adapter implements TriplePin {
    // 双孔插头
    private DualPin dualPinDevice;
    //创建适配器的时候，需要把双插设备接入进来
    public Adapter(DualPin dualPinDevice) {
        this.dualPinDevice = dualPinDevice;
    }

    @Override
    public void electrify(int live, int nul, int earth) {
        dualPinDevice.electrify(live, earth);
    }
}
