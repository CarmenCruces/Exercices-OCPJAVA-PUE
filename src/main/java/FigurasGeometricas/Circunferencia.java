package FigurasGeometricas;

import java.util.Random;

public class Circunferencia {
    private double radio;
    private String color;

    public Circunferencia() {
        this.radio = radioAleatorio();
        this.color = colorAleatorio();
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
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
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circunferencia [radio=" + radio + ", color=" + color + "]";
    }
}