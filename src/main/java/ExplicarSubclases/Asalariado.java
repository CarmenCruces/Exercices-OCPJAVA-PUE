package ExplicarSubclases;

public class Asalariado extends Persona {
    private double sueldo;

    public Asalariado(String dni, String nombre, String apellido, double sueldo) {
        super(dni, nombre, apellido);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Asalariado{" +
                "sueldo=" + sueldo +
                '}';
    }
}
