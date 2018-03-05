package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Circle, Rectangle{

    int height;
    int width;
    int radius;

    public Geometry(int height, int width, int radius) {
        double circle = area(radius);
        int rectangle = area(height, width);
    }

    @Override
    public double area(int radius) {
        double areaOfCircle = 3.14 * (radius * radius);
        return areaOfCircle;
    }

    @Override
    public int area(int height, int width) {
        int areaOfRectangle = height * width;
        return areaOfRectangle;
    }

    public int getArea(int height, int width){
        return area(height, width);
    }
    public double getArea(int radius){
        return area(radius);
    }

}

//            System.out.println("The rectangle area should be " + area(height, width));
//        }else if(){
//            System.out.println("The circle area should be " + area(radius));
//        }