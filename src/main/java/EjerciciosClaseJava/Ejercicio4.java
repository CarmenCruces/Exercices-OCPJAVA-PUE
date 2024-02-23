package EjerciciosClaseJava;//contador de vocales

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

    int numeroVocales = contarVocales(palabra);

        System.out.println("Número de vocales en la palabra '" + palabra + "': " + numeroVocales);
        System.out.println("Palabra con vocales en mayúscula: " + vocalesAMayuscula(palabra));

        scanner.close();
}

    // Método para contar el número de vocales en una palabra
    public static int contarVocales(String palabra) {
        int count = 0;
        // Convertir la palabra a minúsculas para simplificar la comparación
        palabra = palabra.toLowerCase();

        // Iterar sobre cada carácter de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            // Verificar si el carácter es una vocal
            if (esVocal(letra)) {
                count++;
            }
        }

        return count;
    }
    // Método para convertir las vocales de una palabra a mayúscula
    public static String vocalesAMayuscula(String palabra) {

        // Iterar sobre cada carácter de la palabra y convertir vocales a mayúscula
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            // Verificar si el carácter es una vocal y convertirla a mayúscula.....probar a hacerlo con StringBuilder
            if (esVocal(letra)) {
                palabra = palabra.substring(0, i) + Character.toUpperCase(letra) + palabra.substring(i + 1);
            }
        }

        return palabra;
    }

    private static boolean esVocal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }


}
