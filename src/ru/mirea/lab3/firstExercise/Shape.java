package ru.mirea.lab3.firstExercise;

abstract class Shape {
    double width;
    double height;
    double radius;

    Shape(double radius) {
        this.radius = radius;
    }

    Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public abstract double getSquare();
}
