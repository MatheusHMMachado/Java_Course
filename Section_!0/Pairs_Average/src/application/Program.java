package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of even numbers in the array: ");
		int n = sc.nextInt();
		
		double[] array = new double[n];
		double sumArray = 0.0;
		double averageArray = 0.0;
		double evenNumbers = 0.0;
		
		for (int i=0; i<array.length; i++) {
			System.out.print("Enter with a number: ");
			array[i] = sc.nextDouble();
			
			if (array[i] % 2 == 0) {
				sumArray += array[i];
				evenNumbers ++;
			}
			
		}
		
		if (sumArray > 0) {
			averageArray = sumArray / evenNumbers;
			
			System.out.printf("PEER AVERAGE: %.1f", averageArray);
		} else {
			System.out.println("!!NO EVEN NUMBER!!");
		}
	
		sc.close();
	}

}
