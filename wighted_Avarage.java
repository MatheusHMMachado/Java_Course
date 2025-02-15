import java.util.Locale;
import java.util.Scanner;

public class wighted_Avarage {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe o número de casos de teste:");
		int N = sc.nextInt();
		
		double N1 = 0.0;
		double N2 = 0.0;
		double N3 = 0.0;
		double[] wighted = new double[N];
		
		for (int i=0; i<N; i++) {
			System.out.println("Informe os valores a serem calculados:");
			N1 = sc.nextDouble();
			N2 = sc.nextDouble();
			N3 = sc.nextDouble();
			
			wighted[i] = ((N1*2.0) + (N2*3.0) + (N3*5.0)) / 10.0;
			
		}
		
		for (double numero : wighted) {
			System.out.printf( "%.1f %n", numero);
		}
		
		sc.close();
	}

}
