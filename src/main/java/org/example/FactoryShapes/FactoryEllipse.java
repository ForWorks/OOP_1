package org.example.FactoryShapes;

import javafx.scene.paint.Color;
import org.example.Shapes.Ellipse;
import org.example.Shapes.Shape;
import java.util.List;

public class FactoryEllipse implements FactoryShape {
    @Override
    public Shape createShape(List<Double> points, Color penColor, Color brushColor, double lineWeight) {
        return new Ellipse(points, penColor, brushColor, lineWeight);
    }
}
