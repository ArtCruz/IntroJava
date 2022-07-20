package Lista1;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] a = new String[5];
		String[] b = new String[5];
		
		
		for (int i = 0; i< a.length; i++){
			System.out.println("Informe uma letra do alfabeto");
			a[i] = s.next();
		}
		for (int i = 0; i< b.length; i++){
			System.out.println("Informe uma letra do alfabeto");
			b[i] = s.next();
		}
		//a = a b c d e
		//b = a b c e d
		//Definir se os vetores são iguais
		boolean saoIguais = true;
		for (int i = 0; i< a.length; i++){
			int index = -1;
			for (int x = 0; x < b.length; x++)
				if (a[i].equalsIgnoreCase(b[x]))
					index = x;

			if (index < 0) {
				saoIguais = false;
				break;
			}
		}
		if (!saoIguais)
			System.out.println("Os vetores são diferentes");
		else
			System.out.println("Os vetores são iguais");
		s.close();
	}
}
