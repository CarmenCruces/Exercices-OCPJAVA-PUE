package Herencia;

import java.util.List;

public class RectanguloApp {
    public static void main(String[] args) {

        double largo = 5;
        double ancho = 3;

        Rectangulo rectangulo1 = new Rectangulo(largo, ancho);
        Rectangulo rectangulo2 = new Rectangulo(4.6, 6.2);
        Rectangulo rectangulo3 = new Rectangulo(2.6, 3.2);

        List<Rectangulo> rectangulos = List.of(rectangulo1, rectangulo2, rectangulo3);

        Rectangulo rectanguloRandom = new Rectangulo();
        double areaR1 = rectangulo1.area();
        double areaR2 = rectangulo2.area();
        double areaR3 = rectangulo3.area();

        double areaRandom = rectanguloRandom.area();

        double areaTotal = areaR1 + areaR2 + areaR3;
        double areaRandomTotal = areaRandom + areaRandom;

        System.out.println("La suma de las areas de todos los rectángulos es " + areaTotal);

        double total = 0;

        for (Rectangulo r : rectangulos) {
            System.out.println("El area del rectangulo es " + r.area());
            System.out.println("El area del rectangulo es " + rectanguloRandom.area());
            total = total + r.area();
        }
        System.out.println("La suma del area de todos los rectangulos es " + total);

            double media = total / rectangulos.size();

        System.out.println("La media de las áreas de todos los rectángulos es = " + media);

        System.out.println("La suma de las areas de todos los rectángulos es " + areaRandomTotal);
    }

}