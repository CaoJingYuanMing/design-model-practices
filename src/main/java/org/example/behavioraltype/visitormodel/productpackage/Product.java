package org.example.behavioraltype.visitormodel.productpackage;

import java.time.LocalDate;

/**
 * 产品抽象类
 */
public abstract class Product {
    protected String name;// 品名
    protected LocalDate producedDate;// 生产日期
    protected float price;// 价格

    public Product(String name, LocalDate producedDate, float price) {
        this.name = name;
        this.producedDate = producedDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(LocalDate producedDate) {
        this.producedDate = producedDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
