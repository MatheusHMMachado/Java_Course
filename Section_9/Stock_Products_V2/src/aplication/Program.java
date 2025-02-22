package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//Iniciei as variáveis necessárias para alocar temporariamente os valores informados pelo usuário.
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		//Criei um objeto Product do tipo Products. 
		//Instanciei o objeto Product passando como parâmetro os valores contidos nas variáveis iniciadas acima.
		Products Product = new Products(name, price, quantity);
		
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
