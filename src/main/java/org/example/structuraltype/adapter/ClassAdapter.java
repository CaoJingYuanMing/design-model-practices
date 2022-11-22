package org.example.structuraltype.adapter;
/**
 * 类适配器
 */
public class ClassAdapter extends TV implements TriplePin{
    @Override
    public void electrify(int live, int nul, int earth) {
        super.electrify(live, nul);
    }
}
