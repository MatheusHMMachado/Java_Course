package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the vector: ");
		int n = sc.nextInt();
		
		double[] array = new double[n];
		double[] belowAverage = new double[n];
		double sumArray = 0.0;
		double averageArray = 0.0;
		
		for (int i=0; i<array.length; i++) {
			System.out.print("Enter with a number: ");
			array[i] = sc.nextDouble();
			
			sumArray += array[i];
		}
		
		averageArray = sumArray / array.length;
		System.out.print("Average of vector = " + averageArray);
		System.out.println("Elements below average: ");
		System.out.println();
		
		for (int i=0; i<array.length; i++) {
			if (array[i] < averageArray) {
				System.out.println(array[i]);
			}
		}
		
		
		
		sc.close();
	}
}
