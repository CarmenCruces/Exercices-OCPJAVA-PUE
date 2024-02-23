package EjerciciosClaseJava;

public class EstadisticasArrayNumeros {
    public static void main(String[] args) {

        //declarar e inicializar array de números
        int [] numeros = {5,8,65,2,47,23};
       /* int [] numeros = new int[x];

        numeros[0] = 5;*/

        //declarar e inicializar variables para las estadísticas
        int total = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        //calcular la suma de los números usando un bucle for convencional
        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }

        //imprimir la suma de los números usando un bucle forEach
        System.out.println("La suma de los numeros del array es " + total);

        //Encontrar el mayor y el menor utilizando un bucle for convencional
        int totalforEach = 0;
        for ( int x : numeros) {
            totalforEach += x;
        }
        System.out.println( "La suma de los numeros del array es " + totalforEach);

        // Encontrar el mayor y el menor utilizando un bucle for convencional
        for (int i = 0; i < numeros.length; i++) {
           if (numeros[i]>mayor){
               mayor=numeros[i];
           }
           if(numeros[i]<menor){
               menor=numeros[i];
           }
        }

        //Imprimir el mayor y el menor.
        System.out.println("mayor" + mayor);
        System.out.println("menor" + menor);
    }

}
