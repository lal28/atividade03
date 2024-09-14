import java.util.Currency;

public class Santander implements IBank{
    String name;
    String manager;
    String country;
    String address;
    double balance;
    Currency currency;

    public Santander(String name, String manager, String country, String address, double balance, String currencyCode) {
        this.name = name;
        this.manager = manager;
        this.country = country;
        this.address = address;
        this.balance = balance;
        //currency code "BRL"
        this.currency=Currency.getInstance(currencyCode);
    }

    @Override
    public double deposit(double valorDepositado) {
        balance+=valorDepositado;
        return balance;
    }

    @Override
    public boolean withdraw(double valorSacado) {
        if (valorSacado > balance) {
            System.out.println("Insufficient funds!");
            return false;
        }
        else {
            balance-=valorSacado;
            System.out.println("Amount successfully withdrawn.");
            return true;
        }
    }
}
