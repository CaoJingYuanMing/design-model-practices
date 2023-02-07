package org.example.behavioraltype.visitormodel;

import org.example.behavioraltype.visitormodel.productpackage.Candy;
import org.example.behavioraltype.visitormodel.productpackage.Fruit;
import org.example.behavioraltype.visitormodel.productpackage.Wine;

import java.text.NumberFormat;
import java.time.LocalDate;

/**
 * 不同产品类型有不同
 */
public class DiscountVisitor implements Visitor {

    // 结算日期
    private LocalDate billDate;

    public DiscountVisitor(LocalDate billDate) {
        this.billDate = billDate;
        System.out.println("结算日期：" + billDate);
    }

    @Override
    public void visit(Candy candy) {
        System.out.println("=====糖果【" + candy.getName() + "】打折后价格=====");
        float rate = 0;
        // 计算是否糖果是否过期
        long days = billDate.toEpochDay() - candy.getProducedDate().toEpochDay();
        if (days > 180) {
            System.out.println("超过半年过期糖果，请勿食用！");
        } else {
            rate = 0.9f;
        }

        // 计算糖果折扣
        float discountPrice = candy.getPrice() * rate;
        System.out.println(NumberFormat.getCurrencyInstance().format(discountPrice));
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println("=====水果【" + fruit.getName() + "】打折后价格=====");
        float rate = 0;

        // 计算水果是否过期
        long days = billDate.toEpochDay() - fruit.getProducedDate().toEpochDay();
        if (days > 7) {
            System.out.println("￥0.00元（超过一周过期水果，请勿食用！）");
        } else if (days > 3) {
            rate = 0.5f;
        } else {
            rate = 1;
        }

        // 水果折扣
        float discountPrice = fruit.getPrice() * fruit.getWeight() * rate;
        System.out.println(NumberFormat.getCurrencyInstance().format(discountPrice));
    }

    @Override
    public void visit(Wine wine) {
        System.out.println("=====酒品【" + wine.getName() + "】无折扣价格=====");
        System.out.println(NumberFormat.getCurrencyInstance().format(wine.getPrice()));
    }
}
