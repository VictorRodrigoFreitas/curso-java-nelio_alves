package _10_comportamento_memoria_arrays_listas.EX13_list_aumento_salario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		Integer n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf(
					"Employee #%d%n"
					+ "Id: ", i+1);
			Integer id = sc.nextInt();
			while (hasId(employees, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.printf("%nEnter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();
		
		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.printf("%nList of employees:%n");
		for (Employee e : employees) {
			System.out.println(e.toString());
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
