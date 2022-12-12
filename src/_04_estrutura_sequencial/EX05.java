package _04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de identificação funcionario: ");
		int idFuncionario = sc.nextInt();
		System.out.print("Quantidade de horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.print("Valor por hora trabalhada: ");
		double salarioHora = sc.nextDouble();
		double salarioTotal = horasTrabalhadas * salarioHora;
		System.out.printf(
				"Number = %d%n"
				+ "Salary = U$ %.2f%n",idFuncionario, salarioTotal);
		
		sc.close();
	}

}
