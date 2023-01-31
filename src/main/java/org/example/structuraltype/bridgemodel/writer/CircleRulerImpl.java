package org.example.structuraltype.bridgemodel.writer;

import org.example.structuraltype.bridgemodel.Ruler;

/**
 * 圆形直尺
 */
public class CircleRulerImpl implements Ruler {
    @Override
    public void regularize() {
        System.out.println("○");
    }
}
