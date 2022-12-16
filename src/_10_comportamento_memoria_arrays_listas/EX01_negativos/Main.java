package _10_comportamento_memoria_arrays_listas.EX01_negativos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? (Maximo = 10)");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° numero: (inteiro)", i+1);
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
