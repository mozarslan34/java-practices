package org.example.creationaldesignpatterns.abstractfactorymethod;

interface CarFactory {
    Car createCar();
    CarSpecification createCarSpecification();
}
