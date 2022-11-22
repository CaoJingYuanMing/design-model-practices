package org.example.structuraltype.adapter;

public class TV implements DualPin{
    @Override
    public void electrify(int live, int nul) {
        System.out.println("火线通电：" + live);
        System.out.println("零线通电：" + nul);
    }
}
