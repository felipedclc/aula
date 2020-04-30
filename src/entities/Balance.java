package entities;

public class Balance {

	private int account;
	private String holder;
	private double money;
	
	public Balance(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}

	public Balance(int account, String holder, double initialDeposit) {
		this.account = account;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getAccount() {
		return account;
	}

	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double totalValueInAccount() {
		return money;
	}

	public void deposit(double money) {
		this.money += money;
	}

	public void withdraw(double money) {
		this.money -= money + 5;
	}

	public String toString() {
		return "Account " + account + ", Holder: " + holder + ", Balance: $" + String.format("%.2f", money);
	}

}
