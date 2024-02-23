package EjercicioInicialJugadorBaloncesto;

import java.time.LocalDate;

//Enum para las posiciones en el equipo, puedo usarlo fuera
// o encapsulado dentro del objeto
enum Posicion {
    Alero,
    Pivot,
    Base,
    Escolta,
    AlaPivot
}
public class Jugador {
    private String nombre;
    private String apellido;
    private LocalDate fNacimiento;
    private Posicion posicion;
    private double altura;
    private int canastas;
    private int rebotes;

    public Jugador(String nombre, String apellido, LocalDate fNacimiento, Posicion posicion,
                   double altura, int canastas, int rebotes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.posicion = posicion;
        this.altura = altura;
        this.canastas = canastas;
        this.rebotes = rebotes;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Fecha de Nacimiento: " + fNacimiento);
        System.out.println("Posición: " + posicion);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Canastas: " + canastas);
        System.out.println("Rebotes: " + rebotes);
        //System.out.println(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - fNacimiento.getYear();
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fNacimiento=" + fNacimiento +
                ", posicion=" + posicion +
                ", altura=" + altura +
                ", canastas=" + canastas +
                ", rebotes=" + rebotes +
                '}';
    }

}
