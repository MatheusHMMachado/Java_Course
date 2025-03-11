package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the quantity of peoples: ");
		int n = sc.nextInt();
		
		double[] height = new double[n];
		char[] gender = new char[n];
		
		int cardinal = 1;
		for (int i=0; i<n; i++) {
			System.out.printf("Height of %dº people: ", cardinal);
			height[i] = sc.nextDouble();
			System.out.printf("Gender of %dº people (M/F): ", cardinal);
			sc.nextLine();
			gender[i] = sc.next().charAt(0);
			
			cardinal ++;
		}
		
		double sumHeight = 0.0;
		int numberWomen = 0;
		double greaterHeight = 0.0;
		double shorterHeight = 0.0;
		double averageWomen = 0.0;
		int numberMen = 0;
		
		int positionBigger = 0;
		int positionLess = 1;
		for (int i=0; i<n; i++) {
			if (i > 0) {
				positionBigger = i - 1;
			}
			
			 if (height[i] < height[positionBigger]) {
				 shorterHeight = height[i];
			 }
			 
			 if (height[i] > height[positionLess]) {
				 greaterHeight = height[i];
			 }
			 
			 if (gender[i] == 'F') {
				 sumHeight += height[i];
				 numberWomen++;
			 }
			 
			 if (gender[i] == 'M') {
				 numberMen ++;
			 }
			 
			 if (positionLess < 4) {
				 positionLess ++;
			 }
			 
		}
		
		averageWomen = sumHeight / numberWomen;
		
		System.out.printf("Shorter Height = %.2f %n", shorterHeight);
		System.out.printf("Greater Height = %.2f %n", greaterHeight);
		System.out.printf("Average height of women = %.2f %n", averageWomen);
		System.out.printf("Number of Men's = %d", numberMen);
		
		
		sc.close();
	}

}
