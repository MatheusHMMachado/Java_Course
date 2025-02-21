package cadastro_Estudante;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Student data
		Scanner sc = new Scanner(System.in);
		
		String studentName;
		int studentID;
		int studentAge;
		float studentFree;
		char studentClassification;
		int choice;
		
		System.out.println("Deseja Cadastrar um novo estudante?");
		System.out.println("[1]Sim");
		System.out.println("[2]Não");
		choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println("++++++++++Cadastro de estudantes++++++++++");
			System.out.print("*ID: ");
			studentID = sc.nextInt();
			System.out.print("*Nome: ");
			studentName = sc.next();
			System.out.print("*Idade: ");
			studentAge = sc.nextInt();
			System.out.print("*Média: ");
			studentFree = sc.nextFloat();
			System.out.print("*Classificação: ");
			studentClassification = sc.next().charAt(0);
			
			//print variables
			System.out.println("++++++++++Estudante Cadastrado++++++++++");
			System.out.println("Estudante: " + studentName);
			System.out.println("ID: " + studentID);
			System.out.println("Idade: " + studentAge);
			System.out.printf("Média: %.2f%n", studentFree);
			System.out.println("Classificação: " + studentClassification);
		} else {
			System.out.println("Sair do sistema?");
			System.out.println("[1]Sim");
			System.out.println("[2]Não");
			choice = sc.nextInt();		
			}
		
		sc.close();
	}
}
