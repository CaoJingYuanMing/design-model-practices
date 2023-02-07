package org.example.behavioraltype.visitormodel.productpackage;

import org.example.behavioraltype.visitormodel.Acceptable;
import org.example.behavioraltype.visitormodel.Visitor;

import java.time.LocalDate;

/**
 * 水果类🍉
 */
public class Fruit extends Product implements Acceptable {
    // 重量属性
    private float weight;

    public Fruit(String name, LocalDate producedDate, float price, float weight) {
        super(name, producedDate, price);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // 把自己交给拜访者。
    }
}
