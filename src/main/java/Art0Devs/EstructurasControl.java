package Art0Devs;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EstructurasControl {
    public static void main(String[] args) {
       /* boolean isAdult = false;
        if (isAdult){
            System.out.println("Es adulto");
        }else{
            System.out.println("No es adulto");
        }*/

        // si el usuario gana al año mas de 100.000 le damos el prestamo
        // si el usuario esa mayor a 50.000 y menor a 30 años le damos la mitad del prestamo
        // si el usuario es vip le damos la pasta
        // si el usuario no tiene deudas le damos la pasta minima, un 10%

      /*  double salaryPerYear = 10_000;
        int age = 35;
        boolean isVip = false;
        boolean hasDebts = false;

        if (salaryPerYear>= 100000 || isVip) {
            System.out.println("Te damos el prestamo completo");
        }else if (salaryPerYear >= 50000 && age <= 30 || isVip){
            System.out.println("Te damos la mitad del prestamo");
        }else if (!hasDebts){
            System.out.println("Te damos el 10% del prestamo");
        }else{
            System.out.println("Lo sentimos no podemos darte el prestamo");
        }*/

        String productType = "BELLEZA";

        switch (productType) {
            case "SALUD" :
                System.out.println(" El impesto es de 5%");
                break;
            case "BELLEZA" :
                System.out.println(" El impesto es de 10%");
                break;
            case "ALCOHOL" :
                System.out.println(" El impesto es de 20%");
                break;
            case "SAUTOMOVIL" :
                System.out.println(" El impesto es de 30%");
                break;
            default:
                System.out.println("El tipo de producto es desconocido");


        }


    }
    
}
