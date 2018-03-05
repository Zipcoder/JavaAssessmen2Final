package com.zipcodewilmington.assessment2.part4;

public class Geometry<T> implements Circle,Rectangle{
    T radius;
    T height;
    T width;

    public Geometry(T height, T width,T radius){
        this.height=height;
        this.width=width;
        this.radius=radius;

    }
    public Geometry(){

    }

    @Override
    public int area(int height, int width) {
        return (int)height*width;
    }
    public double area(double height,double width){
        return  height*width;
    }

    @Override
    public double area(int radius) {
        return 3.14*Math.pow(radius,2);
    }

    public double getArea(int radius){
         double area = area(radius);
        return area;

    }

    public int getArea(int height,int width){
        int area = area(height,width);
        return area;
    }
    public double getArea(double radius){
        return Math.PI*Math.pow(radius,2);
    }

    public String[] getInterfaceNames(Geometry aGeometry){
        String[]myInterfaces = {"Circle","Rectangle"};
        return myInterfaces;
    }
}
