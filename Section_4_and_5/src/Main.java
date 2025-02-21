import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int hour = 1;
		
		while (hour >= 0) {
			System.out.println("Quantas horas?");
			hour = sc.nextInt();
			
			if (hour < 12) {
				System.out.println("Bom dia!");
			}
			else if (hour >= 12 && hour <= 18 ) {
				System.out.println("Boa tarde!");
			}
			else if (hour > 18) {
				System.out.println("Boa noite!");
			}
		}
		*/
		int number = 1;
		int soma = 0;
		
		while (number >= 1) {
			System.out.println("Digite um número: ");
			number = sc.nextInt();
			soma += number;
		}
		
		System.out.println("A soma dos valores digitados é: " + soma);
		sc.close();
		}

}
 