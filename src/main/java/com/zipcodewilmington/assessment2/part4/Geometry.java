package com.zipcodewilmington.assessment2.part4;

import com.sun.corba.se.impl.interceptors.PICurrent;

import java.lang.System;
import java.lang.Math;

class Geometry implements Rectangle, Circle {

    // do not have to do last unit test (3 methods), as instructed


    private int height;
    private int width;
    private int radius;
    private String[] interfaceNames = new String[2];;

    public Geometry() {
    }

    public Geometry(int height, int width, int radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    public double getArea(int radius) {
        return area(radius);
    }

    public int getArea(int height, int width) {
        return area(height, width);
    }

//    // I misspelled method name to match test: getIterfaceNames(g)
//    public String[] getIterfaceNames(Geometry g) {
//        String rectangleInterfaceName = this.getClass().getInterfaces()[0].getSimpleName();
//        String circleInterfaceName = this.getClass().getInterfaces()[1].getSimpleName();
//        interfaceNames[0] = rectangleInterfaceName;
//        interfaceNames[1] = circleInterfaceName;
//        return interfaceNames;
//    }
//
//    public Class[] sortInterfaceArrayAlphabetically(String[] interfaces) {
//        return null;
//    }

    @Override
    public double area(int radius) {
        double piFromInstructions = 3.14;
        double circleArea = piFromInstructions * radius * radius;
        return circleArea;
    }

    @Override
    public int area(int height, int width) {
        int rectangleArea = height * width;
        return rectangleArea;
    }

}
