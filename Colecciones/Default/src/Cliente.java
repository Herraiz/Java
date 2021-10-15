public class Cliente {

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

    public Cliente(String name, String accountName, double balance) {

        this.name = name;
        this.accountName = accountName;
        this.balance = balance;



    }

    private String name;
    private String accountName;
    private double balance;

}