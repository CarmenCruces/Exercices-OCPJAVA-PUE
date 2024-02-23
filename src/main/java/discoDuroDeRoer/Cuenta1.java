package discoDuroDeRoer;

public class Cuenta1 {
  private String titular;
  private Double cantidad;

    // Primer constructor (obligatorio)
    public Cuenta1(String titular) {
        this(titular, 0.0);// Valor inicial por defecto
    }

    // Segundo constructor (opcional)
    public Cuenta1(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = (this.cantidad + cantidad);
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = Math.max(0, this.cantidad- cantidad);
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}

