package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?: ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		double paid = CurrencyConverter(price, dollars) + (CurrencyConverter(price, dollars) * 6 / 100);
		System.out.printf("Amount to be paid in reais = %.2f", paid);
		
		
		sc.close();
	}
	
	public static double CurrencyConverter(double price, double dollars) {
		return price * dollars;
	}
}
