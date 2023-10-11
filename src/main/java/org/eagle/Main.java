package org.eagle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(5,10));
        shapes.add(new Square(9));
        shapes.add(new Triangle(3,4,5));

        double sum = 0;
        for (var shape : shapes){
            sum+=shape.getArea();
        }

        System.out.println(sum);
    }
}