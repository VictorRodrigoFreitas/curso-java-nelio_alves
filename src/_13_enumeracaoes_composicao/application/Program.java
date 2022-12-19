package _13_enumeracaoes_composicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import _13_enumeracaoes_composicao.entities.Client;
import _13_enumeracaoes_composicao.entities.Order;
import _13_enumeracaoes_composicao.entities.OrderItem;
import _13_enumeracaoes_composicao.entities.OrderStatus;
import _13_enumeracaoes_composicao.entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.printf(
				"Enter cliente data:%n"
				+ "Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		System.out.printf(
				"Enter order data:%n"
				+ "Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		Date moment = new Date();
		
		Order order = new Order(moment, OrderStatus.valueOf(status.toUpperCase()), new Client(name, email, birthDate));
		
		System.out.print("How many items to this order? ");
		Integer quantityItems = sc.nextInt();
		
		for (int i = 0; i < quantityItems; i++) {
			System.out.printf("Enter #%d item data%n"
					+ "Product name: ", i+1);
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
			order.addItem(orderItem);	
		}
		
		System.out.printf("%nOrder Summary:%n");
		System.out.println(order.toString());
		
		
		sc.close();
	}

}
