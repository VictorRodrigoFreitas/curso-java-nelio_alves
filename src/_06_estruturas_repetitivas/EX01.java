package _06_estruturas_repetitivas;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha invalida!");
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
		}
		System.out.print("Acesso permitido!");

		sc.close();
	}

}
