package _10_comportamento_memoria_arrays_listas.EX04_numeros_pares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %d° numero: ", i+1);
			vetor[i] = sc.nextInt();
		}
		
		int totalPares = 0;
		System.out.printf("%nNumeros pares:%n");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				totalPares++;
			}
		}
		System.out.printf("%n%nQuantidade de pares = %d", totalPares);
		
		sc.close();
	}

}
