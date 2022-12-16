package _10_comportamento_memoria_arrays_listas.EX11_dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

import _10_comportamento_memoria_arrays_listas.EX03_alturas.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Altura da %d° pessoa: ", i+1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %d° pessoa: ", i+1);
			char genero = sc.next().charAt(0);
			
			pessoa[i] = new Pessoa(altura, genero);
		}
		
		double menorAltura = pessoa[0].getAltura(), maiorAltura = 0.0, somaAlturaMulheres = 0.0;
		int quantidadeMulheres = 0, quantidadeHomens = 0;
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getAltura() < menorAltura) {
				menorAltura = pessoa[i].getAltura();
			}
			
			if (pessoa[i].getAltura() > maiorAltura) {
				maiorAltura = pessoa[i].getAltura();
			}
			
			if (pessoa[i].getGenero() == 'F') {
				somaAlturaMulheres += pessoa[i].getAltura();
				quantidadeMulheres++;
			}
			
			if (pessoa[i].getGenero() == 'M') {
				quantidadeHomens++;
			}
		}
		double mediaAlturaMulheres = somaAlturaMulheres / quantidadeMulheres;
		System.out.printf(
				"Menor altura = %.2f%n"
				+ "Maior altura = %.2f%n"
				+ "Media das alturas das mulheres = %.2f%n"
				+ "Numero de homens = %d%n",
				menorAltura, maiorAltura, mediaAlturaMulheres, quantidadeHomens);
		
		sc.close();
	}

}
