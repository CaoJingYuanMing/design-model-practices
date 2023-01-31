package org.example.structuraltype.compositemodel;

public class Client {
    public static void main(String[] args) {
        Node folder1 = new Folder("父级文件夹");
        Node afile = new File("父级文件a");
        Node bfile = new File("父级文件b");
        Node cfile = new File("父级文件c");
        folder1.add(afile);
        folder1.add(bfile);
        folder1.add(cfile);

        Node folder2 = new Folder("2级文件夹");
        Node afile2 = new File("2级文件a");
        Node bfile2 = new File("2级文件b");
        Node cfile2 = new File("2级文件c");
        folder2.add(afile2);
        folder2.add(bfile2);
        folder2.add(cfile2);

        Node folder3 = new Folder("3级文件夹");
        Node afile3 = new File("3级文件a");
        Node bfile3 = new File("3级文件b");
        Node cfile3 = new File("3级文件c");
        folder3.add(afile3);
        folder3.add(bfile3);
        folder3.add(cfile3);

        folder1.add(folder2);
        folder2.add(folder3);
        folder1.ls(0);
    }
}
