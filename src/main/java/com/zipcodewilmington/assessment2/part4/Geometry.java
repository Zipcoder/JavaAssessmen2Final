package com.zipcodewilmington.assessment2.part4;

public class Geometry {
    private int height;
    private int width;
    private int radius;

    private final double pi = 3.14;
    //pi = 3.14159265359;

    public Geometry(){

    }

    public Geometry(int height, int width, int radius){


    }

    public int getArea(int height, int width) {
        return height * width;
    }

    public double getArea(int radius){
        return pi*radius*radius;
    }
}
