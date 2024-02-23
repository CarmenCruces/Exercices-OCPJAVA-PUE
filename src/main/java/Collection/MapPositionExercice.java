package Collection;

import Baloncesto.JugadorBaloncesto;
import Baloncesto.Posicion;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class MapPositionExercice {
    public static void main(String[] args) {

        // Creamos algunos jugadores

        List<JugadorBaloncesto> jugadores = List.of(
                new JugadorBaloncesto("Carlos", "García", LocalDate.of(1990, 5, 15),
                        Posicion.BASE, 1.85, 50, 30),
                new JugadorBaloncesto("Ana", "Martínez", LocalDate.of(1995, 9, 20),
                        Posicion.ESCOLTA, 1.75, 40, 25),
                new JugadorBaloncesto("Laura", "López", LocalDate.of(1988, 12, 10),
                        Posicion.ALERO, 1.80, 60, 40),
                new JugadorBaloncesto("Pedro", "Sánchez", LocalDate.of(1992, 8, 25),
                        Posicion.BASE, 1.78, 45, 20),
                new JugadorBaloncesto("Sara", "González", LocalDate.of(1997, 4, 5),
                        Posicion.ESCOLTA, 1.70, 35, 15),
                new JugadorBaloncesto("David", "Rodríguez", LocalDate.of(1993, 11, 18),
                        Posicion.ALERO, 1.85, 55, 35),
                new JugadorBaloncesto("Carmen", "Fernández", LocalDate.of(1985, 6, 30),
                        Posicion.ALERO, 1.82, 65, 45),
                new JugadorBaloncesto("Manuel", "Martínez", LocalDate.of(1991, 3, 12),
                        Posicion.BASE, 1.80, 48, 22),
                new JugadorBaloncesto("Elena", "Díaz", LocalDate.of(1994, 7, 8),
                        Posicion.ALA_PIVOT, 1.90, 60, 40),
                new JugadorBaloncesto("Juan", "López", LocalDate.of(1989, 10, 3),
                        Posicion.PIVOT, 1.95, 70, 50),
                new JugadorBaloncesto("María", "Gómez", LocalDate.of(1996, 2, 14),
                        Posicion.BASE, 1.79, 47, 21),
                new JugadorBaloncesto("Miguel", "Pérez", LocalDate.of(1990, 9, 28),
                        Posicion.ESCOLTA, 1.77, 42, 18),
                new JugadorBaloncesto("Isabel", "Sánchez", LocalDate.of(1987, 12, 5),
                        Posicion.PIVOT, 1.93, 68, 48)
        );

        var map = clasificaJugadores(jugadores);
        System.out.println(map);


        // Creamos un mapa para almacenar a los jugadores por posición
        Map<Posicion, List<JugadorBaloncesto>> jugadoresPorPosicion = new HashMap<>();

        // Agregamos los jugadores al mapa
        for (JugadorBaloncesto jugador : jugadores) {
            agregarJugadorPorPosicion(jugadoresPorPosicion, jugador);
        }

        // Ejemplo de cómo obtener los jugadores de una posición específica (por ejemplo, BASE)
        List<JugadorBaloncesto> jugadoresBase = jugadoresPorPosicion.get(Posicion.BASE);
        System.out.println("Jugadores (eligiéndolos por posición) en la posición Base:");
        for (JugadorBaloncesto jugador : jugadoresBase) {
            System.out.println(jugador.getNombre());
        }

        // Imprimimos todos los jugadores ordenados por posición
        for (Posicion posicion:Posicion.values())

        {
            List<JugadorBaloncesto> jugadoresEnPosicion = jugadoresPorPosicion.get(posicion);
            if (jugadoresEnPosicion != null) {
                System.out.println("Jugadores en la posición " + posicion + ":");
                for (JugadorBaloncesto jugador : jugadoresEnPosicion) {
                    System.out.println(jugador.getNombre());
                }
            }
        }
    }

    // Método para agregar un jugador al mapa por su posición
    public static void agregarJugadorPorPosicion(Map<Posicion, List<JugadorBaloncesto>> jugadoresPorPosicion, JugadorBaloncesto jugador) {
        // Obtenemos la posición del jugador
        Posicion posicion = jugador.getPosicion();
        // Si no existe una lista para esa posición, la creamos
        jugadoresPorPosicion.putIfAbsent(posicion, new ArrayList<>());
        // Agregamos al jugador a la lista correspondiente
        jugadoresPorPosicion.get(posicion).add(jugador);
    }

    public static Map<Posicion, List<JugadorBaloncesto>>  clasificaJugadores (List<JugadorBaloncesto>  jugadores){

      /*  Map<Posicion, List<JugadorBaloncesto>> jugadoresPorPosicion = new HashMap<>();

        for (JugadorBaloncesto jugador : jugadores) {
            Posicion posicion = jugador.getPosicion();
            // Si no existe una lista para esa posición, la creamos
            if (!jugadoresPorPosicion.containsKey(posicion)) {
                jugadoresPorPosicion.put(posicion, new ArrayList<>());
            }
            // Agregamos al jugador a la lista correspondiente
            jugadoresPorPosicion.get(posicion).add(jugador);

        }
        return jugadoresPorPosicion;*/

        return jugadores.stream().collect(groupingBy(JugadorBaloncesto::getPosicion));

    }


}

