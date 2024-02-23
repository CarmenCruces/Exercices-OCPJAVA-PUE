package Baloncesto;

import java.time.LocalDate;
import java.util.List;

public class Equipo {
    private String nombre;
    private String localidad;
    private String pais;
    private LocalDate fechaFundacion;
    private int numJugadores;
    private List<JugadorBaloncesto> jugadores;
    private String entrenador;
    private String patrocinador;

 /*   public Equipo(String nombre, String localidad, String pais,
                  LocalDate fechaFundacion, int numJugadores,
                  List<Jugador> jugadores, String entrenador, String patrocinador) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.pais = pais;
        this.fechaFundacion = fechaFundacion;
        this.numJugadores = numJugadores;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
        this.patrocinador = patrocinador;
    }*/

    public Equipo(String nombre, String localidad, List<JugadorBaloncesto> jugadores) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getPais() {
        return pais;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }
    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public List<JugadorBaloncesto> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<JugadorBaloncesto> jugadores) {
        this.jugadores = jugadores;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    //PRUEBAS
    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", jugadores=" + jugadores +
                '}';
    }

    /* @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", pais='" + pais + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                ", numJugadores=" + numJugadores +
                ", jugadores=" + jugadores +
                ", entrenador='" + entrenador + '\'' +
                ", patrocinador='" + patrocinador + '\'' +
                '}';
    }*/
}