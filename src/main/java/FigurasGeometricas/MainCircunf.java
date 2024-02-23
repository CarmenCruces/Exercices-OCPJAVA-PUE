package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;

public class MainCircunf {
    public static void main(String[] args) {
        List<Circunferencia> circunferencias = new ArrayList<>();

        // Crear 5 circunferencias con radios y colores aleatorios
        for (int i = 0; i < 5; i++) {
            Circunferencia circunferencia = new Circunferencia();
            circunferencias.add(circunferencia);

            // Calcular área y perímetro
            double area = circunferencia.calcularArea();
            double perimetro = circunferencia.calcularPerimetro();

            System.out.println(circunferencia);
            System.out.println("Área: " + area);
            System.out.println("Perímetro: " + perimetro);
            System.out.println();
        }
        // Filtrar por color y mostrar estadísticas
        mostrarEstadisticas(circunferencias, "amarillo");
    }
    private static void mostrarEstadisticas(List<Circunferencia> circunferencias, String colorFiltrar) {
        List<Circunferencia> circunferenciasFiltradas = filtrarPorColor(circunferencias, colorFiltrar);

        // Mostrar estadísticas
        double areaMaxima = Double.MIN_VALUE;
        double areaMinima = Double.MAX_VALUE;
        double areaTotal = 0;

        for (Circunferencia circunferencia : circunferenciasFiltradas) {
            double area = circunferencia.calcularArea();

            // Actualizar estadísticas
            if (area > areaMaxima) {
                areaMaxima = area;
            }
            if (area < areaMinima) {
                areaMinima = area;
            }
            areaTotal += area;
        }
        double areaMedia = areaTotal / circunferenciasFiltradas.size();

        System.out.println("Circunferencias de color '" + colorFiltrar + "':");
        for (Circunferencia circunferencia : circunferenciasFiltradas) {
            System.out.println(circunferencia);
        }
        System.out.println("Área máxima: " + areaMaxima);
        System.out.println("Área mínima: " + areaMinima);
        System.out.println("Área media: " + areaMedia);
    }
    private static List<Circunferencia> filtrarPorColor(List<Circunferencia> circunferencias, String color) {
        List<Circunferencia> circunferenciasFiltradas = new ArrayList<>();

        for (Circunferencia circunferencia : circunferencias) {
            if (circunferencia.getColor().equalsIgnoreCase(color)) {
                circunferenciasFiltradas.add(circunferencia);
            }
        }
        return circunferenciasFiltradas;
    }
}
