package Baloncesto;

import java.util.List;

public class Liga {
    private List<Equipo> equipos;
    private List<Partido> partidos;

    public Liga(List<Equipo> equipos, List<Partido> partidos) {
        this.equipos = equipos;
        this.partidos = partidos;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "equipos=" + equipos +
                ", partidos=" + partidos +
                '}';
    }
}