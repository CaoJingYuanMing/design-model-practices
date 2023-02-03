package org.example.behavioraltype.chainresponsibility.normalflow;

public class Client {
    public static void main(String[] args) {
        int amount = 10000;//出差花费10000元
        // 先找员工张飞审批
        Staff staff = new Staff("张飞");
        if (!staff.approve(amount)) {
            //被拒，找关二爷问问。
            Manager manager = new Manager("关羽");
            if (!manager.approve(amount)) {
                //还是被拒，只能找老大了。
                CEO ceo = new CEO("刘备");
                ceo.approve(amount);
            }
        }
    }
}
