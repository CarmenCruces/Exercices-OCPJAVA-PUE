package EjerciciosClaseJava;
//Escribe un programa que genere un número aleatorio y pida al usuario que adivine cuál es.
// Si el número que adivina el usuario es mayor que el número aleatorio, el programa debe mostrar Demasiado alto, inténtelo de nuevo.
// Si el número que adivina el usuario es menor que el número aleatorio, el programa debe mostrar Demasiado bajo, inténtelo de nuevo.
// El programa debe utilizar un bucle que se repita hasta que el usuario adivine correctamente el número aleatorio.

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int suposicionUsuario;

        System.out.println("Bienvenido al juego de Adivina el Número!");
        System.out.println("Intenta adivinar un número entre 1 y 100.");

        do {
            System.out.print("Ingresa tu suposición: ");
            suposicionUsuario = scanner.nextInt();
            intentos++;

            if (suposicionUsuario > numeroAleatorio) {
                System.out.println("Demasiado alto, inténtalo de nuevo.");
            } else if (suposicionUsuario < numeroAleatorio) {
                System.out.println("Demasiado bajo, inténtalo de nuevo.");
            } else {
                System.out.println("¡Correcto! Adivinaste el número en " + intentos + " intentos.");
            }
        } while (suposicionUsuario != numeroAleatorio);

        scanner.close();
    }

}
