package Herencia;

import java.util.Random;
public class Circulo extends Shape {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(Color color, double radio) {
        super(color);
        this.radio = radio;
    }

    public Circulo() {

    }

    public double area() { return Math.PI * Math.pow(radio, 2);}
    public double perimetro() { return 2 * Math.PI * radio; }
    public double radioRandom () {
        Random random = new Random();
        return 1 + random.nextDouble() * 5;
    }


    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color='" + getColor() + '\'' + '}';
    }
}
