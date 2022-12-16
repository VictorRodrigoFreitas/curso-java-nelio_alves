package _10_comportamento_memoria_arrays_listas.EX09_mais_velho;

import java.util.Scanner;

import _10_comportamento_memoria_arrays_listas.EX03_alturas.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoa =new Pessoa[n];
		
		int maiorIdade = 0;
		int posicao = 0;
		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %d° pessoa:%n"
					+ "Nome: ", i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			pessoa[i] = new Pessoa(nome, idade);
			
			if (pessoa[i].getIdade() > maiorIdade) {
				maiorIdade = pessoa[i].getIdade();
				posicao = i;
			}
		}
		
		System.out.printf("Pessoa mais velha: %s", pessoa[posicao].getNome());
		
		sc.close();
	}

}
