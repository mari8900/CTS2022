package ro.ase.cts.g1099.assignment2.main;

import ro.ase.cts.g1099.assignment2.Account;
import ro.ase.cts.g1099.assignment2.classes.BankAccountType;
import ro.ase.cts.g1099.assignment2.classes.Loan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(new Loan(1000, 0.3), 1, BankAccountType.PREMIUM);
		System.out.println(account.to_string());
		System.out.println("---------------------------------------------");
		System.out.println(account.toString());
	}

}
