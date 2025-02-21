import java.util.Scanner;

public class factorial_Calculation {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o número a ser calculado: ");
		int N = sc.nextInt();
		int factorial = 1;
		
		for (int i=1; i<=N; i++) {
			factorial = factorial * i;
		}
		
		System.out.println(factorial);
			
		sc.close();
	}
}
