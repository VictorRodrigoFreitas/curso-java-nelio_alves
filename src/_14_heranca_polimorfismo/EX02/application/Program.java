package _14_heranca_polimorfismo.EX02.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _14_heranca_polimorfismo.EX02.entities.Company;
import _14_heranca_polimorfismo.EX02.entities.Individual;
import _14_heranca_polimorfismo.EX02.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf(
					"Tax payer #%d data:%n"
					+ "Individual or company (i/c)? ", i+1);
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}

		}
		
		double sum = 0.0;
		System.out.printf("%nTaxes paid:%n");
		for (TaxPayer taxPayer : list) {
			System.out.printf("%s: $ %.2f%n", taxPayer.getName(), taxPayer.tax());
			sum += taxPayer.tax();
		}
		
		System.out.printf("%nTotal taxes: $ %.2f", sum);
		
		sc.close();
	}

}
