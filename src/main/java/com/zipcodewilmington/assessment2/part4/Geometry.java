package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Rectangle, Circle{

    int height;
    int width;
    int radius;

    public Geometry(int height, int width, int radius){
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    public Geometry (){

    }

    @Override
    public double getArea(int radius) {
        //double circumference = 3.13 *
        return 3.14 * radius * radius;
    }

    @Override
    public int getArea(int height, int width) {
        return height * width;
    }

}
