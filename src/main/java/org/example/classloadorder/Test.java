package org.example.classloadorder;

/**
 * 类加载顺序测试
 */
public class Test {
    public static void main(String[] args) {
        Animals animals = new Cat();
        animals.run();

        System.out.println("～～～～～第二次调用～～～～～");
        Animals animals2 = new Cat();
        animals2.run();

    }
}
