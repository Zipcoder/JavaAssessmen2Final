package com.zipcodewilmington.assessment2.part4;

import java.text.DecimalFormat;

public class Geometry {

    public Geometry(int height, int width, int radius) {

    }

    public int getArea(int height, int width) {

        return height * width;
    }

    public double getArea(int radius) {

        return 3.14 * (radius * radius);


    }
}
