package org.example;

/**
 * @author Mertcan Özarslan
 */
public class ConcreteProductB implements  Product{
    @Override
    public void create() {
        System.out.println("Product B created");
    }
}
