package discoDuroDeRoer;

public class CuentaApp {
    public static void main(String[] args) {

        Cuenta1 cuenta1 = new Cuenta1("Carmen");
        Cuenta1 cuenta2 = new Cuenta1("Paloma", 1000);

        cuenta1.ingresar(5000);
        cuenta2.ingresar(3000);
        System.out.println("La cuenta de " + cuenta1.getTitular() + " tiene en saldo " + cuenta1.getCantidad());
        System.out.println("La cuenta de " + cuenta2.getTitular() + " tiene en saldo " + cuenta2.getCantidad());

        cuenta1.retirar(2);
        cuenta2.retirar(1.25);

        System.out.println("La cuenta de " + cuenta1.getTitular() + " tiene en saldo " + cuenta1.getCantidad());
        System.out.println("La cuenta de " + cuenta2.getTitular() + " tiene en saldo " + cuenta2.getCantidad());

    }
}
