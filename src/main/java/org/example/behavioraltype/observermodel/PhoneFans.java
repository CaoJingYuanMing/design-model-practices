package org.example.behavioraltype.observermodel;

/**
 * 果粉购买者
 */
public class PhoneFans extends Buyer {
    /**
     * 构造果粉
     * 使用父类进行构造
     */
    public PhoneFans(String name, Shop shop) {
        super(name, shop);
    }

    @Override
    public void inform() {
        String product = shop.getProduct();
        if (product.contains("水果手机")) {//此买家只买水果牌手机
            System.out.print(name);
            System.out.println("果粉购买者购买：" + product);
        }
    }
}
