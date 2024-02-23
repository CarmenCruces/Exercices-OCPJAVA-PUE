package EjerciciosClaseJava;//Escribe un método en Java para obtener la diferencia entre
// los valores mayor y menor de una matriz de enteros.
// La longitud del array debe ser igual o superior a 1.

public class Ejercicio6 {

    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7};
        int resultado = obtenerDiferenciaMaxMin(array);
        System.out.println("Diferencia entre el valor máximo y el valor mínimo: " + resultado);
    }

    // Método para obtener la diferencia entre el valor máximo y el valor mínimo en un array de enteros
    public static int obtenerDiferenciaMaxMin(int[] array) {
        // Verificar que la longitud del array sea al menos 1
        if (array.length < 1) {
            throw new IllegalArgumentException("La longitud del array debe ser igual o superior a 1.");
        }

        // Inicializar variables para el valor máximo y el valor mínimo
        int maximo = array[0];
        int minimo = array[0];

        // Iterar sobre el array para encontrar el valor máximo y el valor mínimo
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            } else if (array[i] < minimo) {
                minimo = array[i];
            }
        }

        // Calcular la diferencia entre el valor máximo y el valor mínimo
        int diferencia = maximo - minimo;

        return diferencia;
    }
}
