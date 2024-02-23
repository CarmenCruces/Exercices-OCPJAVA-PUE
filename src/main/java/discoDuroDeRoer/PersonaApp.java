package discoDuroDeRoer;

import java.util.Scanner;

//Ahora, crea una clase ejecutable que haga lo siguiente:

//Pide por teclado el nombre, la edad, sexo, peso y altura.

//Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado,
// el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto,
// para este último utiliza los métodos set para darle a los atributos un valor.
//Para cada objeto, deberá comprobar si esta en su peso ideal,
// tiene sobrepeso o por debajo de su peso ideal con un mensaje.
//Indicar para cada objeto si es mayor de edad.
//Por último, mostrar la información de cada objeto.
//Puedes usar métodos en la clase ejecutable, para que os sea mas fácil.
public class PersonaApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado
        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Introduce el sexo (H/M):");
        char sexo = scanner.nextLine().charAt(0);

        System.out.println("Introduce el peso:");
        double peso = scanner.nextDouble();

        System.out.println("Introduce la altura:");
        double altura = scanner.nextDouble();

        // Crear objeto Persona 1 con todos los datos introducidos
        Persona2 persona1 = new Persona2();
        persona1.setNombre(nombre);
        persona1.setEdad(edad);
        persona1.setSexo(sexo);
        persona1.setPeso(peso);
        persona1.setAltura(altura);

        // Crear objeto Persona 2 con nombre, edad, sexo, y valores predeterminados para peso y altura
        Persona2 persona2 = new Persona2(nombre, edad, sexo, peso, altura);

        // Crear objeto Persona 3 con valores predeterminados
        Persona2 persona3 = new Persona2();

        // Mostrar información y resultados
        System.out.println("Persona 1:");
        mostrarResultado(persona1);

        System.out.println("\nPersona 2:");
        mostrarResultado(persona2);

        System.out.println("\nPersona 3:");
        mostrarResultado(persona3);
    }

    private static void mostrarResultado(Persona2 persona) {
        switch (persona.calcularIMC()) {
            case -1:
                System.out.println("Está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("Está en su peso ideal.");
                break;
            case 1:
                System.out.println("Tiene sobrepeso.");
                break;
        }

        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        System.out.println(persona.toString());
    }
}

