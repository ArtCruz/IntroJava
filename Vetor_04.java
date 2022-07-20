package Lista1;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] lista = new int[20];
		for(int i = 0;i <lista.length;i++) {
			System.out.println("Informe um valor para a posição "+ i);
			lista[i] = s.nextInt();
		}
		System.out.println("Informe um valor para saber se o mesmo se encontra na lista: ");
		int valor = s.nextInt();
		int pos = (lista.length+1);
		
		for(int i= 0;i<lista.length;i++) {
			if(valor == lista[i]) {
				pos = lista[i];
				System.out.println("O valor "+valor+" foi encontrado na posição "+ i);
			}
		}
		if(pos==(lista.length+1))
			System.out.println("o valor "+valor+" não se necontra na lista");
		s.close();
	}

}
