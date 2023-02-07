package org.example.behavioraltype.visitormodel.productpackage;

import org.example.behavioraltype.visitormodel.Acceptable;
import org.example.behavioraltype.visitormodel.Visitor;

import java.time.LocalDate;

/**
 * 糖果🍬
 */
public class Candy extends Product implements Acceptable {
    /**
     * 继承父类构造
     *
     * @param name         名字
     * @param producedDate 生产日期
     * @param price        价格
     */
    public Candy(String name, LocalDate producedDate, float price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // 把自己交给拜访者。
    }
}
