package com.company;

import java.util.ArrayList;

public class Triangle extends GeometricObject{
    private double sides[] = new double[3];

    public Triangle(double s1,double s2,double s3,String color, boolean filled) {
        super(color, filled);
        this.sides[0] = s1;
        this.sides[1] = s2;
        this.sides[2] = s3;
    }


    @Override
    public double perimeter() {
        return sides[0]+sides[1]+sides[2];
    }

    @Override
    public double area() {
        double s = this.perimeter()/2.0;
        return Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));
    }
}
