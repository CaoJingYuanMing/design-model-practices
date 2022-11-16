package org.example.creationtype.buildermodel;

import org.example.creationtype.buildermodel.builder.ApartmentBuilder;
import org.example.creationtype.buildermodel.builder.Builder;
import org.example.creationtype.buildermodel.builder.HouseBuilder;

public class Client {
    public static void main(String[] args) {
        //招工，建别墅。
        Builder builder = new HouseBuilder();
        //交给工程总监
        Director director = new Director(builder);
        System.out.println(director.direct());
        //替换施工方，建公寓。
        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.direct());
    }
}
