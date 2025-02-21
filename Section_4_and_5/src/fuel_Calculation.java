import java.util.Scanner;
public class fuel_Calculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		int tipo_Combustivel = 0;
		
		System.out.println("++++++++++Registro de abastecimento++++++++++");
		System.out.println("[1]Gasolina");
		System.out.println("[2]Álcool");
		System.out.println("[3]Diesel");
		System.out.println("[4]Sair");
		tipo_Combustivel = sc.nextInt();
		
		if (tipo_Combustivel == 1) {
			gasolina += 1;
		}
		else if (tipo_Combustivel == 2) {
			alcool += 1;
		}
		else if (tipo_Combustivel == 3) {
			diesel += 1;
		}
		else {
			System.out.println("Muito obrigado!");
		}
		
		while (tipo_Combustivel < 4) {
			System.out.println("++++++++++Registro de abastecimento++++++++++");
			System.out.println("[1]Gasolina");
			System.out.println("[2]Álcool");
			System.out.println("[3]Diesel");
			System.out.println("[4]Sair");
			tipo_Combustivel = sc.nextInt();
			
			if (tipo_Combustivel == 1) {
				gasolina += 1;
			}
			else if (tipo_Combustivel == 2) {
				alcool += 1;
			}
			else if (tipo_Combustivel == 3) {
				diesel += 1;
			}
			else {
				System.out.println("++++++++++Quantidade de abastecimentos por combustível++++++++++");
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Alcool: " + alcool);
				System.out.println("Diesel: " + diesel);
			}
		}
		
		
		
		sc.close();
	}

}
