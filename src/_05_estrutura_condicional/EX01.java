package _05_estrutura_condicional;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero inteiro, para saber se é negativo: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não negativo");
		}

		sc.close();
	}

}
