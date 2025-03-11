package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of numbers: ");
		int n = sc.nextInt();
		
		double[] realNumbers = new double[n];
		double highest = 0.0;
		int position = 0;
		
		for(int i=0; i<realNumbers.length; i++) {
			System.out.print("Enter with a number: ");
			realNumbers[i] = sc.nextDouble();
		}
		
		for (int i=0; i<realNumbers.length; i++) {
			if (i == 0) {
				highest = realNumbers[i];
				position = i;
			} else if(realNumbers[i] > realNumbers[i - 1]) {
				highest = realNumbers[i];
				position = i;
			}
		}
		
		
		System.out.println("MAIOR VALOR = " + highest);
		System.out.println("POSICAO DO MAIOR VALOR = " + position);
		
		
		sc.close();
	}
}
