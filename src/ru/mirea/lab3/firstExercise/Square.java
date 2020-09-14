package ru.mirea.lab3.firstExercise;

public class Square extends Shape {

    Square(double width, double height) {
        super(width, height);
    }

    @Override
    public double getSquare() {
        return width*height;
    }
}
