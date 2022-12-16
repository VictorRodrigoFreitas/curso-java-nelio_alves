package _10_comportamento_memoria_arrays_listas.EX08_media_pares;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		int soma = 0;
		int quantidadePares = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° numero: ", i+1);
			vetor[i] = sc.nextInt();
			
			if (vetor[i] %2 == 0) {
				soma += vetor[i];
				quantidadePares++;
			}
		}
		
		double media = (double) soma / quantidadePares;
		if (quantidadePares > 0) {
			System.out.printf("Media dos pares = %.1f%n", media);
		} else {
			System.out.println("Nenhum numero par");
		}
		
		sc.close();
	}
}
