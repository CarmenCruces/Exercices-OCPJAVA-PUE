package EjerciciosClaseJava;//conversor de grados celcius y fahrenheit

import java.util.Scanner;

public class Ejercicio3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("1. Convertir de Celsius a Fahrenheit");
            System.out.println("2. Convertir de Fahrenheit a Celsius");
            System.out.print("Seleccione la opción (1 o 2): ");

            int opcion = scanner.nextInt();

            if (opcion == 1) {

                // Convertir de Celsius a Fahrenheit

                System.out.print("Ingrese la temperatura en Celsius: ");
                double temperaturaCelsius = scanner.nextDouble();
                double temperaturaFahrenheit = celsiusAFahrenheit(temperaturaCelsius);
                System.out.println(temperaturaCelsius + " grados Celsius es igual a " + temperaturaFahrenheit + " grados Fahrenheit.");
                System.out.printf(" %.2f fahrenheit", temperaturaFahrenheit);
            } else if (opcion == 2) {

                // Convertir de Fahrenheit a Celsius

                System.out.print("Ingrese la temperatura en Fahrenheit: ");
                double temperaturaFahrenheit = scanner.nextDouble();
                double temperaturaCelsius = fahrenheitACelsius(temperaturaFahrenheit);
                System.out.println(temperaturaFahrenheit + " grados Fahrenheit es igual a " + temperaturaCelsius + " grados Celsius.");
                System.out.printf(" %.2f celsius", temperaturaCelsius);

            } else {
                System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
            }

            scanner.close();
        }

        // Método para convertir de Celsius a Fahrenheit
        public static double celsiusAFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        // Método para convertir de Fahrenheit a Celsius
        public static double fahrenheitACelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    }

