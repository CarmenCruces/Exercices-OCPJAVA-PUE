package EjerciciosClaseJava.BankAccountEncapsulacion;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount cuentaCarmen = new BankAccount("a", 3000000);
        System.out.println(cuentaCarmen);

        BankAccount cuentaNando = new BankAccount("b", 200000);
        System.out.println(cuentaNando);


        cuentaCarmen.withdraw(500);
        System.out.println(cuentaCarmen);

        cuentaNando.deposit(1200);
        System.out.println(cuentaNando);


    }
}
