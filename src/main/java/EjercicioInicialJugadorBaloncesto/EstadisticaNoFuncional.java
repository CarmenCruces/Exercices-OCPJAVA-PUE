package EjercicioInicialJugadorBaloncesto;


import java.time.LocalDate;
import java.util.*;

public class EstadisticaNoFuncional {

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

        for (Jugador jugador : jugadores) {
            jugador.mostrarInfo();
            System.out.println("----------------------");
        }
        List<Jugador> jugadoresFiltrados = filtrarJugadores(Arrays.asList(jugadores));
        System.out.println("Jugadores filtrados:");
        for (Jugador jugador : jugadoresFiltrados) {
            System.out.println(jugador);
        }

        double mediaRebotesPivots = calcularMediaRebotesPivots(Arrays.asList(jugadores));
        System.out.println("Media de rebotes de todos los pivots: " + mediaRebotesPivots);

        List<Jugador> top5Jugadores = obtenerTop5Jugadores(Arrays.asList(jugadores));
        System.out.println("Top 5 de jugadores que han conseguido más canastas de entre 18 y 23 años:");
        for (Jugador jugador : top5Jugadores) {
            System.out.println(jugador);
        }
    }

    public static List<Jugador> filtrarJugadores(List<Jugador> jugadores) {
        List<Jugador> jugadoresFiltrados = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (jugador.getCanastas() >= 100) {
                jugadoresFiltrados.add(jugador);
            }
        }
        Collections.sort(jugadoresFiltrados, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador j1, Jugador j2) {
                return j1.getPosicion().compareTo(j2.getPosicion());
            }
        });

        return jugadoresFiltrados;
    }

    public static double calcularMediaRebotesPivots(List<Jugador> jugadores) {
        int totalRebotes = 0;
        int numPivots = 0;

        for (Jugador jugador : jugadores) {
            if (jugador.getPosicion() == Posicion.Pivot) {
                totalRebotes += jugador.getRebotes();
                numPivots++;
            }
        }

        if (numPivots == 0) {
            return 0;
        } else {
            return (double) totalRebotes / numPivots;
        }
    }

    public static List<Jugador> obtenerTop5Jugadores(List<Jugador> jugadores) {
        List<Jugador> top5Jugadores = new ArrayList<>();

        List<Jugador> jugadoresFiltrados = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (jugador.getEdad() >= 18 && jugador.getEdad() <= 23) {
                jugadoresFiltrados.add(jugador);
            }
        }
        Collections.sort(jugadoresFiltrados, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador j1, Jugador j2) {
                return j2.getCanastas() - j1.getCanastas();
            }
        });

        for (int i = 0; i < 5 && i < jugadoresFiltrados.size(); i++) {
            top5Jugadores.add(jugadoresFiltrados.get(i));
        }

        return top5Jugadores;
    }
}


