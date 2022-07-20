package Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");
		//Raiz de 16 16-1 = 15-3 = 12-5 = 7-7 = 0 (4)
		//17-1= 16-3= 13 -5 = 8-7 = 1-9 = -8 (5)
		//Entrada
		System.out.println("Calcular raiz? S/N");
		String continua = s.next();
		while (continua.equalsIgnoreCase("S")){
			System.out.println("Informe um inteiro positivo");
			int valor = s.nextInt();
			int cont = 0;
			int impar = 1;
			while (valor > 0){
				valor = valor - impar;
				cont++;
				impar+=2;
			}
			System.out.println("A raiz aproximada é: " + cont);
			System.out.println("Calcular raiz? S/N");
			continua = s.next();
			}
	}
}