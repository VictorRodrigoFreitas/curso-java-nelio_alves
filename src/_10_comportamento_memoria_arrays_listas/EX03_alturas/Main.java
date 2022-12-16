package _10_comportamento_memoria_arrays_listas.EX03_alturas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %d° pessoa:%n"
					+ "Nome:", i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			pessoa[i] = new Pessoa(nome, idade, altura);
		}
		
		double soma = 0.0;
		int menores = 0;
		for (int i = 0; i < pessoa.length; i++) {
			soma += pessoa[i].getAltura();
			
			if (pessoa[i].getIdade() < 16) {
				menores++;
			}
		}
		double media = soma / pessoa.length;
		double percentualMenores = ((double)menores / pessoa.length) * 100.0;
		
		System.out.printf("%nAltura média: %.2f%n"
				+ "Pessoas com menos de 16 anos: %.1f%%\n",
				media, percentualMenores);
		

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		
		sc.close();
		
	}

}
