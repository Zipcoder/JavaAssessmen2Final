package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Circle, Rectangle {

    int height;
    int width;
    int radius;

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getRadius() {
        return this.radius;
    }

    public Geometry(){

    }

    public Geometry(int height, int width, int radius){
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    public double getArea(int radius) {
        return 3.14 * (radius*radius);
    }

    public int getArea(int height, int width) {
        return height * width;
    }

    @Override
    public double area(int radius) {
        return 0;
    }

    @Override
    public int area(int height, int width) {
        return 0;
    }
}
