package org.example.buildermodelparctice;

import org.example.buildermodelparctice.builder.PhoneAppearanceBuilder;
import org.example.buildermodelparctice.builder.PhoneAssembledBuilder;
import org.example.buildermodelparctice.builder.PhoneKernelBuilder;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        PhoneDirector director = new PhoneDirector(new PhoneAppearanceBuilder(phone), new PhoneAssembledBuilder(phone), new PhoneKernelBuilder(phone));
        Phone directPhone = director.direct();
        System.out.println(directPhone);
    }
}
