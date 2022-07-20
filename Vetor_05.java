package Lista1;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] lista = new int[10];
		int pares= 0;
		for(int i =0;i<lista.length;i++) {
			System.out.println("informe um valor: ");
			lista[i] = s.nextInt();
			if(lista[i]%2==0) {
				pares+= 1;
			}
		}
		System.out.println("Existem "+pares+" valores pares na lista");
		
		s.close();
	}

}
