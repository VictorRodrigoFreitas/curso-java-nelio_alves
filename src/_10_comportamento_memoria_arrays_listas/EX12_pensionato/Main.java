package _10_comportamento_memoria_arrays_listas.EX12_pensionato;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Aluno[] alunos = new Aluno[n];
		String[] rooms = new String[10];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.printf(
					"%nRent #%d:%n"
					+ "Name: ", i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			alunos[i] = new Aluno(nome, email);
			
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			rooms[quarto] = alunos[i].toString();
		}
		
		System.out.printf("%nBusy rooms:%n");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.printf("%d: %s%n", i, rooms[i]);
			}
		}
		
		sc.close();
	}

}
