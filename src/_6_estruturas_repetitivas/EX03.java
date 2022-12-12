package _6_estruturas_repetitivas;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf(
				"1.Álcool%n"
				+ "2.Gasolina%n"
				+ "3.Diesel%n"
				+ "4.Fim%n"
				+ "Digite o codigo do combustivel de sua preferencia: "
		);
		int codigo = sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while (codigo != 4) {
			
			switch (codigo) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;

			default:
				break;
			}
			
			codigo = sc.nextInt();
		}
		
		System.out.printf(
				"Muito Obrigado%n"
				+ "Alcool: %d%n"
				+ "Gasolina: %d%n"
				+ "Diesel: %d%n",
				alcool, gasolina, diesel
		);
		
		sc.close();
		
	}

}
