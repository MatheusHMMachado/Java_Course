package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of people to be entered: ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		int counter = 1;
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: %n", counter);
			System.out.print("Name: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.printf("Age: ");
			age[i] = sc.nextInt();
			
			counter ++;
		}
		
		String nameOld = "";
		
		for (int i=0; i<n; i++) {
			int index = 0;
			if (i != 0) {
				index = i - 1;
			}
			
			if (age[i] > age[i - 1] || i == 0) {
				nameOld = name[i];
			}
		}
		
		System.out.println("OLDER PERSON = " + nameOld);
		
		
		sc.close();
	}

}
