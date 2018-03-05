package com.zipcodewilmington.assessment2.part4;

class Geometry implements Rectangle, Circle{


    Geometry(int height, int width, int radius) {


    }

   public double getArea(int radius) {

        return radius * radius * 3.14;
    }

    public int getArea(int height, int width) {

        return height * width;
    }

}
