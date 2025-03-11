package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of people: ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		double[] heights = new double[n];
		String[] smallesTheight = new String[n];
		
		double sum = 0.0;
		double average = 0.0;
		double percent = 0.0;
		int cardinal = 1;

		//Trecho responsável por coletar as informações das pessoas
		for (int i=0; i<n; i++) {
			System.out.println("Enter with " + cardinal +"º person: ");
			System.out.print("Name: ");
			sc.nextLine();
			names[i] = sc.nextLine();
			System.out.print("Age: ");
			ages[i] = sc.nextInt();
			System.out.print("Height: ");
			heights[i] = sc.nextDouble();
			cardinal++;
			sum += heights[i];
			
			if (ages[i] < 16) {
				smallesTheight[i] = names[i];
			}
		}
		
		//Altura média das pessoas
		average = sum / n;
		
		//Trecho responsável por buscar no array "ages" a quantidade de idades menor que 16
		double ageSum = 0.0;
		for (int i=0; i<ages.length; i++) {
			if (ages[i] < 16) {
				ageSum++;
			}
		}
		
		//Calculo para porcentagem de pessoas menor que 16 anos
		percent = (ageSum / n) * 100;
		
	System.out.printf("Altura média: %.2f %n", average);
	System.out.println("Pessoas com menos de 16 anos: " + percent + "%");		
	for(int i=0; i<smallesTheight.length; i++) {
		if(smallesTheight[i] != null) {
			System.out.println(smallesTheight[i]);
		}
	}
		
		
		sc.close();
	}
}
