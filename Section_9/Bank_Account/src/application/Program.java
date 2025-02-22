package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char choice = sc.next().charAt(0);
		System.out.println();
		
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			account = new Account(name, accountNumber, value);
			
			System.out.println();
			System.out.println("Account data:");
			System.out.println(account);
			System.out.println();
		} else {
			account = new Account(name, accountNumber);
			System.out.println("Account data:");
			System.out.println(account);
		}
	
		System.out.print("Enter a deposit value: ");
		account.depositBalance(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		account.withdrawalsBalance(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.print(account);
		
		sc.close();
	}
}
