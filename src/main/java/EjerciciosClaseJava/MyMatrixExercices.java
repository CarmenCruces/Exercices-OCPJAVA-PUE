package EjerciciosClaseJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//https://www.tutorjoes.in/java_programming_tutorial/array_exercise_programs_in_java
public class MyMatrixExercices {
    public static void main(String[] args) {

        System.out.println(" 1------------------------------------------------------------ascending");
        int[] array1 = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
        System.out.println("Array1 origin : " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Array1 sorted : " + Arrays.toString(array1));

        System.out.println(" 2-----------------------------------------------------------descending");
        Integer[] array2 = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
        System.out.println("Array2 origin : " + Arrays.toString(array2));
        Arrays.sort(array2, Collections.reverseOrder());
        System.out.println("Array2 reverse sorted : " + Arrays.toString(array2));

        System.out.println(" 3------------------------------------------------------------------sum");
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array3 origin : " + Arrays.toString(array3));
        int sum = 0;
            for (int i = 0; i < array3.length; i++) {
                sum += array3[i];
            }
        System.out.println("Sum Array3 = " + sum);

        System.out.println(" 4------------------------------------------------------sum and average");
        int[] array4 = {1, 2, 3, 4, 5};
        System.out.println("Array4 origin : " + Arrays.toString(array4));
        int sum4 = 0;
            for (int i = 0; i < array4.length ; i++) {
            sum4 += array4[i];
        }
        System.out.println("Sum Array4 = " + sum4);

            double average = (double)sum4 / array4.length;
        System.out.println("Average Array4 = " + average);

        System.out.println(" 5-------------------------------store elements in an array and print it");
        int array5 = 5;
        int[] a = new int[array5];
        a[0] = 5;
        a[1] = 11;
        a[2] = 22;
        a[3] = 33;
        a[4] = 44;

        System.out.println("Array Elements : ");
        for (int i = 0; i < array5; i++) {
            System.out.println(a[i]);
        }

        System.out.println(" 5--OOPPSSS--REPEAT--store with scanner elements in an array and print it");
        int array5b = 5;
        Scanner scanner = new Scanner(System.in);
        int[] element = new int[array5b];
        for (int i = 0; i < array5b; i++) {
            System.out.println("Enter the element from Array5b[" + i + "] : " );
            element[i] = scanner.nextInt();
        }
        //scanner.close();....commented for use in the following exercise.
        System.out.println("Array Elements : ");
        for (int i = 0; i < array5; i++) {
            System.out.println(element[i]);
        }

        System.out.println(" 6-----------------------------in to array size to be user input print it");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array6 = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter the element from Array6[" + i + "] : " );
            array6[i] = scanner.nextInt();
        }
        //scanner.close();....commented for use in the following exercise.
        System.out.println("Array Elements : ");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(array6[i]);
        }

        System.out.println(" 7----------------------------------------sum of all elements of the array");
        int sum7 = 0;
        for (int i = 0; i < arraySize; i++) {
            sum7 += array6[i];
        }
        System.out.println("The sum of the elements of the array is: " + sum7);

        System.out.println(" 8---to read n number of values in an array and display it in reverse order");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize2 = scanner.nextInt();
        Integer[] array8 = new Integer[arraySize2];

        for (int i = 0; i < arraySize2; i++) {
            System.out.println("Enter the element from Array8[" + i + "] : " );
            array8[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(array8, Collections.reverseOrder());
        System.out.println("Array8 everse sorted : " );
        for (int i = 0; i < arraySize2; i++) {
            System.out.println(array8[i]);
        }

        System.out.println(" 9--------------------------------to array elements to print cubic values");
        System.out.println("Cubic Array elements = ");
        for (int i = 0; i < arraySize2; i++) {
            int cubic = array8[i] * array8[i] * array8[i];
            System.out.println(" " + cubic);
        }

        System.out.println(" 10-------------------------------maximum and minimum element in an array");
        Integer[] array10 = {23, 4, 32, 5, 75};
        int max = array10[0];
        int min = array10[0];
        for (int i = 0; i < array10.length; i++) {
            if (array10[i] > max) {
                max = array10[i];
            }
            if (array10[i] < min) {
                min = array10[0];
            }
        }
        System.out.println("Maximum Element of Array = " + max);
        System.out.println("Minimun Element of Array = " + min);

        System.out.println(" 11---------------------------------to array elements print all Odd number");
        System.out.println("Odd matrix numbers: ");
        for (int i = 0; i < array10.length; i++) {
            if (array10[i] % 2 != 0) {
                System.out.println(array10[i] + " ");
            }
        }

        System.out.println(" 12---------------------------------to array elements print all Even number");
        System.out.println("Even matrix numbers: ");
        for (int i = 0; i < array10.length ; i++) {
            if (array10[i] % 2 == 0) {
                System.out.println(array10[i] + "");
            }

        }

        System.out.println(" 13-----------------------------to array elements print sum all Even number");
        System.out.println("Even matrix numbers: ");
        int sum1 = 0;
        for (int i = 0; i < array10.length ; i++) {
            if (array10[i] % 2 == 0) {
                System.out.println(array10[i] + "");
                sum1 += array10[i];
            }
        }
        System.out.println( "Sum of even numbers : " + sum1);


        System.out.println(" 14----------------------------to array elements print sum all cubic number");
        System.out.println("Cubic Array elements = ");
        int sum2 = 0;
        for (int i = 0; i < arraySize2; i++) {
            int cubic = array8[i] * array8[i] * array8[i];
            System.out.println(cubic);
            sum2 += cubic;
        }
        System.out.println("Sum of cubic numbers : " + sum2);

    }
}


