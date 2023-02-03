package org.example.behavioraltype.chainresponsibility.chaincodeflow;

public class Client {
    public static void main(String[] args) {
        Approver flightJohn = new Staff("张飞");
        // 链式编程
        // 张飞 --> 关羽 --> 刘备
        flightJohn.setNextApprover(new Manager("关羽")).setNextApprover(new CEO("刘备"));
        flightJohn.approve(9000);
    }
}
