package org.example.structuraltype.bridgemodel.writer;

import org.example.structuraltype.bridgemodel.Ruler;

/**
 * 三角型直尺
 */
public class TriangleRulerImpl implements Ruler {
    @Override
    public void regularize() {
        System.out.println("△");
    }
}
