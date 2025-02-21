package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Products Product;
		Product = new Products();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		Product.name = sc.next();
		System.out.print("Price: ");
		Product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		Product.quantity = sc.nextInt();
		
		System.out.printf("%nProduct data: " + Product + "%n");
		
		System.out.printf("%nEnter the number of products to be added in stock: ");
		Product.addProducts(sc.nextInt());
		System.out.printf("%nUpdated data: " + Product + "%n");
		
		System.out.printf("%nEnter the number of products to be removed from stock: ");
		Product.removeProducts(sc.nextInt());
		System.out.printf("%nUpdated data: " + Product);
		sc.close();
	}
}
