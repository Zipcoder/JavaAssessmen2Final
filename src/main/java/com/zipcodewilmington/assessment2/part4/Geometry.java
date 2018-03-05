package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Circle, Rectangle{


    int height;
    int width;
    int radius;


    public Geometry(int height,int width, int radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }



    @Override
    public double getArea(int radius) {

        return ((radius * radius) * 3.14);
    }

    @Override
    public int getArea(int height, int width) {
        return height * width;
    }
}

