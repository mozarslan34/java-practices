package org.example.example;

/**
 * @author Mertcan Özarslan
 */
public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
