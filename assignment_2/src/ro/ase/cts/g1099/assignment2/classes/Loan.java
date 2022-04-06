package ro.ase.cts.g1099.assignment2.classes;

import ro.ase.cts.g1099.assignment2.exceptions.InvalidInputValueException;
import ro.ase.cts.g1099.assignment2.interfaces.MonthlyRate;

public class Loan implements MonthlyRate {
	double loanValue;
	double bankRate;
	
	public Loan() {
		
	}

	public Loan(double loanValue, double bankRate) {
		if(loanValue <= 0) {
			throw new InvalidInputValueException("Loan value cannot be smaller or equal to 0");
		}
		this.loanValue = loanValue;
		this.bankRate = bankRate;
	}

	public double getLoanValue() {
		return loanValue;
	}

	public void setLoanValue(double loanValue) {
		if(loanValue <= 0) {
			throw new InvalidInputValueException("Loan value cannot be smaller or equal to 0");
		}
		this.loanValue = loanValue;
	}

	public double getBankRate() {
		return bankRate;
	}

	public void setBankRate(double bankRate) {
		this.bankRate = bankRate;
	}

	@Override
	public String toString() {
		return "loan that has a value of " + this.loanValue + " at a bank rate of " + this.bankRate;
	}

	@Override
	public double getMonthlyRate() {
		return loanValue * bankRate;
	}

	
}
