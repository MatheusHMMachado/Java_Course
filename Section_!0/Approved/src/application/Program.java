package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] grade1 = new double[n];
		double[] grade2 = new double[n];
		
		
		int cardinal = 1;
		for (int i=0; i<n; i++) {
			System.out.printf("Enter the name, first and second grade of the %dst student: %n", cardinal);
			sc.nextLine();
			name[i] = sc.nextLine();
			grade1[i] = sc.nextDouble();
			grade2[i] = sc.nextDouble();
			cardinal ++;
		}
		
		String[] approved = new String[n];
		for (int i=0; i<n; i++) {
			if ((grade1[i] + grade2[i]) / 2 >= 6) {
				approved[i] = name[i];
			}
		}
		
		System.out.println("APPROVED STUDENTS: ");
		for (int i=0; i<approved.length; i++) {
			if (approved[i] != null) {
				System.out.println(approved[i]);
			}
		}
		
		sc.close();
	}

}
