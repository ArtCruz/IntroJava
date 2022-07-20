package Lista1;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] lista = new int[10];
		for(int i = 0;i<lista.length;i++) {
			System.out.println("Informe um valor: ");
			lista[i] = s.nextInt();
		}
		for(int i = 1;i<lista.length;i++) {
			lista[i] = lista[i] + lista[i-1];
		}
		for(int i = 0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		s.close();
	}

}
