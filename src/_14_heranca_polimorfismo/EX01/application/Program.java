package _14_heranca_polimorfismo.EX01.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _14_heranca_polimorfismo.EX01.entities.ImportedProduct;
import _14_heranca_polimorfismo.EX01.entities.Product;
import _14_heranca_polimorfismo.EX01.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf(
					"Product #%d data:%n"
					+ "Common, used or imported (c/u/i)? ", i+1);
			char response = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (response == 'c') {
				list.add(new Product(name, price));
				
			} else if (response == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customsFee));
				
			} else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());

				list.add(new UsedProduct(name, price, manufactureDate));
			}
			
		}
		
		System.out.printf("%nPRICE TAGS:%n");
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
