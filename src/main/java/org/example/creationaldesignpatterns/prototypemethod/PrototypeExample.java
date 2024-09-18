package org.example.creationaldesignpatterns.prototypemethod;

public class PrototypeExample {

    public static void main(String[] args) {
        Shape circlePrototype = new Circle("red");

        ShapeClient client = new ShapeClient(circlePrototype);

        Shape redCircle = client.createShape();

        redCircle.draw();
    }
}
