package entity;

public class User {

    public String accountNumber;
    public String name;
    public String gender;
    private double balance;

    public User(String accountNumber, double balance, String name, String gender) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.gender = gender;


    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
