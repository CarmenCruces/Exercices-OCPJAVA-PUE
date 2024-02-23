package FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainCirculoFuncional {
    public static void main(String[] args) {
        List<Circulo> circulos = new ArrayList<>();

        // Crear 5 círculos con radios y colores aleatorios
        for (int i = 0; i < 5; i++) {
            circulos.add(new Circulo());
        }

        // Mostrar datos de cada círculo
        circulos.forEach(circulo -> {
            double area = circulo.calcularArea();
            double perimetro = circulo.calcularPerimetro();

            System.out.println(circulo);
            System.out.println("Área: " + area);
            System.out.println("Perímetro: " + perimetro);
            System.out.println();
        });

        // Filtrar círculos por color y mostrar datos
        datos(filtrarPorColor(circulos, "rojo"));
    }

    public static void datos(List<Circulo> circulos) {
        if (circulos.isEmpty()) {
            System.out.println("No hay círculos del color especificado.");
            return;
        }

        double areaMax = circulos.stream()
                .mapToDouble(Circulo::calcularArea)
                .max()
                .orElse(0);

        double areaMin = circulos.stream()
                .mapToDouble(Circulo::calcularArea)
                .min()
                .orElse(0);

        double areaTotal = circulos.stream()
                .mapToDouble(Circulo::calcularArea)
                .sum();

        double areaMedia = areaTotal / circulos.size();

        System.out.println("Círculos:");
        circulos.forEach(circulo -> System.out.println(circulo));
        System.out.println("Área máxima: " + areaMax);
        System.out.println("Área mínima: " + areaMin);
        System.out.println("Área media: " + areaMedia);
    }

    private static List<Circulo> filtrarPorColor(List<Circulo> circulos, String color) {
        return circulos.stream()
                .filter(circulo -> circulo.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }
}
