package Baloncesto;

import java.time.LocalDateTime;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private int puntosLocal;
    private int puntosVisitante;
    private String localidad;

 /*   public Partido(Equipo equipoLocal, Equipo equipoVisitante, LocalDateTime fechaInicio,
                   LocalDateTime fechaFin, int puntosLocal, int puntosVisitante,
                   String localidad) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
        this.localidad = localidad;
    }*/

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, String localidad) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.localidad = localidad;
    }

    public void iniciarPartido(){ fechaInicio = LocalDateTime.now();
    }
    public void finalizarPartido(){
        fechaFin = LocalDateTime.now();
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public void setPuntosLocal(int puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public int getPuntosVisitante() {
        return puntosVisitante;
    }

    public void setPuntosVisitante(int puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

   /* @Override
    public String toString() {
        return "Partido{" +
                "equipoLocal=" + equipoLocal + "\n" +
                ", equipoVisitante=" + equipoVisitante + "\n" +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", puntosLocal=" + puntosLocal +
                ", puntosVisitante=" + puntosVisitante +
                ", localidad='" + localidad + '\'' +
                '}';
    }*/

    @Override
    public String toString() {
        return "Partido{" +
                "equipoLocal=" + equipoLocal +
                ", equipoVisitante=" + equipoVisitante +
                ", puntosLocal=" + puntosLocal +
                ", puntosVisitante=" + puntosVisitante +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
