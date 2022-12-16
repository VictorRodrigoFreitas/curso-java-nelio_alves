package _10_comportamento_memoria_arrays_listas.EX06_soma_vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		System.out.println("Digite os (inteiros) valores do vetor A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d° valor: ",i+1);
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os (inteiros) valores do vetor B: ");
		for (int i = 0; i < b.length; i++) {
			System.out.printf("%d° valor: ",i+1);
			b[i] = sc.nextInt();
		}
		
		System.out.println("Vetor resultante:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + b[i]);
		}
		
		sc.close();
	}

}
