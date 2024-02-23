package Herencia;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(15, 25, Color.ROJO);
        Circulo circulo = new Circulo(10);
        Circulo circuloColorRandom = new Circulo(15);
        Circunferencia circunferencia = new Circunferencia();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangulo);
        shapes.add(circulo);
        shapes.add(circunferencia);

        for (Shape shape : shapes) {
            System.out.println("El area es = " + shape.area());
            System.out.println(shape);
        }
    }
}
