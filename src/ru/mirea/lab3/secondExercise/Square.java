package ru.mirea.lab3.secondExercise;

public class Square extends Rectangle{
    protected double side;

    Square() {}

    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //вот тут вопрос по поводу this.side, нахуй оно тут надо, мб поменять на this.width и this.length
    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "side: " + side + " color: " + color + " filled?: " + filled;
    }
}
