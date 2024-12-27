package org.example;

import org.example.GeometryLibrary.utils.GeometryUtils;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Circle diameter in centimeters: " + GeometryUtils.metersToCentimeters(circle.getDiameter()));

        Rectangle rectangle = new Rectangle(4, 7);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
    }
}