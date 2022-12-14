package _08_introducao_poo.EX01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		
		System.out.print("Valor da base: ");
		retangulo.width = sc.nextDouble();
		System.out.print("Valor da altura: ");
		retangulo.height = sc.nextDouble();
		
		System.out.print(retangulo);
		
		sc.close();
		
	}

}
