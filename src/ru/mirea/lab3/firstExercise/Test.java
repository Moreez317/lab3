package ru.mirea.lab3.firstExercise;

public class Test {
    public static void main(String[] args) {
        Circle circle1;
        circle1 = new Circle(15);
        System.out.println(circle1.getSquare());

        Square square1;
        square1 = new Square(10, 10);
        System.out.println(square1.getSquare());
    }
}
