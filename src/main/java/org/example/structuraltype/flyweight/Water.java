package org.example.structuraltype.flyweight;

/**
 * 水实现类
 */
public class Water implements Drawable{
    // 水图片材质
    private String image;

    public Water() {
        this.image = "河流";
        System.out.print("从磁盘加载[" + image + "]图片，耗时半秒。。。");
    }

    @Override
    public void draw(int x, int y) {
        // 绘制草坪坐标
        System.out.println("在位置[" + x + ":" + y + "]上绘制图片：[" + image + "]");
    }
}
