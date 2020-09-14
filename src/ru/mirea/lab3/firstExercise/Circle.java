package ru.mirea.lab3.firstExercise;

public class Circle extends Shape {
    final double Pi = 3.1415926536;

    Circle(float radius) {
        super(radius);
    }

    @Override
    public double getSquare() {
        return (radius*radius)*Pi;
    }
}
