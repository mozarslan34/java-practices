package org.example;

/**
 * @author Mertcan Özarslan
 */
public class Circle implements Shape {
    private double radius;

    @Override
    public double calculateArea() {
        return radius*radius*Math.PI;
    }
}
