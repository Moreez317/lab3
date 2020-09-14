package ru.mirea.lab3.FourthAndFivfthExercise;

public class Test {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(1, 1, 1, 1);
        System.out.println(point1.toString());
        point1.moveRight();
        point1.moveLeft();
        point1.moveDown();
        point1.moveUp();
        System.out.println(point1.toString());

        MovableCircle circle1 = new MovableCircle(2, 2, 2, 2, 4);
        System.out.println(circle1.toString());
        circle1.moveRight();
        circle1.moveUp();
        System.out.println(circle1.toString());

        MovableRectangle rectangle1 = new MovableRectangle(4, 6, 2, 4, 3, 3);
        System.out.println(rectangle1.toString());

        rectangle1.moveDown();
        rectangle1.moveLeft();
        System.out.println(rectangle1.toString());
        System.out.println(rectangle1.test());

        MovableRectangle rectangle2 = new MovableRectangle(1, 5, 3, 2, 2, 4);
        System.out.println(rectangle2.test());
    }
}
