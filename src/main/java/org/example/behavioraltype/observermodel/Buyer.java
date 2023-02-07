package org.example.behavioraltype.observermodel;


/**
 * 买家类代码
 * (充当观察者)
 */
public abstract class Buyer {
    // 买家姓名
    protected String name;
    // 商店引用
    protected Shop shop;

    public Buyer(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
    }

    /*
    // 在购买行为中,使用shop对象的获取商品的方法
    public void buy() {
        // 买家购买商品
        System.out.print(name + "购买：");
        System.out.println(shop.getProduct());
    }
    */

    /**
     * 由不同买家定义通知方式
     */
    public abstract void inform();
}
