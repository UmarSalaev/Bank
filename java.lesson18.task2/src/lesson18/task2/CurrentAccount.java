package lesson18.task2;

import java.util.Objects;

public class CurrentAccount extends Account {
	private double overdraftLimit;

	public CurrentAccount() {}
	
	

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public  CurrentAccount(double accountNumber,double balance,double deposit) {
		super(accountNumber, balance, deposit);
	}

	public  double overdraftLimit(double amount) {
		double newBalance = balance - amount;
		if (newBalance > 0 - overdraftLimit) {
			setBalance(newBalance);
		} else {
			throw new RuntimeException("Вы зашли за рамки положенного овердрафта");
		}
		return newBalance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(overdraftLimit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrentAccount other = (CurrentAccount) obj;
		return Double.doubleToLongBits(overdraftLimit) == Double.doubleToLongBits(other.overdraftLimit);
	}

	@Override
	public String toString() {
		return "CurrentAccount{" + "id=" + accountNumber + ", balance=" + balance + ", overdraftLimit=" + overdraftLimit
				+ '}';
	}

}
