package EjerciciosClaseJava;

public class FactorialForEach {
    public static void main(String[] args) {
        int x = 4;
        int factorial = 1;

        // Crear un array con los valores del 1 al x
        int[] numeros = new int[x];
        for (int i = 0; i < x; i++) {
            numeros[i] = i + 1;
        }

        // Calcular el factorial usando un bucle foreach
        for (int numero : numeros) {
            System.out.println("Número actual = " + numero);
            System.out.println("El factorial actual= " + factorial);

            factorial = factorial * numero;

            System.out.println("El factorial actualizado es =" + factorial);
        }

        System.out.println("Factorial al final = " + factorial);
    }

}
