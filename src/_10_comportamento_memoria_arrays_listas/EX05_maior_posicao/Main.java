package _10_comportamento_memoria_arrays_listas.EX05_maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		double maior = 0.0;
		int posicao = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° numero: ", i+1);
			vetor[i] = sc.nextDouble();
			
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		
		System.out.printf("%nMaior valor = %.1f%n"
				+ "Posição do maior valor = %d%n", maior, posicao);
		
		sc.close();
	}

}
