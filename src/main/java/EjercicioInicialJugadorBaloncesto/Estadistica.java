package EjercicioInicialJugadorBaloncesto;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Estadistica {
    public static void main(String[] args) {

        // Creando un array de jugadores reales molones
        Jugador[] jugadores = new Jugador[10];

// Inicializar el array con instancias de JugadorDeBaloncesto utilizando el constructor
        jugadores[0] = new Jugador("LeBron", "James", LocalDate.of(1984, 12, 30), Posicion.AlaPivot, 2.06, 105, 80);
        jugadores[1] = new Jugador("Stephen", "Curry", LocalDate.of(2000, 3, 14), Posicion.Base, 1.88, 180, 42);
        jugadores[2] = new Jugador("Kawhi", "Leonard", LocalDate.of(1991, 6, 29), Posicion.Escolta, 2.01, 92, 83);
        jugadores[3] = new Jugador("Elena", "Delle Donne", LocalDate.of(1989, 9, 5), Posicion.Pivot, 1.96, 220, 71);
        jugadores[4] = new Jugador("Anthony", "Davis", LocalDate.of(1993, 3, 11), Posicion.Alero, 2.08, 98, 59);
        jugadores[5] = new Jugador("Luka", "Dončić", LocalDate.of(2005, 2, 28), Posicion.Pivot, 2.01, 121, 49);
        jugadores[6] = new Jugador("Diana", "Taurasi", LocalDate.of(1982, 6, 11), Posicion.Base, 1.83, 99, 35);
        jugadores[7] = new Jugador("Joel", "Embiid", LocalDate.of(1994, 3, 16), Posicion.AlaPivot, 2.13, 124, 55);
        jugadores[8] = new Jugador("Sue", "Bird", LocalDate.of(1980, 10, 16), Posicion.Escolta, 1.75, 86, 48);
        jugadores[9] = new Jugador("Nikola", "Jokić", LocalDate.of(2001, 2, 19), Posicion.Alero, 2.11, 120, 60);

        //Aquí imprimo todos los jugadores...

       /* for (Jugador jugador : jugadores) {
            jugador.mostrarInfo();
            System.out.println("----------------------");
        }*/

        // Lista de 10 jugadores...FUNCIONAL
        Arrays.stream(jugadores).forEach(jugador -> {
            jugador.mostrarInfo();
            System.out.println("----------------------");
        });


        // Filtro 1 jugadores por posicion con igual o mas de 100 canastas.....FUNCIONAL
        List<Jugador> jugadoresFiltrados = Arrays.stream(jugadores)
                .filter(jugador -> jugador.getCanastas() >= 100)
                .sorted(Comparator.comparing(Jugador::getPosicion))
                .collect(Collectors.toList());

        System.out.println("-------------Jugadores filtrados por posición con igual o más de 100 canastas:");
        jugadoresFiltrados.forEach(System.out::println);

        // Filtro 2 aquí se calcula la media de rebotes de todos los pivots.......FUNCIONAL
        double mediaRebotesPivots = Arrays.stream(jugadores)
                .filter(jugador -> jugador.getPosicion() == Posicion.Pivot)
                .mapToInt(Jugador::getRebotes)
                .average()
                .orElse(Double.NaN);

        System.out.println("--------------Media de rebotes de todos los pivots: " + mediaRebotesPivots);

        // Filtro 3 aquí obtengo el top5 de jugadores entre 18 y 23 años.......... FUNCIONAL
        List<Jugador> top5Jugadores = Arrays.stream(jugadores)
                .filter(jugador -> jugador.getEdad() >= 18 && jugador.getEdad() <= 23)
                .sorted(Comparator.comparingInt(Jugador::getCanastas).reversed())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("--------------Top 5 de jugadores que han conseguido más canastas de entre 18 y 23 años:");
        top5Jugadores.forEach(System.out::println);

    }


}



