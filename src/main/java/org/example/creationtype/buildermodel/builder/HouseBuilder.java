package org.example.creationtype.buildermodel.builder;

import org.example.creationtype.buildermodel.Building;

/**
 * 别墅施工队
 */
public class HouseBuilder implements Builder {
    private Building house;

    public HouseBuilder() {
        house = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("挖地基，部署管道、线缆，水泥加固，搭建围墙、花园。");
        house.setBasement("╬╬╬╬╬╬╬╬\n");
    }

    @Override
    public void buildWall() {
        System.out.println("搭建木质框架，石膏板封墙并粉饰内外墙。");
        house.setWall("｜田｜田 田|\n");
    }

    @Override
    public void buildRoof() {
        System.out.println("建造木质屋顶、阁楼，安装烟囱，做好防水。");
        house.setRoof("╱◥███◣\n");
    }

    @Override
    public Building getBuilding() {
        return house;
    }
}
