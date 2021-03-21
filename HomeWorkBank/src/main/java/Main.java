import controller.Bank;
import entity.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("8888888888", 50.00, "Baiba", "Female");
        Bank bank = new Bank();
        bank.setActiveUser(user);

        Scanner scanner = new Scanner(System.in);
        String PIN = "";
        System.out.println("Please enter your PIN");
        while (!PIN.equals("8888")) {
            PIN = scanner.next().trim();
            if (PIN.equals("8888")) {
                break;
            } else {
                System.out.println("Incorrect, please try again.");
            }
        }
        System.out.println("PIN is correct!");
        System.out.println("Welcome to your account!");

        Scanner input = new Scanner(System.in);
        String activitySee = "";

        System.out.println("Would you wish to:");
        System.out.println(" - see your balance");
        System.out.println(" - add");
        System.out.println(" - withdraw");

        activitySee = input.next();
        if (activitySee.equals("see")) {
            System.out.println("Current balance is " + bank.getUserBalance());
        }

        String activityAdd = input.next();
        if (activityAdd.equals("add")) {
            System.out.println("Type the sum you wish to add");


            int AddMoney = input.nextInt();
            if (AddMoney != 0) ;
            {
                System.out.println(AddMoney + " euros added to your account");
                System.out.println("Current balance is: " + (AddMoney + user.getBalance()));
            }


            String activityWithdraw = input.next();
            if (activityWithdraw.equals("withdraw")) {
                System.out.println("Type the sum you wish to withdraw");


                int WithdrawMoney = input.nextInt();
                if (((WithdrawMoney <= (AddMoney + user.getBalance())))) {
                    System.out.println("Current balance is: " + ((AddMoney + user.getBalance()) - WithdrawMoney));
                } else {
                    System.out.println("Not enough money");
                }

            }
        }
    }
}




















