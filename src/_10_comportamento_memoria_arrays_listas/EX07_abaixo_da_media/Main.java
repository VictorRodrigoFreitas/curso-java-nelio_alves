package _10_comportamento_memoria_arrays_listas.EX07_abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° numero: ", i+1);
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		double media = soma / vetor.length;
		System.out.printf("%nMedia do vetor: %.3f%n"
				+ "Elementos abaixo da media:%n", media);
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
