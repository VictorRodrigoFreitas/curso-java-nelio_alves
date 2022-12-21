package _15_tratamento_excecoes.application;

import java.util.Locale;
import java.util.Scanner;

import _15_tratamento_excecoes.model.entities.Account;
import _15_tratamento_excecoes.model.exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf(
				"Enter account data%n" + 
				"Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, initialBalance, withdrawLimit);

		System.out.printf("%nEnter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			account.withDraw(amount);
			System.out.printf("New balance: %.2f%n", account.getBalance());

		}
		catch(WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} 
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}
