package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Balance;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Balance balance;

		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit? (y/n)");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			balance = new Balance(account, holder, initialDeposit);
			}
		else {
			balance = new Balance(account, holder);
		}

		System.out.print("\nAccount data: \n" + balance);

		System.out.println();
		System.out.print("\nEnter a deposit vallue: ");
		double money = sc.nextDouble();
		balance.deposit(money);

		System.out.print("\nAccount data: \n" + balance);

		System.out.println();
		System.out.print("\nEnter a withdraw value: ");
		money = sc.nextDouble();
		balance.withdraw(money);

		System.out.print("\nAccount data: \n" + balance);

		sc.close();
	}

}