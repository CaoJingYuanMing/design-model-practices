package org.example.behavioraltype.visitormodel;

import org.example.behavioraltype.visitormodel.productpackage.Candy;
import org.example.behavioraltype.visitormodel.productpackage.Fruit;
import org.example.behavioraltype.visitormodel.productpackage.Wine;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //小黑兔奶糖，生产日期：2018-10-1，原价：￥20.00
        /*
        Candy candy = new Candy("小黑兔奶糖", LocalDate.of(2018, 10, 1), 20.00f);
        Visitor discountVisitor = new DiscountVisitor(LocalDate.of(2019, 1, 1));
        discountVisitor.visit(candy);
         */

        /*
        // 三件商品加入购物车
        List<Product> products = Arrays.asList(
                new Candy("小黑兔奶糖", LocalDate.of(2018, 10, 1), 20.00f),
                new Wine("猫泰白酒", LocalDate.of(2017, 1, 1), 1000.00f),
                new Fruit("草莓", LocalDate.of(2018, 12, 26), 10.00f, 2.5f)
        );
        */

        // 使用双派发
        // 三件商品加入购物车
        List<Acceptable> products = Arrays.asList(
                new Candy("小黑兔奶糖", LocalDate.of(2018, 10, 1), 20.00f),
                new Wine("猫泰白酒", LocalDate.of(2017, 1, 1), 1000.00f),
                new Fruit("草莓", LocalDate.of(2018, 12, 26), 10.00f, 2.5f)
        );

        Visitor discountVisitor = new DiscountVisitor(LocalDate.of(2018, 1, 1));
        // 迭代购物车轮流结算
        /**
         * 无法识别商品的类型，程序不知道运用哪个方法
         *
         * 优化: 使用双派发
         * 双派发解决了方法重载的多态派发问题，如虎添翼
         */
        /*
        for (Product product : products) {
            discountVisitor.visit(product);// 此处报错
        }
        */

        // 迭代购物车轮流结算
        for (Acceptable product : products) {
            product.accept(discountVisitor);
        }
    }
}
