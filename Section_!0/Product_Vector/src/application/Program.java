package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Enter with number of products: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Enter with product Name: ");
			String name = sc.nextLine();
			System.out.print("Enter with product Price: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double average = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f", average);
		sc.close();
	}

}
