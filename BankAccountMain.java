package com.codegnan.oopexamples;

public class BankAccountMain {

	public static void main(String[] args) {
		 BankAccount acc1 = new BankAccount();
	        acc1.createAccount();
	        acc1.deposit();
	        acc1.withdraw();
	        acc1.displayAccountInfo();
	     BankAccount acc2 = new BankAccount();
	        acc2.createAccount();
	        acc2.deposit();
	        acc2.withdraw();
	        acc2.displayAccountInfo();
	}

}
