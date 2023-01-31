package org.example.structuraltype.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    // 图件工厂
    private Map<String, Drawable> images;

    public Factory() {
        images = new HashMap<>();
    }

    // 获取图件
    public Drawable getDrawable(String image) {
        //缓存里如果没有图件，则实例化并放入缓存。
        if (!images.containsKey(image)) {
            switch (image) {
                case "河流":
                    images.put(image, new Water());
                    break;
                case "草坪":
                    images.put(image, new Grass());
                    break;
                case "石路":
                    images.put(image, new Stone());
                    break;
                case "房屋":
                    images.put(image, new House());
                    break;
            }
        }
        return images.get(image);
    }
}