import java.util.Scanner;

public class pair_Division {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de divisões:");
		double N = sc.nextDouble();
		double X = 0.0;
		double Y = 0.0;
		double result = 0.0;
		
		for (int i=0; i < N; i++) {
			X = sc.nextDouble();
			Y = sc.nextDouble();
			
			if (Y == 0){
				System.out.println("divisão impossível.");
			} else { 
				result = X / Y; 
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
