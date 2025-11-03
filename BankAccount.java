package com.codegnan.oopexamples;

import java.util.Scanner;

public class BankAccount {
	private String accountHolder;
    private String accountNumber;
    private double balance;
    Scanner sc = new Scanner(System.in);
    
    public void createAccount() {
        System.out.print("Enter account holder name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter account number: ");
        accountNumber = sc.nextLine();
        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();
    }
    public void deposit() {
    	System.out.println("Enter amount to deposit:");
    	double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw() {
    	System.out.println("Enter amount to withdraw:");
    	double amount = sc.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public void displayAccountInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
