package lesson18.task2;

import java.util.Scanner;

import java.util.Objects;

public class SavingAccount extends Account {
	private double interestRate;
	private double depositTermMonth;

	public SavingAccount() {}
	

	

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getDepositTermMonth() {
		return depositTermMonth;
	}

	public void setDepositTermMonth(double depositTermMonth) {
		this.depositTermMonth = depositTermMonth;
	}

	public void addInterest(double addInterest) {
		Scanner sc = new Scanner(System.in);
		addInterest = sc.nextDouble();
		if (addInterest >= 0) {
			interestRate += addInterest;
		} else {
			throw new RuntimeException("ss");
		}

	}
	public SavingAccount(double accountNumber, double balance, double deposit) {
		super(accountNumber, balance, deposit);
		this.interestRate = 0.5;
		return;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(interestRate);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		return Double.doubleToLongBits(interestRate) == Double.doubleToLongBits(other.interestRate);
	}



}
