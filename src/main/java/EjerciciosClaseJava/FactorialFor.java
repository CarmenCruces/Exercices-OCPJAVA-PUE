package EjerciciosClaseJava;

public class FactorialFor {
    public static void main(String[] args) {
        int x = 10;
        int factorial = 1;

        for (int i = 1; i <= x; i++) {
            System.out.println("La i = " + i);
            System.out.println("El factorial actual= " + factorial);

            factorial = factorial * i;

            System.out.println("El factorial actualizado es =" + factorial);
        }
        System.out.println("Factorial al final = " + factorial);
    }
}
