package org.example.behavioraltype.chainresponsibility.normalflow;

/**
 * CEO可以审批小于1万的经费报销
 */
public class CEO {
    private String name;

    public CEO(String name) {
        this.name = name;
    }

    public boolean approve(int amount) {
        if (amount <= 10000) {
            System.out.println("审批通过。【CEO：" + name + "】");
            return true;
        } else {
            System.out.println("驳回申请。【CEO：" + name + "】");
            return false;
        }
    }
}
