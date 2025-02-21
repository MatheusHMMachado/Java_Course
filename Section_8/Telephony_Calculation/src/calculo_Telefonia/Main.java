package calculo_Telefonia;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int minute;
		double account = 50.0;
		
		System.out.println("Informe a quantidade de minutos consumidos: ");
		minute = sc.nextInt();
		
		account = (minute > 100) ? account + (minute - 100) * 2.0 : 50.0;
		
		System.out.printf("Valor da conta = R$%.2f%n", account);
		sc.close();
	}
}
