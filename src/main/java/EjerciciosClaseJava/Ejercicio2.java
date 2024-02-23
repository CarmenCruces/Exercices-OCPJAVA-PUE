package EjerciciosClaseJava;//Realiza un programa que pregunte al usuario un número X.
//El programa ha de mostrar  todos los números primos
// que existen desde 0 hasta X incluido.


import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Paso 1: Solicitar al usuario un número X
        System.out.print("Ingrese un número X: ");
        int x = scanner.nextInt();
        // Paso 2: Mostrar los números primos hasta X
        System.out.println("Números primos desde 0 hasta " + x + ":");

        for (int i = 2; i <= x; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
