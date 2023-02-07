package org.example.behavioraltype.visitormodel.productpackage;

import org.example.behavioraltype.visitormodel.Acceptable;
import org.example.behavioraltype.visitormodel.Visitor;

import java.time.LocalDate;

/**
 * 酒类
 */
public class Wine extends Product implements Acceptable {
    public Wine(String name, LocalDate producedDate, float price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // 把自己交给拜访者。
    }
}
