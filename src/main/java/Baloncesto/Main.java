package Baloncesto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        JugadorBaloncesto ana = new JugadorBaloncesto("Ana",
                LocalDate.of(2002,7,5), Posicion.ALERO);

        JugadorBaloncesto adrian = new JugadorBaloncesto("Adrian",
                LocalDate.of(1999,7,5), Posicion.BASE);


        List<JugadorBaloncesto> jugadoresZaragoza = new ArrayList<>();
        List<JugadorBaloncesto> jugadoresRiosa = new ArrayList<>();

        jugadoresZaragoza.add(ana);
        jugadoresRiosa.add(adrian);

        Equipo zaragoza = new Equipo("Zaragoza Basket", "Zaragoza", jugadoresZaragoza);
        Equipo riosa = new Equipo("Riosa Basket", "Riosa", jugadoresRiosa);

        System.out.println(zaragoza);
        System.out.println(riosa);

        System.out.println("-------------------------------------------");

        Partido partido1 = new Partido(zaragoza, riosa, zaragoza.getLocalidad());

        partido1.setPuntosLocal(100);
        partido1.setPuntosVisitante(200);
        partido1.finalizarPartido();

        System.out.println(partido1);

        Partido partido2 = new Partido(riosa,zaragoza, riosa.getLocalidad());

        partido2.setPuntosLocal(90);
        partido2.setPuntosVisitante(80);
        partido2.finalizarPartido();

        System.out.println(partido2);

    }
}
