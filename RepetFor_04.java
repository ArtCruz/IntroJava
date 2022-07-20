package Lista1;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int valor = s.nextInt();
		
		int fatorial = valor;
		
		for (int i = valor-1; i >=1;i--) {
			fatorial = fatorial * i;
		}
		System.out.println("O fatorial de " + valor +" é = " + fatorial);
	}

}
