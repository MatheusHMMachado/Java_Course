package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter with a quantity of numbers: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		int numbers = 1;
		for (int i=0; i<n; i++) {
			System.out.printf("Enter with number %d: ", numbers);
			vect[i] = sc.nextDouble();
			numbers ++;
		}
		
		double sum = 0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f", avg);
		sc.close();
	}

}
