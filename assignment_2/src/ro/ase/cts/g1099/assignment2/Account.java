package ro.ase.cts.g1099.assignment2;

import ro.ase.cts.g1099.assignment2.exceptions.InvalidLoanValueException;

public class Account {
	
	public double	loanValue, bankRate;	
	public int	daysActivePerYear, bankAccountType;
	public static final int	STANDARD = 0, BUDGET = 1, PREMIUM = 2, SUPER_PREMIUM = 3;
	
	public double loan() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}
	
	public double getRate() {
		System.out.println("The rate is " + bankRate);
		return this.bankRate;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyRate() {
		return loanValue * bankRate;
	}
	
	public void setValue(double loanValue) {
		if(loanValue < 0)
			throw new InvalidLoanValueException();
		else
		{
			this.loanValue = loanValue;
		}
	}
	
	public String to_string() {
		return "Loan: " + this.loanValue +"; rate: "+ this.bankRate +"; days active:" + daysActivePerYear +"; Type: " + bankAccountType +";";
	}
	
	public void print() {
		int vb = 10;
		System.out.println("This is an account");
	}

	public static double calculate(Account[] accounts)
	{
		double totalFee = 0.0;
		Account	account;
		int temp = 365;
		
		for	(int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if(account.bankAccountType == Account.PREMIUM || account.bankAccountType == Account.SUPER_PREMIUM)	
				totalFee += .0125 *	(//	1.25% broker's fee
						account.loanValue * Math.pow(account.bankRate, (account.daysActivePerYear / 365)) - account.loanValue);	//	interest-principal
		}
		return	totalFee;
	}

	public Account(double loanValue, double bankRate, int bankAccountType)  {
		if(loanValue < 0)
			throw new InvalidLoanValueException();
		else
		{
			this.loanValue = loanValue;
		}
		this.bankRate = bankRate;
		this.bankAccountType = bankAccountType;
	}

}
