package _06_estruturas_repetitivas;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int x = sc.nextInt();

		for (int i = 0; i <= x; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
