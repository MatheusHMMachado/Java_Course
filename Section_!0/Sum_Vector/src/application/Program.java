package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of numbers to be added: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		double sum = 0.0;
		double average = 0.0;
		
		int ordinals = 1;
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Enter the %dº number: ", ordinals);
			vect[i] = sc.nextDouble();
			sum += vect[i];
			ordinals ++;
		}
		
		System.out.print("VALUES = ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		average = sum / n;
		
		System.out.println();
		System.out.printf("SUM = %.2f %n", sum);
		System.out.printf("AVERAGE = %.2f", average);
		sc.close();
	}

}
