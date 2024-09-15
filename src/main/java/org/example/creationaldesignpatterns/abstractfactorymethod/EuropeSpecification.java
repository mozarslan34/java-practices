package org.example.creationaldesignpatterns.abstractfactorymethod;

public class EuropeSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("Europe specification");
    }
}
