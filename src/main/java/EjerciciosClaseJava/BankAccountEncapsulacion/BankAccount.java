package EjerciciosClaseJava.BankAccountEncapsulacion;

public class BankAccount {

    private final String accountNumber;
    public double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Negative inital Balance");
        }
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
        if(amount >0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount < 0){
            throw new IllegalArgumentException("Negative Amount");
        }
        if (balance < amount){
            throw new IllegalArgumentException("There is not enough funds");
        }
        this.balance -= amount;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
