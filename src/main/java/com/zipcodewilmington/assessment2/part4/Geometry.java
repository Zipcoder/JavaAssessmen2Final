package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Circle, Rectangle{
    String[] interfaces = new String[]{"Circle", "Rectangle"};
int height;
int width;
int radius;
    Geometry (){
        String[] interfaces = new String[]{"Circle", "Rectangle"};
    }
    Geometry (int height, int width, int radius){
        this.height = height;
        this.width = width;
        this.radius = radius;
    }
    public int area(int height, int width){
        int rectangleArea = (height * width);
        return rectangleArea;
    }

    public double area(int radius){
        double circleArea = (double)radius;
        return circleArea;
    }

    public int getArea(int height, int width){
        int rectangleArea = (height * width);
        return rectangleArea;
    }

    public double getArea(int radius){
        double circleArea = (double) radius;
       double circleEquation = (circleArea * circleArea) * 3.14;
       return circleEquation;
    } 
//
//    public String[] getIterfaceNames(Geometry g){
//        return interfaces;
//    }
//
//    public String sortInterfaceArrayAlphabetically(Geometry g){
//        StringBuilder interfaceNames = new StringBuilder();
//        for (int i = 0; i < interfaces.length; i++){
//            interfaceNames.append(interfaces[i]);
//        }
//        return interfaceNames.toString();
//    }
}
