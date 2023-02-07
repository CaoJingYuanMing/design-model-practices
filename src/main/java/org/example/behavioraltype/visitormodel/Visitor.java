package org.example.behavioraltype.visitormodel;

import org.example.behavioraltype.visitormodel.productpackage.Candy;
import org.example.behavioraltype.visitormodel.productpackage.Fruit;
import org.example.behavioraltype.visitormodel.productpackage.Wine;

/**
 * 访问者接口
 *
 * 重载方法，实现对不同参数产品进行分流
 *
 */
public interface Visitor {
    void visit(Candy candy);// 糖果重载方法
    void visit(Fruit fruit);// 水果重载方法
    void visit(Wine wine);// 水果重载方法
}
