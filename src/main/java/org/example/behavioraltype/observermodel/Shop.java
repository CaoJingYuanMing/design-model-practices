package org.example.behavioraltype.observermodel;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品类
 */
public class Shop {
    // 商品
    private String product;
    // 持有买家的引用(方便通知买家)
    private List<Buyer> buyers;

    // 初始商店无货
    public Shop() {
        this.product = "无商品";
        this.buyers = new ArrayList<>();
    }

    // 为了主动通知买家，买家得来店里注册。
    public void register(Buyer buyer) {
        this.buyers.add(buyer);
    }

    // 通知所有注册买家
    public void notifyBuyers() {
        buyers.stream().forEach(b -> b.inform());
    }

    // 商店出货
    public String getProduct() {
        return product;
    }

    // 商店进货
    public void setProduct(String product) {
        this.product = product;
    }
}
