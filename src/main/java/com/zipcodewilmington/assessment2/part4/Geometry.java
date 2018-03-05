package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Circle, Rectangle{
    private int radius;
    private int height;
    private int width;

    public Geometry(){
        this.radius = 0;
        this.height = 0;
        this.width = 0;
    }

    public Geometry(int height, int width,int radius){
        this.radius = radius;
        this.height = height;
        this.width = width;
    }

    @Override
    public double area(int radius) {
        double area = (3.14) *(radius*radius);
        return area;
    }

    public double getArea(int radius){
        return area(radius);
    }


    public int getArea(int height, int width) {
        return area(height, width);
    }

    @Override
    public int area(int height, int width) {
        int area = height*width;
        return area;
    }
}
