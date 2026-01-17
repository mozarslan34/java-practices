package org.example.example;

/**
 * @author Mertcan Özarslan
 */
public class Rectangle implements Shape {
    private double length;
    private double height;

    @Override
    public double calculateArea() {
        return length*height;
    }
}
