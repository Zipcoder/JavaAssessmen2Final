package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Circle, Rectangle {

    private int height;
    private int width;
    private int radius;

    Geometry(){
        this.height = 0;
        this.width = 0;
        this.radius = 0;
    }

    Geometry(int height, int width, int radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    public int getArea(int height, int width) {
        int rectangleArea = this.height * this.width;
        return rectangleArea;
    }

    public double getArea(int radius) {
        double circleArea = this.radius * this.radius * 3.14;
        return circleArea;
    }


    @Override
    public double area(int radius) {
        double circleArea = this.radius * this.radius * 3.14;
        return circleArea;
    }

    @Override
    public int area(int height, int width) {
        int rectangleArea = this.height * this.width;
        return rectangleArea;
    }
}
