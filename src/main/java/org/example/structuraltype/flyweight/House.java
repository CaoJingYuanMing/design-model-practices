package org.example.structuraltype.flyweight;

/**
 * 房屋实现类
 */
public class House implements Drawable {
    // xx图片材质
    private String image;

    public House() {
        this.image = "房屋";
        System.out.print("从磁盘加载[" + image + "]图片，耗时半秒。。。");
    }

    @Override
    public void draw(int x, int y) {
        // 房子盖在地上，所以切换到顶层图层。
        System.out.println("将图层切到最上层。。。");
        System.out.println("在位置[" + x + ":" + y + "]上绘制图片：[" + image + "]");
    }

}
