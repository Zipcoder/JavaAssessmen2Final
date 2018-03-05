package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Rectangle, Circle {
    int height;
    int width;
    int radius;

    public Geometry(int height, int width, int radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    @Override
    public double area(int radius) {
        return 0;
    }

    @Override
    public int area(int height, int width) {
        return 0;
    }

    public int getArea(int height, int width) {
        return height * width;
    }

    public double getArea(int radius) {
        return 3.14 * (radius * radius);
    }
}
