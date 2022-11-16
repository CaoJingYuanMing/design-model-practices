package org.example.creationtype.buildermodelparctice;

public class Phone {
    // 芯片
    private String chip;
    // 摄像头
    private String camera;
    // 屏幕
    private String screen;
    // 集成电路
    private String integratedCircuit;

    @Override
    public String toString() {
        return "Phone{" +
                "chip='" + chip + '\'' +
                ", camera='" + camera + '\'' +
                ", screen='" + screen + '\'' +
                ", integratedCircuit='" + integratedCircuit + '\'' +
                '}';
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getIntegratedCircuit() {
        return integratedCircuit;
    }

    public void setIntegratedCircuit(String integratedCircuit) {
        this.integratedCircuit = integratedCircuit;
    }
}
