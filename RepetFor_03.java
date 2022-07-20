package Lista1;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int cont = 0;
		
		for (int i = 1; i<= 5; i++) {
			System.out.println("Informe um valor inteiro positivo: ");
			int valor = s.nextInt();
			
			boolean ehPrimo = true;
			for (int x = 2;x < valor;x++) {
				int resto = valor % x;
				if (resto==0) {
					ehPrimo = false;
					break;
				}
			}
			if(ehPrimo == true) {
				cont++;
			}
		}
		System.out.println("Você informou "+ cont +" números primos");
	}
}
