package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Rectangle, Circle {
    private int height;
    private int width;
    private int radius;

    private final double pi = 3.14;
    //pi = 3.14159265359;

    public Geometry(){

    }

    public Geometry(int height, int width, int radius){
        this.height = height;
        this. width = width;
        this.radius = radius;


    }

    public int getArea(int height, int width) {
        //return height * width;
        return area(height,width);
    }

    public double getArea(int radius){
        //return pi*radius*radius;
        return area(radius);
    }

    @Override
    public double area(int radius) {
        return pi*radius*radius;
    }

    @Override
    public int area(int height, int width) {
        return height * width;
    }
}
