package _10_comportamento_memoria_arrays_listas.EX10_aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Aluno[] aluno = new Aluno[n];
		
		for (int i = 0; i < aluno.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d° aluno: ", i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite a Primeira nota: ");
			double primeiraNota = sc.nextDouble();
			System.out.print("Digite a Segunda nota: ");
			double segundaNota = sc.nextDouble();
			
			aluno[i] = new Aluno(nome, primeiraNota, segundaNota);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < aluno.length; i++) {
			if (aluno[i].media() >= 6.0) {
				System.out.println(aluno[i].getNome());
			}
		}
		
		sc.close();
	}

}
