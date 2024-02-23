package FigurasGeometricas;

import java.util.Arrays;
import java.util.List;

public class MainRectanguloFuncional {
    public static void main(String[] args) {
        List<Rectangulo> rectangulos = Arrays.asList(
                new Rectangulo(5, 3),
                new Rectangulo(4.6, 6.2),
                new Rectangulo(2.6, 3.2)
        );
        Rectangulo rectanguloRandom = new Rectangulo();

        double areaTotal = rectangulos.stream()
                .mapToDouble(Rectangulo::area)
                .sum();

        double areaRandomTotal = rectanguloRandom.area() + rectanguloRandom.area();

        System.out.println("La suma de las áreas de todos los rectángulos es " + areaTotal);

        double total = rectangulos.stream()
                .mapToDouble(Rectangulo::area)
                .sum();

        rectangulos.forEach(r -> System.out.println("El área del rectángulo es " + r.area()));
        System.out.println("El área del rectángulo aleatorio es " + rectanguloRandom.area());

        double media = total / rectangulos.size();

        System.out.println("La media de las áreas de todos los rectángulos es = " + media);

        System.out.println("La suma de las áreas de todos los rectángulos aleatorios es " + areaRandomTotal);
    }

}
