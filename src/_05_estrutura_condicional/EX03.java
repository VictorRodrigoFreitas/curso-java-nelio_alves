package _05_estrutura_condicional;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 2 valores e descubra se sao ou nao multiplos: ");
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();
	}

}
