package com.zipcodewilmington.assessment2.part4;

public class Geometry implements Rectangle, Circle {

public int height;
public int width;
public int radius;

public final double PI = 3.14;

    public Geometry(int height, int width, int radius) {
       this.height = height;
       this.width = width;
       this.radius = radius;
    }

    public Geometry(){}

    public int getArea(int height, int width){

        return this.area(height, width);
    }

    public double getArea(int radius){

        return this.area(radius);
    }

    @Override
    public double area(int radius){

        return PI * (double)radius * (double)radius;
    }

    @Override
    public int area(int height, int width){

        return height * width;
    }
}


/**A Geometry class that implements the Rectangle and Circle interfaces.
 *  Do not use an access modifier in the class declaration.
 An area method that has two integer parameters, height and width, and returns
 an integer denoting the area of a height × width rectangle.
 An area method that has one integer parameter, radius, and returns a double
 denoting the area of a circle (i.e., 3.14 × radius2). */


