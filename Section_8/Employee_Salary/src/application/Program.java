package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee;
		employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		
		System.out.printf("Employe: %s, $ %.2f%n", employee.name, employee.netSalary());
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		System.out.printf("Updated data: %s , $ %.2f%n", employee.name, employee.netSalary());
		
		sc.close();
	}

}
