package ru.mirea.lab3.FourthAndFivfthExercise;

public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    };

    @Override
    public String toString() {
        return "x: " + x + " y: " + y + " xSpeed: " + xSpeed + " ySpeed: " + ySpeed;
    }

    @Override
    public void moveUp() {
        x = x + xSpeed;
    }

    @Override
    public void moveDown() {
        x = x - xSpeed;
    }

    @Override
    public void moveLeft() {
        y = y - ySpeed;
    }

    @Override
    public void moveRight() {
        y = y + ySpeed;
    }
}
