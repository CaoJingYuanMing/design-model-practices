package org.example.behavioraltype.templatemodel.templatemodetest;

/**
 * 抽象类 PM
 */
public abstract class PM {
    protected abstract void analyze();// 需求分析
    protected abstract void design();// 设计
    protected abstract void develop();// 开发
    protected abstract boolean test();// 测试
    protected abstract void release();// 发布

    /**
     * 规范开发流程:
     *
     * 由于加了final关键字，
     * 因此后续子类只能使用父类的流程
     * 自己无法定义新流程
     * 但是每个子类实现，可以重写固定流程中的具体方法
     */
    protected final void kickoff() {
        analyze();
        design();
        // 如果测试失败, 则继续开发改bug
        do {
            develop();
        } while (!test());
        develop();
        test();
        release();
    }
}
