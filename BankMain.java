package com.codegnan.oopexamples;

public class BankMain {

	public static void main(String[] args) {
			BankAccountDetails acc1=new BankAccountDetails();
			acc1.setHolder("Jyothi");
			acc1.setNumber(5678990);
			acc1.setBalance(30000);
			acc1.createAccount();
			acc1.deposit();
			acc1.withDraw();

	}

}
