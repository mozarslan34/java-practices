package org.example.creationaldesignpatterns.abstractfactorymethod;

class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Sedan assemble");
    }
}
