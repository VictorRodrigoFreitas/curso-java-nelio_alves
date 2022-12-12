package _05_estrutura_condicional;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a hora inicial do jogo: ");
		int horaInicial = sc.nextInt();
		System.out.print("Digite a hora final do jogo: ");
		int horaFinal = sc.nextInt();

		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.printf("O jogo durou %d hora(s).", duracao);

		sc.close();
	}

}
