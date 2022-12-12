package _06_estruturas_repetitivas;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de X: ");
		int X = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		int Y = sc.nextInt();

		while (X != 0 && Y != 0) {
			
			if (X > 0 && Y > 0) {
				System.out.println("Primeiro Quadrante");
			} else if (X < 0 && Y > 0) {
				System.out.println("Segundo Quadrante");
			} else if (X < 0 && Y < 0) {
				System.out.println("Terceiro Quadrante");
			} else if (X > 0 && Y < 0) {
				System.out.println("Quarto Quadrante");
			}
			System.out.printf("%nDigite o valor de X: ");
			X = sc.nextInt();
			System.out.print("Digite o valor de Y: ");
			Y = sc.nextInt();
		}

		sc.close();
	}

}
