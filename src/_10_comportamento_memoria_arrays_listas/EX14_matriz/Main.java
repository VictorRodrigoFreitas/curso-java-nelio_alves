package _10_comportamento_memoria_arrays_listas.EX14_matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantidade de linhas da matriz: ");
		Integer l = sc.nextInt();
		System.out.print("Digite quantidade de colunas da matriz: ");
		Integer c = sc.nextInt();
		
		Integer[][] matriz = new Integer[l][c];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("[%d][%d]:", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("%nMatriz:%n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("Digite um valor (inteiro): ");
		int x = sc.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.printf("%nPosition: %d,%d%n", i, j);
					if (j != 0) {
						System.out.printf("Left: %d%n", matriz[i][j-1]);
					}
					if (j != c-1) {
						System.out.printf("Right: %d%n", matriz[i][j+1]);
					}
					if (i != 0) {
						System.out.printf("Up: %d%n", matriz[i-1][j]);
					}
					if (i != l-1) {
						System.out.printf("Down: %d%n", matriz[i+1][j]);
					}
				}
			}
		}		
		
		sc.close();
	}

}
