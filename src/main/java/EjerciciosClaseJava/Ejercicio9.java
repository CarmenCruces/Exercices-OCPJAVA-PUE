package EjerciciosClaseJava;//Implementa el juego del ahorcado.
// La computadora elige una palabra al azar y el usuario
// tiene que adivinarla ingresando letras.

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        String[] palabras = {"programacion", "java", "computadora", "ahorcado", "desarrollo"};

        // Seleccionar una palabra al azar
        Random random = new Random();
        String palabraSecreta = palabras[random.nextInt(palabras.length)];

        // Inicializar un arreglo para las letras adivinadas
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Inicializar variables
        int intentosMaximos = 6;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Juego
        Scanner scanner = new Scanner(System.in);

        while (intentos <= intentosMaximos && !palabraAdivinada) {
            // Mostrar el estado actual de la palabra
            System.out.println("Palabra actual: " + new String(letrasAdivinadas));
            System.out.println("Intentos restantes: " + (intentosMaximos - intentos));

            // Solicitar al usuario ingresar una letra
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);

            // Verificar si la letra está en la palabra secreta
            boolean letraAdivinada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraAdivinada = true;
                }
            }

            // Verificar si se ha adivinado la palabra completa
            if (new String(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
            }

            // Si la letra no está en la palabra, incrementar el contador de intentos
            if (!letraAdivinada) {
                intentos++;
                System.out.println("Letra incorrecta. Intenta de nuevo.");
            }

            // Imprimir una representación gráfica del ahorcado
            imprimirAhorcado(intentos);
        }

        // Si se agotan los intentos y no se adivina la palabra, mostrar la palabra secreta
        if (!palabraAdivinada) {
            System.out.println("¡Oh no! Te has quedado sin intentos. La palabra secreta era: " + palabraSecreta);
        }

        // Cerrar el escáner
        scanner.close();
    }

    // Método para imprimir una representación gráfica del ahorcado
    private static void imprimirAhorcado(int intentos) {
        String[] ahorcado = {
                "  +---+",
                "  |   |",
                "      |",
                "      |",
                "      |",
                "      |",
                "========="
        };

        // Imprimir partes adicionales del ahorcado según los intentos restantes
        switch (intentos) {
            case 1:
                ahorcado[2] = "  O   |";
                break;
            case 2:
                ahorcado[3] = "  |   |";
                break;
            case 3:
                ahorcado[3] = " /|   |";
                break;
            case 4:
                ahorcado[3] = " /|\\  |";
                break;
            case 5:
                ahorcado[4] = " /    |";
                break;
            case 6:
                ahorcado[4] = " / \\  |";
                break;
        }

        // Imprimir el ahorcado
        for (String linea : ahorcado) {
            System.out.println(linea);
        }
        System.out.println();
    }

}
