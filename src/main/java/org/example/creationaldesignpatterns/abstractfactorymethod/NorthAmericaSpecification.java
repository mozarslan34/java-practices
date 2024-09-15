package org.example.creationaldesignpatterns.abstractfactorymethod;

public class NorthAmericaSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("North America Specification");
    }
}
