package _09_construtores_this_sobrecarga_encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta;
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.println("Enter initial deposit value: ");
			double quantia = sc.nextDouble();
			conta = new Account(numeroConta, titular, quantia);
		} else {
			conta = new Account(numeroConta, titular);
		}
		
		System.out.printf("%nAccount data:%n%s%n%n",conta.toString());
		
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.deposit(deposito);
		System.out.printf("Updated account data:%n%s%n%n",conta.toString());
		
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.withdraw(saque);
		System.out.printf("Updated account data:%n%s%n",conta.toString());
		
		sc.close();
	}

}
