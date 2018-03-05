package com.zipcodewilmington.assessment2.part4;

public class Geometry  implements Circle, Rectangle {
    public int height;
    public int width;
    public int radius;


    public Geometry(){

    }
    public Geometry(int height, int width, int radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    public int getArea(int height, int width) {
        return height*width;
    }

    public double getArea(int radius) {
        return radius*radius*Math.PI;
    }

    @Override
    public double area(int radius) {
        return radius*radius*Math.PI;
    }

    @Override
    public int area(int height, int width) {
        return height*width;
    }

//    private String[] getIterfaceNames(Geometry g) {
//        String[] strArr = new String[2];
//        strArr[0] = Circle.class.getSimpleName();
//        strArr[1] = Rectangle.class.getSimpleName();
//        return strArr;
//    }
}
