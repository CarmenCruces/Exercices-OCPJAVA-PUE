package Art0Devs;

import java.math.BigDecimal;

public class Bucles {
 /*   public static void main(String[] args) {

        double number = 5.0;
        for (int i = 0; i < 10; i++) {
            number = number * number;
            System.out.println("el resultado es : " + number);
        }
    }*/

    //si el numero se sale de madre se usan librerias para
 public static void main(String[] args) {
     BigDecimal number = new BigDecimal("5.0");
     BigDecimal multiplicador = new BigDecimal("5.0");

     for (int i = 0; i < 10; i++) {
         number = number.multiply(multiplicador);
         System.out.println("el resultado es : " + number);
     }
 }
}
