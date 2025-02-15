import java.util.Scanner;

public class verify_Passowrd {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int senha = 0;
		
		System.out.println("Verificação de senha");
		System.out.println("Informe a senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha incorreta.");
			System.out.println("Informe a senha: ");
			senha = sc.nextInt();		
		}
		
		System.out.println("Senha correta!");
		
		sc.close();
	}	
}
