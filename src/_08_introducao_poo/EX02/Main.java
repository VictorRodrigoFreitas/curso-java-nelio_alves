package _08_introducao_poo.EX02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empregado = new Employee();
		double percentual;
		
		System.out.print("Nome: ");
		empregado.name = sc.nextLine();
		
		System.out.print("Salario bruto: ");
		empregado.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto: ");
		empregado.tax = sc.nextDouble();
		
		System.out.println("Empregado: " + empregado);
		
		System.out.printf("Qual percentual para aumentar o salário? ");
		percentual = sc.nextDouble();
		empregado.increaseSalary(percentual);
		
		System.out.println("Dados atualizados: " + empregado);
		
		sc.close();

	}
}
