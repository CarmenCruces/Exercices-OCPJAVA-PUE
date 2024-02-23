package FigurasGeometricas;

import java.util.Random;

public class Rectangulo {
    double largo = 0;
    double ancho = 0;

    public Rectangulo() {
        Random random = new Random();
        this.largo = 1 + random.nextDouble() * 10;;
        this.ancho = 1 + random.nextDouble() * 10;;
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }
    public double getAncho() {
        return ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double area() {
        return largo * ancho;
    }

    @Override
    public String toString() {
        return "FigurasGeometricas.Rectangulo{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}
