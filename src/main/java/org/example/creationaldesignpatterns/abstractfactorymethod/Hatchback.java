package org.example.creationaldesignpatterns.abstractfactorymethod;

class Hatchback implements Car {
    @Override
    public void assemble() {
        System.out.println("Hatchback assemble");
    }
}
