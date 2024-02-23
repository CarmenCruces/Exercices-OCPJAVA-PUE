package EjerciciosClaseJava;//Rectángulos:
//Realiza un programa  que pida al usuario la información para crear un rectángulo.
//El programa pedirá al usuario que especifique  las dimensiones del rectángulo: largo y ancho.
//Después el programa ha de calcular el área y el perímetro del rectángulo.
//Siguiente paso. Haz que el programa sea capaz de almacenar  cinco rectángulos especificados por el usuario.
//Primero utiliza un bucle tradicional.  Después realiza la misma operación con un bucle foreach.
//Muestra por la consola la lista de rectángulos,
//de manera que  aparezcan las características de cada rectángulo de uno a uno.
//A continuación,  muestra la media del área de todos los rectángulos.
//Finalmente,  muestra por la consola la posición del rectángulo cuya área es máxima.


import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Número de rectángulos a obtener
        int numRectangulos = 5;

        // Arrays para almacenar dimensiones, áreas y perímetros de los rectángulos

        // mirar como hacerlo en bidimensional.......................................

        double[] longitudes = new double[numRectangulos];
        double[] anchos = new double[numRectangulos];
        double[] areas = new double[numRectangulos];
        double[] perimetros = new double[numRectangulos];

        // Ingreso de dimensiones para cada rectángulo-------------------------------
        for (int i = 0; i < numRectangulos; i++) {
            System.out.println("Rectángulo #" + (i + 1));
            System.out.print("Ingrese la longitud del rectángulo: ");
            longitudes[i] = scanner.nextDouble();

            System.out.print("Ingrese el ancho del rectángulo: ");
            anchos[i] = scanner.nextDouble();

            while (longitudes[i] == anchos[i]) {
                System.out.println("Error: Las dimensiones deben ser distintas para formar un rectángulo.");
                System.out.print("Ingrese el ancho del rectángulo: ");
                anchos[i] = scanner.nextDouble();
            }

            // Cálculo del área y el perímetro-----------------------------------------
            areas[i] = longitudes[i] * anchos[i];
            perimetros[i] = 2 * (longitudes[i] + anchos[i]);
        }

        // Mostrar la lista de rectángulos---------------------------------------------
        System.out.println("\nLista de Rectángulos:");
        for (int i = 0; i < numRectangulos; i++) {
            System.out.println("Rectángulo #" + (i + 1) + ":");
            System.out.println("  Longitud: " + longitudes[i]);
            System.out.println("  Ancho: " + anchos[i]);
            System.out.println("  Área: " + areas[i]);
            System.out.println("  Perímetro: " + perimetros[i]);
            System.out.println();
        }

        // Mostrar la lista de rectángulos con un bucle foreach--------------------------
        System.out.println("\nLista de Rectángulos:");
        int indice = 1;
        for (double area : areas) {
            System.out.println("Rectángulo #" + indice++);
            System.out.println("  Área: " + area);
            System.out.println();
        }

        // Calcular la media del área
        double sumaAreas = 0;
        for (double area : areas) {
            sumaAreas += area;
        }
        double mediaArea = sumaAreas / numRectangulos;

        // Mostrar la media del área-----------------------------------------------------
        System.out.println("Media del Área de los Rectángulos: " + mediaArea);

        // Encontrar el rectángulo con el área máxima
        double maxArea = areas[0];
        int posicionMaxArea = 0;
        for (int i = 1; i < numRectangulos; i++) {
            if (areas[i] > maxArea) {
                maxArea = areas[i];
                posicionMaxArea = i;
            }
        }

        // Mostrar la posición del rectángulo con el área máxima
        System.out.println("Rectángulo con Área Máxima: Rectángulo #" + (posicionMaxArea + 1));

        scanner.close();
    }
}
