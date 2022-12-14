package _08_introducao_poo.EX03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student estudante = new Student();

		System.out.print("Nome aluno: ");
		estudante.nomeAluno = sc.nextLine();

		System.out.print("Nota primeiro trimestre: ");
		estudante.notaPrimeiroTrimestre = sc.nextDouble();

		System.out.print("Nota segundo trimestre: ");
		estudante.notaSegundoTrimestre = sc.nextDouble();

		System.out.print("Nota terceiro trimestre: ");
		estudante.notaTerceiroTrimestre = sc.nextDouble();

		System.out.printf("Nota final: %.2f%n", estudante.notaFinal());

		if (estudante.notaFinal() < 60.0) {
			System.out.println("Reprovado!");
			System.out.printf("Faltou %.2f pontos para aprovação!%n", estudante.aprovado());
		} else {
			System.out.println("Aprovado!");
		}

		sc.close();

	}


}
