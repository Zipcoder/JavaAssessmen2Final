package com.zipcodewilmington.assessment2.part4;

class Geometry implements Rectangle,Circle {

    int height;
    int width;
    int radius;

    Geometry (int height, int width, int radius){
        this.height=height;
        this.width=width;
        this.radius=radius;
    }



    @Override
    public double area(int radius) {
        return 3.14 * (radius * radius);
    }

    @Override
    public int area(int height, int width) {
        return height * width;
    }

    public double getArea(int radius){
        return this.area(radius);
    }

    public int getArea(int height, int width){
        return this.area(height,width);
    }
}
