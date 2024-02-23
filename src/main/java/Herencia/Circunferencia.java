package Herencia;

import java.util.Random;

public class Circunferencia extends Shape {
    private double radio;
    private String color;

    public Circunferencia() {
        this.radio = radioAleatorio();
        this.color = colorAleatorio();
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    private double radioAleatorio() {
        Random random = new Random();
        return 1 + random.nextDouble() * 5;
    }
    private String colorAleatorio() {
        String[] colores = {"amarillo", "verde"};
        int indiceColor = new Random().nextInt(colores.length);
        return colores[indiceColor];
    }


    @Override
    public String toString() {
        return "Circunferencia [radio=" + radio + ", color=" + color + "]";
    }
}