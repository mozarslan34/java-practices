package org.example;

/**
 * @author Mertcan Özarslan
 */
public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
