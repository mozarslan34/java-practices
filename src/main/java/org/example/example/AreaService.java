package org.example.example;

import java.util.List;

/**
 * @author Mertcan Özarslan
 */
public class AreaService {
    public double calculateArea(List<Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        } return area;
    }
}
