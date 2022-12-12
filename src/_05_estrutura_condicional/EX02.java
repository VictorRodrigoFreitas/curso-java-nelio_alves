package _05_estrutura_condicional;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro, para saber se é Par ou Impar: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		sc.close();
	}

}
