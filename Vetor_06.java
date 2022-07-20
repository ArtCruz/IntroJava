package Lista1;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] lista = new int[10];
		
		for(int i = 0;i< lista.length;i++) {
			System.out.println("Informe um valor: ");
			int valor = s.nextInt();
			if(valor>=0) {
				lista[i] = valor;
			}
			if(valor<0) {
				valor = 0;
				lista[i] = valor;
			}
		}
		for(int i = 0;i< lista.length;i++) {
			System.out.println(lista[i]);
		}
		s.close();
	}

}
