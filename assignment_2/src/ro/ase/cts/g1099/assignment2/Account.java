package ro.ase.cts.g1099.assignment2;

import ro.ase.cts.g1099.assignment2.classes.BankAccountType;
import ro.ase.cts.g1099.assignment2.classes.Loan;
import ro.ase.cts.g1099.assignment2.exceptions.InvalidInputValueException;
import ro.ase.cts.g1099.assignment2.interfaces.MonthlyRate;

public class Account implements MonthlyRate {
	
	Loan loan;	
	public int daysActivePerYear;
	BankAccountType bankAccountType;
	
	public Account(Loan loan, int daysActive, BankAccountType bankAccountType)  {
		if(daysActive < 1) {
			throw new InvalidInputValueException("Account must be active for at least 1 day");
		}
		this.setLoan(loan);
		this.daysActivePerYear = daysActive;
		this.bankAccountType = bankAccountType;
	}
	
	public void setLoan(Loan loan) {
        if(loan == null) {
            this.loan = new Loan();
        } else {
            this.loan = loan;
        }
    }
	
	public double getAccountLoanValue() {
		return loan.getLoanValue();
	}
	
	public double getAccountRate() {
		return loan.getBankRate();
	}
		
	public void print() {
		int vb = 10;
		System.out.println("This is an account");
	}

	public static double determineInterest(Account[] accounts)
	{
		double interest = 0.0;
		Account	account;
		int timePeriod = 365;
		double brokerFee = 0.0125;
		
		for	(int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if(account.bankAccountType == BankAccountType.PREMIUM || account.bankAccountType == BankAccountType.SUPER_PREMIUM)	
			
				interest += brokerFee *	(account.getAccountLoanValue() * Math.pow
						(account.getAccountRate(), (account.daysActivePerYear / timePeriod)) - account.getAccountLoanValue());	//	interest-principal
		}
		return	interest;
	}

	@Override
	public String toString() {
		return "This account took a " + loan + ", number of active days is " + daysActivePerYear + ", and the bank account type is "
				+ bankAccountType;
	}

	@Override
	public double getMonthlyRate() {
		return loan.getLoanValue() * loan.getBankRate();
	}

	
}
