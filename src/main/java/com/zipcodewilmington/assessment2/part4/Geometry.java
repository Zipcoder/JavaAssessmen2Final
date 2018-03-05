package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Circle, Rectangle {
    private static final double pi = 3.14;
    int h;
    int w;
    int r;

    public Geometry(int h, int w, int r) {
        this.h = h;
        this.w = w;
        this.r = r;
    }

    public Geometry() {
    }

    @Override
    public double getArea(int radius) {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public int getArea(int height, int width) {
        return height * width;
    }
}
