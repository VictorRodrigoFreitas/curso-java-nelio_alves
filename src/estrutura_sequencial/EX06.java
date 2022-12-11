package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Codigo primeira peça: ");
		int codigoPeca1 = sc.nextInt();
		System.out.print("Quantidade da primeira peça: ");
		int quantidadePecas1 = sc.nextInt();
		System.out.print("Valor primeira peça: ");
		double valorPeca1 = sc.nextDouble();
		
		System.out.print("Codigo segunda peça: ");
		int codigoPeca2 = sc.nextInt();
		System.out.print("Quantidade da segunda peça: ");
		int quantidadePecas2 = sc.nextInt();
		System.out.print("Valor segunda peça: ");
		double valorPeca2 = sc.nextDouble();
		
		double total = quantidadePecas1 * valorPeca1 + quantidadePecas2 * valorPeca2;
		System.out.printf("%nValor a pagar: R$%.2f", total);
		
		
		sc.close();
	}

}
