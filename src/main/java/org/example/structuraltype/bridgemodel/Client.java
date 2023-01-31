package org.example.structuraltype.bridgemodel;

import org.example.structuraltype.bridgemodel.pen.BlackPen;
import org.example.structuraltype.bridgemodel.pen.Pen;
import org.example.structuraltype.bridgemodel.pen.WhitePen;
import org.example.structuraltype.bridgemodel.writer.CircleRulerImpl;
import org.example.structuraltype.bridgemodel.writer.SquareRulerImpl;
import org.example.structuraltype.bridgemodel.writer.TriangleRulerImpl;

public class Client {
    public static void main(String[] args) {
        Ruler circleRuler = new CircleRulerImpl();
        Ruler squareRuler = new SquareRulerImpl();
        Ruler triangleRuler = new TriangleRulerImpl();

        Pen blackPen = new BlackPen(circleRuler);
        blackPen.draw();

        Pen squarePen = new BlackPen(squareRuler);
        squarePen.draw();

        Pen triangleBlackPen = new BlackPen(triangleRuler);
        triangleBlackPen.draw();

        Pen whiteCPen = new WhitePen(circleRuler);
        whiteCPen.draw();

        Pen whiteSPen = new WhitePen(squareRuler);
        whiteSPen.draw();

        Pen whiteTPen = new WhitePen(triangleRuler);
        whiteTPen.draw();
    }
}
