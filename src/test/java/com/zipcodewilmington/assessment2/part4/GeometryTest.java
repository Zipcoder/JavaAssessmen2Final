package com.zipcodewilmington.assessment2.part4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeometryTest {


    @Test
    public void areaTest1() {
        int radius = 7;
        int height = 2;
        int width = 5;
        Geometry g = new Geometry(height, width, radius);
        int expected = 10;
        int actual = g.getArea(height, width);
        Assert.assertEquals("The rectangle getArea should be 10", expected, actual);
    }

    @Test
    public void areaTest2() {
        int radius = 7;
        int height = 2;
        int width = 5;
        Geometry g = new Geometry(height, width, radius);
        double expected = 153.86;
        double actual = g.getArea(radius);
        Assert.assertEquals("The Circle getArea should be 153.86", expected, actual, 0.001);
    }

    @Test
    public void areaTest3() {
        int radius = 21;
        int height = 4;
        int width = 8;
        Geometry g = new Geometry(height, width, radius);
        int expected = 32;
        int actual = g.getArea(height, width);
        Assert.assertEquals("The rectangle getArea should be 32", expected, actual);
    }

    @Test
    public void areaTest4() {
        int radius = 21;
        int height = 4;
        int width = 8;
        Geometry g = new Geometry(height, width, radius);
        double expected = 1384.74;
        double actual = g.getArea(radius);
        Assert.assertEquals("The Circle getArea should be 1384.74", expected, actual, 0.001);
    }

    @Test
    public void implementedInterfaces() {
        Geometry g = new Geometry();
        String[] expected = {"Circle", "Rectangle"};
        String[] actual = getIterfaceNames(g);
        Assert.assertArrayEquals(expected, actual);
    }

    private String[] getIterfaceNames(Object o) {
        Class[] names = sortInterfaceArrayAlphabetically(o.getClass().getInterfaces());
        String[] namesAsString = new String[names.length];
        for (int x = 0; x < names.length; x++) {
            namesAsString[x] = names[x].getSimpleName();
        }
        return namesAsString;
    }

    private Class[] sortInterfaceArrayAlphabetically(Class[] arr) {
        Arrays.sort(arr, (o1, o2) -> o1.getName().compareTo(o2.getSimpleName()));
        return arr;
    }

}
