package _10_comportamento_memoria_arrays_listas.EX02_soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° numero: ", i+1);
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		System.out.printf("%nValores =");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf(" %.1f",vetor[i]);
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		System.out.printf(
				"%nSoma = %.2f%n"
				+ "Media = %.2f", soma, media);
		
		sc.close();
	}

}
