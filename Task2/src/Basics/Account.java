package Basics;

import java.util.Scanner;

public class Account {
    private double balance;

    // Constructor without arguments
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with initial balance
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit the amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Please deposit a positive amount.");
        }
    }

    // Method to withdraw the amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        boolean quit = true;
        while (quit) {
            System.out.println("\nEnter 1: Deposit");
            System.out.println("Enter 2: Withdraw");
            System.out.println("Enter 3: Check Balance");
            System.out.println("Enter 4: Quit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    quit = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
    }
}
/*Enter 1: Deposit
Enter 2: Withdraw
Enter 3: Check Balance
Enter 4: Quit
1
Enter amount to deposit: 90000
Amount 90000.0 deposited successfully.

Enter 1: Deposit
Enter 2: Withdraw
Enter 3: Check Balance
Enter 4: Quit
2
Enter amount to withdraw: 50000
Amount 50000.0 withdrawn successfully.

Enter 1: Deposit
Enter 2: Withdraw
Enter 3: Check Balance
Enter 4: Quit
3
Current balance: 40000.0

Enter 1: Deposit
Enter 2: Withdraw
Enter 3: Check Balance
Enter 4: Quit
4
*/
