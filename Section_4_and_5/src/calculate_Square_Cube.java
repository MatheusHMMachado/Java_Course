import java.util.Scanner;

public class calculate_Square_Cube {

	public static void main(String[] args) {
		//Este trecho eu fiz
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe um número inteiro:");
		int N = sc.nextInt();
		int square = 0;
		int cube = 0;
	
		System.out.print(1 + " "); System.out.print(1 + " "); System.out.printf(1 + " %n");
		for (int i=2; i<=N; i++) {
			square = i * i;
			cube = i * i * i;
			System.out.printf(i + " "); System.out.print(square + " "); System.out.printf(cube + " %n");
		}
		
		/*Este trecho é da correção
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		*/
		sc.close();
	}

}
