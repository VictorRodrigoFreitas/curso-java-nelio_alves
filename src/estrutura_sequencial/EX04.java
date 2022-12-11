package estrutura_sequencial;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 valores interios para calculo de difenreça: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int diferenca = (A*B - C*D);
		
		System.out.printf("Diferença = %d", diferenca);
		
		sc.close();
	}

}
