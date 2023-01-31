package org.example.structuraltype.flyweight;

/**
 * 草坪实现类
 */
public class Grass implements Drawable {
    // 草坪图片材质
    private String image;

    public Grass() {
        this.image = "草坪";
        System.out.print("从磁盘加载[" + image + "]图片，耗时半秒。。。");
    }

    @Override
    public void draw(int x, int y) {
        // 绘制草坪坐标
        System.out.println("在位置[" + x + ":" + y + "]上绘制图片：[" + image + "]");
    }

}

