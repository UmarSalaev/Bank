package lesson18.task2;

import java.util.Objects;
import java.util.Scanner;

public class Account {
	protected double accountNumber;
	protected double balance;
	private double deposit;

	public Account() {
	}

	

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public Account(double accountNumber, double balance, double deposit) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.deposit = deposit;
	}

	public void withdraw(int newBalance) {
		
		if (newBalance > 0) {
			this.balance = newBalance;
		} else {
			throw new RuntimeException("Баланс не может быть отрицательным");
		}
return;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, balance, deposit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Double.doubleToLongBits(accountNumber) == Double.doubleToLongBits(other.accountNumber)
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Double.doubleToLongBits(deposit) == Double.doubleToLongBits(other.deposit);
	}

	@Override
	public String toString() {
		return "Аккаунт: [Номер аккаунта = " + accountNumber + ", Баланс= " + balance + ", Депозит= " + deposit + "]";
	}

}
