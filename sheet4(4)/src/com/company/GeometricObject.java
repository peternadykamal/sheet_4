package com.company;

public abstract class  GeometricObject {
    private String color;
    private boolean filled;
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }

    public abstract double perimeter();
    public abstract double area();
}
