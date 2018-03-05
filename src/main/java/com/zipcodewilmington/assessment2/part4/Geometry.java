package com.zipcodewilmington.assessment2.part4;

class Geometry implements Rectangle, Circle {

    private int height;
    private int width;
    private int radius;


    public Geometry() {
        
    }

    public Geometry(int height, int width, int radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }


    public int area(int height, int width) {
        return height * width;
    }

    public int getArea(int height, int width) {
        return this.area(height, width);
    }

    public double area(int radius) {
        return 3.14 * (radius * radius);
    }

    public double getArea(int radius) {
        return this.area(radius);
    }
}
