import java.util.Objects;

public class Cliente {

    private String name;
    private String accountName;
    private double balance;

    public Cliente(String name, String accountName, double balance) {

        this.name = name;
        this.accountName = accountName;
        this.balance = balance;

    }

    /* Auto  override equals and hashcode */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return accountName.equals(cliente.accountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName);
    }
    /* Auto setters and getters */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}