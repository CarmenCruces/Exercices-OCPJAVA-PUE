
package ExercicesInterfaceComparable;

import java.time.LocalDate;

public class JugadorComparable implements Comparable<JugadorComparable> {

    // Enum para las posiciones en el equipo, puedo usarlo fuera
    // o encapsulado dentro del objeto
    enum Posicion {
        Alero,
        Pivot,
        Base,
        Escolta,
        AlaPivot
    }

    private String nombre;
    private String apellido;
    private LocalDate fNacimiento;
    private Posicion posicion;
    private double altura;
    private int canastas;
    private int rebotes;

    // Constructor
    public JugadorComparable(String nombre, String apellido, LocalDate fNacimiento, Posicion posicion,
                             double altura, int canastas, int rebotes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.posicion = posicion;
        this.altura = altura;
        this.canastas = canastas;
        this.rebotes = rebotes;
    }

    @Override
    public int compareTo(JugadorComparable otroJugador) {
        // -----Comparar por la cantidad de canastas
        return Integer.compare(this.canastas, otroJugador.canastas);
        // -----Comparar por la cantidad de rebotes
        //return Integer.compare(this.rebotes, otroJugador.rebotes);
        // -----Comparar por la altura
        //return Double.compare(this.altura, otroJugador.altura);
        // -----Comparar por la fecha de nacimiento
        //return this.getfNacimiento().compareTo(otroJugador.getfNacimiento());
        //------Comparar por la edad
        //return Integer.compare(this.getEdad(), otroJugador.getEdad());
        //------Comparar por el apellido........ ESTO NO LO ENTIENDO
        //return CharSequence.compare(this.apellido, otroJugador.apellido);

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

        // Getters y Setters
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

