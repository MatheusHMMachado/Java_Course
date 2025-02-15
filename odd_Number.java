import java.util.Scanner;

public class odd_Number {
	public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int x = sc.nextInt();
	int odd = 0;
	
	for (int i=1; i<=x; i++) {
		if (i % 2 != 0) {
			System.out.println(i);
		}
	}
	
	sc.close();
	}
}
