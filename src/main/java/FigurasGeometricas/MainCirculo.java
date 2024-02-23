package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;
public class MainCirculo {
    public static void main(String[] args) {
        List<Circulo> circulos = new ArrayList<>();

        //Esto crea 5 circulos con radios y colores random
        for (int i = 0; i < 5; i++) {

            Circulo circulo = new Circulo();
            circulos.add(circulo);

            //Esto trae los metodos de calcularArea y calcularPerimetro del objeto circulo
            double area = circulo.calcularArea();
            double perimetro = circulo.calcularPerimetro();

            System.out.println(circulo);
            System.out.println("Área: " + area);
            System.out.println("Perímetro: " + perimetro);
            System.out.println();
        }
        datos(circulos, "rojo");
    }
    public static void datos(List<Circulo> circulos, String colorFiltro) {
        List<Circulo> circulosFiltrados = filtrarPorColor(circulos, colorFiltro);

        //Mostrar datos
        double areaMax = Double.MAX_VALUE;
        double areaMin = Double.MIN_VALUE;
        double areaTotal = 0;

        for (Circulo circulo : circulosFiltrados) {
            double area = circulo.calcularArea();

            //Actualizar datos
            if (area > areaMax) { areaMax = area; }
            areaTotal += area;
        }
        double areaMedia = areaTotal / circulosFiltrados.size();

        System.out.println("Círculos de color '" + colorFiltro + "':");
        for (Circulo circulo : circulosFiltrados) {
            System.out.println(circulo);
        }
        System.out.println("Área máxima: " + areaMax);
        System.out.println("Área mínima: " + areaMin);
        System.out.println("Área media: " + areaMedia);
    }
    private static List<Circulo> filtrarPorColor(List<Circulo> circulos, String color) {
        List<Circulo> circulosFiltrados = new ArrayList<>();

        for (Circulo circulo : circulos) {
            if (circulo.getColor().equalsIgnoreCase(color)) {
                circulosFiltrados.add(circulo);
            }
        }
        return circulosFiltrados;
    }
}