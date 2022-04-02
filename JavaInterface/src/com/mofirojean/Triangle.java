package com.mofirojean;

public class Triangle implements Polygon{
    private int a, b, c;
    private double s, area;

    // initializing sides of the triangle using constructor
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }
    // calculate the area of the triangle
    public void getArea(){
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " + area);
    }
}
