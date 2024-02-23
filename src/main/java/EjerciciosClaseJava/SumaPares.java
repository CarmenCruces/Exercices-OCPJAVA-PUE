package EjerciciosClaseJava;

public class SumaPares {
    public static void main(String[] args) {
        int sumaPares = 0;
        int productoImpares = 1;

        for (int i = 0; i <= 20; i++) {
            if( i %2 == 0) {
                sumaPares += i;
            } else {
                productoImpares *= i;
            }
        }
        System.out.println("La suma de los número pares es: " + sumaPares);
        System.out.println("El producto de los número impares es: " + productoImpares);
    }
}
