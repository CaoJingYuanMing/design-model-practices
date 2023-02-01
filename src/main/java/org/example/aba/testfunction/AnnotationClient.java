package org.example.aba.testfunction;

public class AnnotationClient {
    @Tree
    public static void sayHello(final String name) {
        System.out.println("==>> Hi, " + name + " [sayHello]");
    }

    @Tree(name = "Someone")
    public static void sayHelloToSomeone(final String name) {
        System.out.println("==>> Hi, " + name + " [sayHelloToSomeone]");
    }

    public static void main(final String[] args) throws Exception {
        final TreeProcessor treeProcessor = new TreeProcessor();
        treeProcessor.parseMethod(AnnotationClient.class);
    }

}
