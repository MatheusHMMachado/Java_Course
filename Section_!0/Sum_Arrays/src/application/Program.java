package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
 public static void main (String[] args) {
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter the number of numbers in each vector: ");
	 int n = sc.nextInt();
	 
	 int[] A = new int[n];
	 int[] B = new int[n];
	 int[] C = new int[n];
	 
	 System.out.println("Enter with a values of vector A: ");
	 for (int i=0; i<A.length; i++) {
		 A[i] = sc.nextInt();
	 }
	 
	 System.out.println("Enter with a values of vector B: ");
	 for (int i=0; i<B.length; i++) {
		 B[i] = sc.nextInt();
	 }
	 
	 System.out.println("VECTOR RESULT: ");
	 for (int i=0; i<C.length; i++) {
		 C[i] = A[i] + B[i];
		 System.out.println(C[i]);
	 }
	 sc.close();
 }
}
