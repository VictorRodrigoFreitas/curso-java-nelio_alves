package _04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		double A = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		double B = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		double C = sc.nextDouble();
		
		double PI = 3.14159;
		double triangulo = A * C / 2;
		double circulo = PI * Math.pow(C, 2.0);
		double trapezio = (A + B)*C/2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.printf(
				"%nTriangulo: %.3f%n"
				+ "Circulo: %.3f%n"
				+ "Trapezio: %.3f%n"
				+ "Quadrado: %.3f%n"
				+ "Retangulo: %.3f%n", triangulo, circulo, trapezio, quadrado, retangulo);
		
		sc.close();
	}

}
