package org.example.example;

/**
 * @author Mertcan Özarslan
 */
public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
