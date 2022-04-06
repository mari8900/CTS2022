package ro.ase.cts.g1099.assignment2.main;

import ro.ase.cts.g1099.assignment2.Account;
import ro.ase.cts.g1099.assignment2.classes.BankAccountType;
import ro.ase.cts.g1099.assignment2.classes.Loan;

public class Main {

	public static void main(String[] args) {
		Account account = new Account(new Loan(1000, 0.3), 1, BankAccountType.PREMIUM);
		System.out.println(account.toString());
		
		Account account2 = new Account(new Loan(3000, 0.2), 10, BankAccountType.BUDGET);
		System.out.println(account2.toString());
		
		Account account3 = new Account(new Loan(2500, 0.25), 19, BankAccountType.STANDARD);
		
		Account[] accountsVector = new Account[] {account, account2};
		
	}

}
