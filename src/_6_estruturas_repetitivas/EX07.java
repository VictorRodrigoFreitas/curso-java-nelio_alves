package _6_estruturas_repetitivas;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão impossivel");
			} else {
				double divisao = (double) x / y;
				System.out.println(divisao);
			}
		}
		
		sc.close();
	}

}
