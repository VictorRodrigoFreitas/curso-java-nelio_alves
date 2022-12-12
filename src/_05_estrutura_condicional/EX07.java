package _05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do eixo X: ");
		double X = sc.nextDouble();
		System.out.print("Digite o valor do eixo Y: ");
		double Y =sc.nextDouble();
		
		if (X > 0 && Y > 0) {
			System.out.println("Q1");
		} else if(X < 0 && Y > 0) {
			System.out.println("Q2");
		} else if(X < 0 && Y < 0) {
			System.out.println("Q3");
		} else if(X > 0 && Y < 0) {
			System.out.println("Q4");
		} else if(X == 0 && Y == 0) {
			System.out.println("Origem");
		} else if(X == 0 && Y > 0 || Y < 0) {
			System.out.println("Eixo Y");
		} else if(X < 0 || X > 0 && Y == 0) {
			System.out.println("Eixo X");
		}
		
		sc.close();
	}

}
