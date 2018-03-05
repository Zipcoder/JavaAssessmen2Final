package com.zipcodewilmington.assessment2.part4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Geometry {

    private int radius;
    private int height;
    private int width;

    public Geometry(int height, int width, int radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    public double getArea(int radius) {
        double tempRadius = BigDecimal.valueOf(radius).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double tempDouble = (3.14 * (tempRadius * tempRadius));
        return BigDecimal.valueOf(tempDouble).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public int getArea(int height, int width) {
        return height * width;
    }

}
