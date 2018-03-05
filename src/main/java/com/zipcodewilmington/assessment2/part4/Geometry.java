package com.zipcodewilmington.assessment2.part4;


/*


The following code is provided in the locked portion of the editor:
        The declaration for an interface named Rectangle containing a method signature for an area method.
        The declaration for an interface named Circle containing a method signature for an area method.
        A Solution class containing the following:  An implementedInterfaceNames function that takes an object and prints the names of the interfaces it implements.
        A main method that creates a Geometry object, passes the Geometry object as an argument to implementedInterfaceNames, and tests the implementations of the overloaded area methods.



        Complete the code in the editor below by writing the following:
        A Geometry class that implements the Rectangle and Circle interfaces. Do not use an access modifier in the class declaration.
        An area method that has two integer parameters, height and width, and returns an integer denoting the area of a height × width rectangle.
        An area method that has one integer parameter, radius, and returns a double denoting the area of a circle (i.e., 3.14 × radius2).

        Note: Use 3.14 (the truncated value for pi) to calculate the area of a Circle.

*/
public class Geometry implements Circle, Rectangle {
    private int height;
    private int width;
    private int radius;

    public Geometry(int height, int width, int radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }


    @Override
    public int getArea(int height, int width) {
        return height * width;
    }

    @Override
    public double getArea(int radius) {
        return 3.14 * (radius*radius);
    }
}
