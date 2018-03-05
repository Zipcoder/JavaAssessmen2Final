package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Circle, Rectangle {

    private int height;
    private int width;
    private int radius;

    Geometry(){

    }

    Geometry(int height, int width, int radius){
        this.height = height;
        this.width = width;
        this.radius = radius;
    }


    @Override
    public double area(int radius) {
        return radius * radius * 3.14;
    }

    @Override
    public int area(int height, int width) {
        return height * width;
    }

    public int getArea(int height, int width){
        return area(height, width);
    }

    public double getArea(int radius){
        return area(radius);
    }
}
