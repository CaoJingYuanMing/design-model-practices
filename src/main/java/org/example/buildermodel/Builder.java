package org.example.buildermodel;

/**
 * 施工方接口
 */
public interface Builder {
    /**
     * 建造地基
     */
    void buildBasement();

    /**
     * 建造墙体
     */
    void buildWall();

    /**
     * 建造屋顶
     */
    void buildRoof();

    /**
     * 获取建筑物
     * @return 建筑体
     */
    Building getBuilding();
}
