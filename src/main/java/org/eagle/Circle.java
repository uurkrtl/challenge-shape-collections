package org.eagle;

public class Circle implements Shape{
    private int radius;
    static double PI = 3.14159265358979323846;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }
}