package Herencia;

import java.util.Random;

public abstract class Shape {

    protected Color color;

    public Shape() {
        this(Color.getRandomColor());
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area ();
}
