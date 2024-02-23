package EjerciciosClaseJava;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Variables preestablecidas
        double x = 2;  // Puedes asignar cualquier valor deseado a x
        double y = 5;  // Puedes asignar cualquier valor deseado a y

        // Llamada al método para resolver la expresión
        double resultado = resolverExpresion(x, y);

        // Imprimir el resultado
        System.out.println("El resultado de la expresión es: " + resultado);
    }

    // Método para resolver la expresión matemática
    public static double resolverExpresion(double x, double y) {
        // Calcular la expresión según la fórmula proporcionada
        double resultado = Math.pow(x, 2) + Math.pow((4 * y / 5 - x), 2);

        return resultado;
    }

}
