package calculo_Area;

public class Main {
	public static void main (String [] args) {
		//Cálculo de Área
		float b, B, h, area;
		int j;
		
		b = 6f;
		B = 8f;
		h = 5f;
		j = (int) h;
		
		area = (b + B) / 2f * h;
		
		System.out.println(area);
		System.out.println(j);
	}
}
