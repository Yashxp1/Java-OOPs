package OOPs;

//Create a BankAccount class with attributes accountNumber, balance, and accountHolder.
//
//Add a constructor to initialize these fields.
//Implement methods to deposit and withdraw money.
//Ensure balance doesn’t go negative on withdrawal.
//Create an object and perform some operations.

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    int balance;
    String accountHolder;

    BankAccount(int accountNumber, int balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    void deposit(Scanner sc) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount that you would like to deposit ($): ");
        int amount = sc.nextInt();

        if (balance <= 0) {
            System.out.println("Please enter a valid amount");
        } else {
            balance += amount;
            System.out.println("$" + amount + " has been deposited successfully.");
            System.out.println("Updated Balance: $" + balance);
        }

    }

    void withdraw(Scanner sc) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Your current balance is: $" + balance);
        System.out.println("Enter the amount that you would like to withdraw: ");
        int withdrawalAmount = sc.nextInt();

        if (withdrawalAmount > balance) {
            System.out.println("You don't have enough funds to withdraw: ");
        } else {
            balance -= withdrawalAmount;
            System.out.println("You have successfully withdrawn $" + withdrawalAmount);
            System.out.println("Remaining Balance: $" + balance);
        }
    }
}


public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount user1 = new BankAccount(1234, 5000, "Raman");
        user1.deposit(sc);
        user1.withdraw(sc);

        sc.close();
    }
}
