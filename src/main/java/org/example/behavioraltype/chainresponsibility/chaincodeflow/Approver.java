package org.example.behavioraltype.chainresponsibility.chaincodeflow;

/**
 * 抽象类 审核人
 */
public abstract class Approver {
    protected String name;
    protected Approver nextApprover;

    // 构造方法
    public Approver(String name) {
        this.name = name;
    }

    /**
     * 设置下一个审批人
     * @param nextApprover 下一个审批人
     * @return 下一个审批人
     */
    protected Approver setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
        return this.nextApprover;// 返回下个审批人
    }

    public abstract void approve(int amount);// 抽象审批方法由具体审批人子类实现
}

