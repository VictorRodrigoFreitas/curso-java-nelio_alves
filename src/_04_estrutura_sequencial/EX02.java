package _04_estrutura_sequencial;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int priNumero = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int segNumero = sc.nextInt();
		int soma = priNumero + segNumero;
		
		System.out.printf("Soma = %d", soma);
		
		sc.close();
	}
}
