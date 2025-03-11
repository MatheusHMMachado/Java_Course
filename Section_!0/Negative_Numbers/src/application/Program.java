package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the number of numbers (Máx.10): ");
		int n = sc.nextInt();
		System.out.println();
		
		if (n > 10) {
			while (n < 1 || n > 10) {
				System.out.println("Error, maximum number of numbers must be 10");
				System.out.print("Enter the number of numbers (Máx.10): ");
				n = sc.nextInt();
				System.out.println();
			}
		}
		
		int[] array = new int[n];
		for (int i=0; i<array.length; i++) {
			System.out.print("Enter a number: ");
			array [i] = sc.nextInt();
			
		}
		
		System.out.println("NEGATIVE NUMBERS: ");
		for (int i=0; i<array.length; i++) {
			if(array[i] < 0) {
				System.out.println(array[i]);
			}
		}
	
		sc.close();
	}

}
