package ru.mirea.lab3.secondExercise;

public class Circle extends Shape {
    final double Pi = 3.1415926536;
    protected double radius;

    Circle() {};

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius*radius)*Pi;
    }

    @Override
    public double getPerimeter() {
        return (Pi*2)*radius;
    }

    @Override
    public String toString() {
        return "radius: " + radius + " color: " + color + " filled?: " + filled;
    }
}
