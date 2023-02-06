package org.example.behavioraltype.iteratormodel;

/**
 * 迭代器
 * @param <E> 范型
 */
public interface Iterator<E> {
    E next();// 返回下一个元素
    boolean hasNext(); // 是否还有下一个元素
}
