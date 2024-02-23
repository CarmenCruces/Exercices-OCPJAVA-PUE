package FigurasGeometricas;

import java.util.Random;
public class Circulo {
    private double radio;
    private String color;

    public Circulo() {
        this.radio = radioRandom();
        this.color = colorRandom();
    }
    public double calcularArea() { return Math.PI * Math.pow(radio, 2);}
    public double calcularPerimetro() { return 2 * Math.PI * radio; }
    public double radioRandom () {
        Random random = new Random();
        return 1 + random.nextDouble() * 5;
    }
    public String colorRandom (){
        String[] colores = {"rojo", "verde"};
        int indiceColor = new Random().nextInt(colores.length);
        return colores[indiceColor];
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color='" + color + '\'' + '}';
    }
}
