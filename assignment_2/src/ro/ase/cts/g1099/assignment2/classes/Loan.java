package ro.ase.cts.g1099.assignment2.classes;

public class Loan {
	double loanValue;
	double bankRate;
	
	public Loan() {
		
	}

	public Loan(double loanValue, double bankRate) {
		this.loanValue = loanValue;
		this.bankRate = bankRate;
	}

	public double getLoanValue() {
		return loanValue;
	}

	public void setLoanValue(double loanValue) {
		this.loanValue = loanValue;
	}

	public double getBankRate() {
		return bankRate;
	}

	public void setBankRate(double bankRate) {
		this.bankRate = bankRate;
	}
	
	public double getMonthlyRate() {
		return loanValue * bankRate;
	}
}
