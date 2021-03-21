package controller;

import entity.User;

public class Bank {
    private static User user;

    public static double getUserBalance() {
        return user.getBalance();
    }

    public String setActiveUser(User user) {
        this.user = user;
        return "user update successful";

    }

    public String debitUser(double amount) {
        double newBalance = user.getBalance() - amount;
        this.user.setBalance(newBalance);
        return amount + " euro deducted from your balance";

    }

}
