package _04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do RAIO do circulo: ");
		double raio = sc.nextDouble();
		double PI = 3.14159;
		double area = PI * Math.pow(raio, 2.0);
		
		System.out.printf("Area = %.4f", area);
		
		sc.close();
	}

}
