package EjerciciosClaseJava;

public class FactorialWhile {
    public static void main(String[] args) {
        int x = 4;
        int factorial = 1;
        int i = 0;

        while (i <= x) {
            System.out.println("La i = " + i);
            System.out.println("El factorial actual= " + factorial);

            factorial = factorial * i;

            System.out.println("El factorial actualizado es =" + factorial);

            i++;
        }
    }
}
