package com.zipcodewilmington.assessment2.part4;

 class Geometry implements Rectangle,Circle {

     private int height;
     private int width;
     private int radius;

     public Geometry(int height, int width, int radius){
         this.height = height;
         this.radius = radius;
         this.width = width;
     }

     @Override
     public double area(int radius) {
         double circleArea = 3.14 * (radius * radius);
         return circleArea;
     }

     @Override
     public int area(int height, int width) {
         int rectangleArea = height * width;
         return rectangleArea;
     }
     
     public int getArea(int height, int width){
         return area(height, width);
     }

     public double getArea(int radius){
         return area(radius);
     }


 }
