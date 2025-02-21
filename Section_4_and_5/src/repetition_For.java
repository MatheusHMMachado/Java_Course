import java.util.Scanner;

public class repetition_For {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantas vezes deseja repetir?");
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<N; i++) {
			System.out.println("Informe um número para soma: ");
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		
		System.out.println(soma);

		sc.close();
	}
}
