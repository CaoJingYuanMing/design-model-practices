package org.example.structuraltype.facademodel;

public class Client {
    public static void main(String[] args) {
        /**
         * 使用facade模式定义子系统中每层的入口点。
         * 如果子系统之间是相互依赖的，
         * 你可以让它们仅通过facade进行通讯，
         * 从而简化了它们之间的依赖关系。
         */
        Facade facade = new Facade();
        facade.provideService();
    }
}
