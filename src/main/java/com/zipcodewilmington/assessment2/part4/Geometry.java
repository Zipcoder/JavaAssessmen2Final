package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Rectangle,Circle {


    public Geometry(int height, int width, int radius) {

    }

    @Override
    public double area(int radius) {
        return this.area(radius) * this.area(radius) * 3.14;
    }
    public double getArea(int radius){
        return radius * radius * 3.14;
    }
    @Override
    public int area(int height, int width) {
        return (int) (this.area(height) * this.area(width));
    }
    public int getArea(int height, int width){
        return height * width;
    }
}
