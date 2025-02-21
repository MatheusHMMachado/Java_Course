package formula_Baskara;

public class Main {
	public static void main (String [] args){
		//Fórmula de báskara
		double delta;
		double b = 0;
		double c = 0;
		double a = 0;
	    double x1;
	    double x2;
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
	}

}
