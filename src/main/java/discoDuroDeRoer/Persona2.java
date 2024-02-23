package discoDuroDeRoer;

import java.util.Random;

public class Persona2 {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    private static final char SEXO_DEF = 'H';
    private static final int BAJO_PESO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBRE_PESO = -1;

    //CONSTRUCTOR POR DEFECTO
    public Persona2() {
        this("", 0, SEXO_DEF, 0, 0);
    }

    public Persona2(String nombre, int edad, char sexo) {
        this(nombre, edad, SEXO_DEF, 0, 0);
    }

    public Persona2(String nombre, int edad, char sexo,
                    double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        //this.dni = generaDNI();
        this.sexo = SEXO_DEF;
        this.peso = peso;
        this.altura = altura;
    }

    //calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)),
    // si esta fórmula devuelve un valor menor que 20, la función devuelve un -1,
    // si devuelve un número entre 20 y 25 (incluidos),
    // significa que esta por debajo de su peso ideal la función devuelve un 0
    // y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
    // la función devuelve un 1.
    // Te recomiendo que uses constantes para devolver estos valores.
    public int calcularIMC() {

        double imc = peso / (Math.pow(altura, 2));
        if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else if (imc < 20) {
            return BAJO_PESO;
        } else {
            return SOBRE_PESO;
        }
    }

    public boolean esMayorDeEdad() {
        //indica si es mayor de edad, devuelve un booleano
     return edad >= 18;
    }

    // comprueba que el sexo introducido es correcto.
    // Si no es correcto, sera H. No sera visible al exterior.
    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEF;
        }else {
            this.sexo = sexo;
        }
    }

    //genera un número aleatorio de 8 cifras,
    // genera a partir de este su número su letra correspondiente.
    // Este método sera invocado cuando se construya el objeto.
    // Puedes dividir el método para que te sea más fácil.
    // No será visible al exterior
    private String generaDNI() {
        Random random = new Random();
        StringBuilder dni = new StringBuilder();

        // Generar número aleatorio de 8 cifras
        for (int i = 0; i < 8; i++) {
            dni.append(random.nextInt(10));
        }
        // Generar letra correspondiente
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indiceLetra = Integer.parseInt(dni.toString()) % 23;
        dni.append(letras.charAt(indiceLetra));

        return dni.toString();
    }


    //Métodos set de cada parámetro, excepto de DNI
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

/*    public String getDni() {
        return dni;
    }*/
}



//nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.