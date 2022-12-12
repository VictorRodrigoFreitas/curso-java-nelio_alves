package _06_estruturas_repetitivas;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor inteiro: ");
		int n = sc.nextInt();

		int in = 0, out = 0;
		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.printf(
				"%d in%n"
				+ "%d out%n",
				in, out
		);

		sc.close();
	}

}
