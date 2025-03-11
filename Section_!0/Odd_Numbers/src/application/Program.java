package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter the number of even numbers: ");
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		int[] odd = new int[n];
		int counter = 0;
		
		for(int i=0; i<odd.length; i++) {
			System.out.print("Enter with number: ");
			numbers[i] = sc.nextInt();
			
			if(numbers[i] % 2 == 0) {
				odd[i] = numbers[i];
				counter++;
			}
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		for (int i=0; i<odd.length; i++) {
			if (odd[i] != 0){
				System.out.print(odd[i] + " ");
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + counter);
		sc.close();
	}
}
