package org.example.structuraltype.bridgemodel.writer;

import org.example.structuraltype.bridgemodel.Ruler;

/**
 * 方形直尺
 */
public class SquareRulerImpl implements Ruler {
    @Override
    public void regularize() {
        System.out.println("□");
    }
}
