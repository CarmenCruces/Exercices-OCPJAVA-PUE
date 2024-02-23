package ExercicesInterfaceComparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainJugadorComparable {
    public static void main(String[] args) {

        // Crear una lista de jugadores
        List<JugadorComparable> jugadores = new ArrayList<>();

        // Agregar jugadores a la lista
        jugadores.add(new JugadorComparable("Nombre1", "Apellido1",
                LocalDate.of(1990, 1, 1),
                JugadorComparable.Posicion.Alero, 1.80, 120, 50));
        jugadores.add(new JugadorComparable("Nombre2", "Apellido2",
                LocalDate.of(1995, 5, 5),
                JugadorComparable.Posicion.Pivot, 2.00, 150, 80));
        jugadores.add(new JugadorComparable("Nombre3", "Apellido3",
                LocalDate.of(1992, 8, 15),
                JugadorComparable.Posicion.Base, 1.75, 100, 30));

        // Ordenar la lista de jugadores por la cantidad de canastas
        // o por lo que yo le haya puesto en el metodo compareTo
        Collections.sort(jugadores);

        // Imprimir la lista ordenada
        for (JugadorComparable jugador : jugadores) {
            jugador.mostrarInfo();
            System.out.println("--------");
        }
    }
}
